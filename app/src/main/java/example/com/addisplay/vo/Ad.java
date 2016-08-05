package example.com.addisplay.vo;

import org.simpleframework.xml.Element;

public class Ad {
	private String appId;
	private String averageRatingImageURL;
	private float bidRate;
	private String callToAction;
	private String campaignDisplayOrder;
	private int campaignId;
	private int campaignTypeId;
	private String categoryName;
	private String clickProxyURL;
	private int creativeId;
	private String homeScreen;
	private String impressionTrackingURL;
	private String isRandomPick;
	private String minOSVersion;
	private String numberOfRatings;
	private String productDescription;
	private String productId;
	private String productName;
	private String productThumbnail;
	private String rating;
	
	public Ad(){}
	
	public Ad(String appId, String averageRatingImageURL, float bidRate, String callToAction,
			String campaignDisplayOrder, int campaignId, int campaignTypeId, String categoryName, String clickProxyURL,
			int creativeId, String homeScreen, String impressionTrackingURL, String isRandomPick, String minOSVersion,
			String numberOfRatings, String productDescription, String productId, String productName,
			String productThumbnail, String rating) {
		super();
		this.appId = appId;
		this.averageRatingImageURL = averageRatingImageURL;
		this.bidRate = bidRate;
		this.callToAction = callToAction;
		this.campaignDisplayOrder = campaignDisplayOrder;
		this.campaignId = campaignId;
		this.campaignTypeId = campaignTypeId;
		this.categoryName = categoryName;
		this.clickProxyURL = clickProxyURL;
		this.creativeId = creativeId;
		this.homeScreen = homeScreen;
		this.impressionTrackingURL = impressionTrackingURL;
		this.isRandomPick = isRandomPick;
		this.minOSVersion = minOSVersion;
		this.numberOfRatings = numberOfRatings;
		this.productDescription = productDescription;
		this.productId = productId;
		this.productName = productName;
		this.productThumbnail = productThumbnail;
		this.rating = rating;
	}
	
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAverageRatingImageURL() {
		return averageRatingImageURL;
	}

	public void setAverageRatingImageURL(String averageRatingImageURL) {
		this.averageRatingImageURL = averageRatingImageURL;
	}

	public float getBidRate() {
		return bidRate;
	}

	public void setBidRate(float bidRate) {
		this.bidRate = bidRate;
	}

	public String getCallToAction() {
		return callToAction;
	}

	public void setCallToAction(String callToAction) {
		this.callToAction = callToAction;
	}

	public String getCampaignDisplayOrder() {
		return campaignDisplayOrder;
	}

	public void setCampaignDisplayOrder(String campaignDisplayOrder) {
		this.campaignDisplayOrder = campaignDisplayOrder;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getCampaignTypeId() {
		return campaignTypeId;
	}

	public void setCampaignTypeId(int campaignTypeId) {
		this.campaignTypeId = campaignTypeId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getClickProxyURL() {
		return clickProxyURL;
	}

	public void setClickProxyURL(String clickProxyURL) {
		this.clickProxyURL = clickProxyURL;
	}

	public int getCreativeId() {
		return creativeId;
	}

	public void setCreativeId(int creativeId) {
		this.creativeId = creativeId;
	}

	public String getHomeScreen() {
		return homeScreen;
	}

	public void setHomeScreen(String homeScreen) {
		this.homeScreen = homeScreen;
	}

	public String getImpressionTrackingURL() {
		return impressionTrackingURL;
	}

	public void setImpressionTrackingURL(String impressionTrackingURL) {
		this.impressionTrackingURL = impressionTrackingURL;
	}

	public String getIsRandomPick() {
		return isRandomPick;
	}

	public void setIsRandomPick(String isRandomPick) {
		this.isRandomPick = isRandomPick;
	}

	public String getMinOSVersion() {
		return minOSVersion;
	}

	public void setMinOSVersion(String minOSVersion) {
		this.minOSVersion = minOSVersion;
	}

	public String getNumberOfRatings() {
		return numberOfRatings;
	}

	public void setNumberOfRatings(String numberOfRatings) {
		this.numberOfRatings = numberOfRatings;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductThumbnail() {
		return productThumbnail;
	}

	public void setProductThumbnail(String productThumbnail) {
		this.productThumbnail = productThumbnail;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	
	
	
	
}
