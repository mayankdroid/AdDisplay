package example.com.addisplay;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import example.com.addisplay.bean.Ad;
import example.com.addisplay.ui.R;
import example.com.addisplay.utils.ImageLoader;

/**
 * Created by Admin on 8/1/2016.
 */
public class DisplayAdsCustomAdapter extends ArrayAdapter<Ad> {
    private List<Ad> ads;
    private LayoutInflater inflater;
    private ImageLoader imageLoader;
    private Context context;


    public DisplayAdsCustomAdapter(Context context, List<Ad> ads) {

        super(context, R.layout.displayad_individual_row);
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.ads = ads;
        this.context = context;
        imageLoader = new ImageLoader(context);
    }


    @Override
    public int getCount() {
        return ads.size();
    }

    @Override
    public Ad getItem(int position) {
        return ads.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
        final Ad ad = ads.get(position);

        if (convertView == null || convertView.getTag() == null) {
            // no view to reuse so inflate from XML
            view = inflater.inflate(R.layout.displayad_individual_row, parent, false);
            ViewHolder viewHolder = setupViewHolder(view);
            view.setTag(viewHolder);
        } else {
            view = convertView;
        }

        final ViewHolder holder = (ViewHolder) view.getTag();

        holder.actionButton.setText(ad.getCallToAction());
        holder.categoryName.setText(ad.getCategoryName());
        holder.minOSVersion.setText(ad.getMinOSVersion() + " above");
        holder.numberOfRatings.setText(ad.getNumberOfRatings());
        holder.productDescription.setText(ad.getProductDescription());
        holder.productName.setText(ad.getProductName());
        holder.rating.setText(ad.getRating());
        holder.actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse(ad.getClickProxyURL()));
                context.startActivity(i);
            }
        });

        imageLoader.DisplayImage(ad.getAverageRatingImageURL() , holder.averageRatingImage);
        imageLoader.DisplayImage(ad.getProductThumbnail() , holder.productThumbnail);
        holder.averageRatingImage.setBackgroundResource(R.drawable.rating);

        return view;
    }


    static class ViewHolder {

        private TextView categoryName;
        private TextView minOSVersion;
        private TextView numberOfRatings;
        private TextView productDescription;
        private TextView productName;
        private TextView rating;
        private Button actionButton ;

        private ImageView averageRatingImage;
        private ImageView productThumbnail;

    }


    private ViewHolder setupViewHolder(final View view) {
        final ViewHolder viewHolder = new ViewHolder();
        viewHolder.categoryName = (TextView) view.findViewById(R.id.categoryNamevalue);
        viewHolder.minOSVersion = (TextView) view.findViewById(R.id.minOSVersionvalue);
        viewHolder.numberOfRatings = (TextView) view.findViewById(R.id.numberOfRatingsvalue);
        viewHolder.productDescription = (TextView) view.findViewById(R.id.productDescriptionvalue);
        viewHolder.productName = (TextView) view.findViewById(R.id.productNamevalue);
        viewHolder.rating = (TextView) view.findViewById(R.id.ratingvalue);
        viewHolder.actionButton = (Button)view.findViewById(R.id.action_button);

        viewHolder.averageRatingImage = (ImageView) view.findViewById(R.id.averageRatingImage);
        viewHolder.productThumbnail = (ImageView) view.findViewById(R.id.productThumbnail);

        return viewHolder;
    }
}
