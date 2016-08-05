package example.com.addisplay.ui;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

import example.com.addisplay.DisplayAdsCustomAdapter;
import example.com.addisplay.bean.Ad;
import example.com.addisplay.bean.Ads;
import example.com.addisplay.utils.AdsNetworkCallHelper;

public class DisplayAdsActivity extends AppCompatActivity {
    private final String APP_URL = "http://ads.appia.com/getAds?id=236&password=OVUJ1DJN&siteId=4288&deviceId=4230&sessionId=testsession&totalCampaignsRequested=10";
    private ListView listview;
    private DisplayAdsCustomAdapter displayAdsCustomAdapter;
    private List<Ad> list;

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
        //AdsNetworkCallHelper adsNetworkCallHelper = new AdsNetworkCallHelper();
        //Ads ads = adsNetworkCallHelper.retrieveXmlFromAsset(this);
        AppsDetails appsDetails = new AppsDetails();
        appsDetails.execute(APP_URL);
    }

    private void initView() {

        listview = (ListView) findViewById(R.id.ads_listview);
    }

    private class AppsDetails extends AsyncTask<String, Void, Ads> {

        @Override
        protected void onPreExecute() {

            super.onPreExecute();
        }

        @Override
        protected Ads doInBackground(String... params) {
            AdsNetworkCallHelper adsNetworkCallHelper = new AdsNetworkCallHelper();
            Ads ads = adsNetworkCallHelper.retrieveXmlContent(params[0]);
            //AdsNetworkCallHelper adsNetworkCallHelper = new AdsNetworkCallHelper();
           // Ads ads = adsNetworkCallHelper.readLocalXML(DisplayAdsActivity.this);
            return ads;
        }

        @Override
        protected void onPostExecute(Ads ads) {
            if(ads!=null && ads.getAd()!=null && !ads.getAd().isEmpty()){
                list =ads.getAd();
                setAdapter();
            }
            super.onPostExecute(ads);
        }
    }


}
