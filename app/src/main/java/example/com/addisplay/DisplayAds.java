package example.com.addisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import example.com.addisplay.utils.AdsUnmarshaller;
import example.com.addisplay.vo.Ad;
import example.com.addisplay.vo.Ads;

public class DisplayAds extends AppCompatActivity {
    private ListView listview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_ads);
        initView();
        verifyData();
    }

    private void verifyData() {
        AdsUnmarshaller adsUn = new AdsUnmarshaller();
        //adsUn.unmarshallerURIXML(urlPath);
        Ads ads = adsUn.readLocalXML(this);

        System.out.println("Ads:");
        List<Ad> list=ads.getAd();
        for(Ad ad:list)
            System.out.println(ad.getAppId());
    }

    private void initView() {

        listview = (ListView)findViewById(R.id.ads_listview);
    }
}
