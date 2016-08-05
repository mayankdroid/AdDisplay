package example.com.addisplay.utils;

import android.content.Context;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import example.com.addisplay.bean.Ads;


public class AdsNetworkCallHelper {
    private Context context ;

    public  AdsNetworkCallHelper(Context context){
        this.context = context;
    }

    //retrieving the local xml in case of service failure
    public Ads retrieveAdsFromAsset() {
        Ads ads = null;
        try {

            Serializer serializer = new Persister();
            InputStream adsObj = context.getAssets().open("getAds.xml");
            ads = serializer.read(Ads.class, adsObj);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ads;
    }

    //retriving the xml from service
    public Ads retrieveAdsFromServer(String urlStr) {
        Ads ads = null;
        try {
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            Serializer serializer = new Persister();
            InputStream adsObj = connection.getInputStream();

            ads = serializer.read(Ads.class, adsObj);
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ads;
    }

    //submit the impression to server
    public int submitImpressionTracking(String urlStr) {
       int responseCode = 0;
        try {
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            connection.connect();
            responseCode = connection.getResponseCode();
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseCode ;
    }
}
