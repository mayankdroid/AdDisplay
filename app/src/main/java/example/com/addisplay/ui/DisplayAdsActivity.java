package example.com.addisplay.ui;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

import example.com.addisplay.adapter.DisplayAdsCustomAdapter;
import example.com.addisplay.bean.Ad;
import example.com.addisplay.bean.Ads;
import example.com.addisplay.utils.AdsNetworkCallHelper;

public class DisplayAdsActivity extends AppCompatActivity {
    private final String APP_URL = "http://ads.appia.com/getAds?id=236&password=OVUJ1DJN&siteId=4288&deviceId=4230&sessionId=testsession&totalCampaignsRequested=10&lname=Mayank";
    private ListView listview;
    private DisplayAdsCustomAdapter displayAdsCustomAdapter;
    private List<Ad> list;
    private ProgressDialog progress ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_ads);
        initView();
    }

    @Override
    protected void onResume() {
        verifyData();
        super.onResume();
    }

    private void setAdapter() {
        displayAdsCustomAdapter = new DisplayAdsCustomAdapter(this, list);
        listview.setAdapter(displayAdsCustomAdapter);
    }

    private void verifyData() {
        AppsDetails appsDetails = new AppsDetails();
        appsDetails.execute(APP_URL);
    }

    private void initView() {

        listview = (ListView) findViewById(R.id.ads_listview);
    }

    private class AppsDetails extends AsyncTask<String, Void, Ads> {

        @Override
        protected void onPreExecute() {
            progress = new ProgressDialog(DisplayAdsActivity.this);
            progress.setMessage("Loading");
            progress.show();
            super.onPreExecute();
        }

        @Override
        protected Ads doInBackground(String... params) {
            AdsNetworkCallHelper adsNetworkCallHelper = new AdsNetworkCallHelper(DisplayAdsActivity.this);
            Ads ads = adsNetworkCallHelper.retrieveAdsFromServer(params[0]);

            //if service is not returning proper response displaying the data based on local xml
            if(ads==null){
                 ads = adsNetworkCallHelper.retrieveAdsFromAsset();
            }
            return ads;
        }

        @Override
        protected void onPostExecute(Ads ads) {
            if(ads!=null && ads.getAd()!=null && !ads.getAd().isEmpty()){
                list =ads.getAd();
                setAdapter();
            }
            if(progress!=null && progress.isShowing()){
                progress.dismiss();
            }
            super.onPostExecute(ads);
        }
    }


}
