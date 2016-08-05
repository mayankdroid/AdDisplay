package example.com.addisplay.vo;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


@Root(name="ads")
@Namespace(reference="http://www.appia.com/AS/get/ads/2013-01")
public class Ads {
	private List<Ad> ad;
	
	public Ads(){
		
	}
	
	public Ads(List<Ad> ad) {  
	    super();  
	    this.ad = ad;  
	}  
	
	@Element
	public List<Ad> getAd() {
		return ad;
	}

	public void setAd(List<Ad> ad) {
		this.ad = ad;
	}
	
	
}
