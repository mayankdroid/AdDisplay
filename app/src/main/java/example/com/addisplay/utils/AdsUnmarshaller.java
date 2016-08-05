package example.com.addisplay.utils;

import android.content.Context;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import example.com.addisplay.vo.Ads;


public class AdsUnmarshaller {


    public Ads readLocalXML(Context context) {
        Ads ads = null;
        try {

            Serializer serializer = new Persister();
			InputStream adsObj= context.getAssets().open("getAds.xml");

            ads = serializer.read(Ads.class, adsObj);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return ads;
    }

    public Ads unmarshallerURIXML(String xmlPath) {
	 /*   	 Ads ads = null;
	    	  try {  
	 	    	 String uri = xmlPath;
	 			 URL url = new URL(uri);
	 			 HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	 			 connection.setRequestMethod("GET");
	 			 connection.setRequestProperty("Accept", "application/xml");
	 	    			 
	 			 JAXBContext jaxbContext = JAXBContext.newInstance(Ads.class);  
	 			 InputStream xml = connection.getInputStream();
	 	         Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	 			 
	 	        ads= (Ads) jaxbUnmarshaller.unmarshal(xml);  
	 	        connection.disconnect();
	 	        
	 	      } catch (JAXBException | IOException e) {  
	 	        e.printStackTrace();  
	 	      }
	    	  
			return ads;*/
        return null;
    }


}
