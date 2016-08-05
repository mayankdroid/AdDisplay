package example.com.addisplay.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "ad")
public class Ad {
    @Element(name = "appId")
    private String appId;
    @Element
    private String averageRatingImageURL;
    @Element
    private String bidRate;
    @Element
    private String callToAction;
    @Element
    private String campaignDisplayOrder;
    @Element
    private String campaignId;
    @Element
    private String campaignTypeId;
    @Element
    private String categoryName;
    @Element
    private String clickProxyURL;
    @Element
    private String creativeId;
    @Element
    private String homeScreen;
    @Element
    private String impressionTrackingURL;
    @Element
    private String isRandomPick;
    @Element(data = false, required = false, name = "minOSVersion")
    private String minOSVersion;
    @Element
    private String numberOfRatings;
    @Element
    private String productDescription;
    @Element
    private String productId;
    @Element
    private String productName;
    @Element
    private String productThumbnail;
    @Element
    private String rating;


    public String getAppId() {
        return appId;
    }


    public String getAverageRatingImageURL() {
        return averageRatingImageURL;
    }


    public String getBidRate() {
        return bidRate;
    }


    public String getCallToAction() {
        return callToAction;
    }


    public String getCampaignDisplayOrder() {
        return campaignDisplayOrder;
    }


    public String getCampaignId() {
        return campaignId;
    }


    public String getCampaignTypeId() {
        return campaignTypeId;
    }


    public String getCategoryName() {
        return categoryName;
    }


    public String getClickProxyURL() {
        return clickProxyURL;
    }


    public String getCreativeId() {
        return creativeId;
    }


    public String getHomeScreen() {
        return homeScreen;
    }


    public String getImpressionTrackingURL() {
        return impressionTrackingURL;
    }


    public String getIsRandomPick() {
        return isRandomPick;
    }


    public String getMinOSVersion() {
        return minOSVersion;
    }


    public String getNumberOfRatings() {
        return numberOfRatings;
    }


    public String getProductDescription() {
        return productDescription;
    }


    public String getProductId() {
        return productId;
    }


    public String getProductName() {
        return productName;
    }


    public String getProductThumbnail() {
        return productThumbnail;
    }


    public String getRating() {
        return rating;
    }


}
