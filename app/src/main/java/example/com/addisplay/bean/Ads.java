package example.com.addisplay.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


@Root(name="ads")
@Namespace(reference="http://www.appia.com/AS/get/ads/2013-01")
public class Ads {
	@ElementList(entry = "ad" ,inline = true , type =Ad.class)
	private List<Ad> ad;

	@Element
	private String responseTime;

	@Element
	private String serverId;

	@Element
	private String totalCampaignsRequested;

	@Element
	private String version;

	public List<Ad> getAd() {
		return ad;
	}

}
