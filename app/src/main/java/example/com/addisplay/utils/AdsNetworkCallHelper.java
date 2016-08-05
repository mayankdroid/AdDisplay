package example.com.addisplay.utils;

import android.content.Context;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import example.com.addisplay.bean.Ads;


public class AdsNetworkCallHelper {

    public Ads retrieveXmlFromAsset(Context context) {
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

    public Ads retrieveXmlContent(String urlStr) {
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
}
