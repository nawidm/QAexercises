package Library;

public class Magazine extends ReadingMaterial implements AdRevenue{
	
	int numOfAds;
	boolean isGlossy;

	public Magazine(String name, int numberOfPages, int numOfAds, boolean isGlossy) {
		super(name, numberOfPages);
		this.numOfAds = numOfAds;
		this.isGlossy = isGlossy;
	}

	public double getAdRevenue() {
		return numOfAds * 3.50;
	}
	
	public int getNumOfAds() {
		return numOfAds;
	}

	public void setNumOfAds(int numOfAds) {
		this.numOfAds = numOfAds;
	}
	
}
