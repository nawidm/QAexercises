package Library;

public class Newspaper extends ReadingMaterial implements AdRevenue{
	
	int numOfAds;
	boolean isBroadsheet;
	
	public Newspaper(String name, int numOfAds, boolean isBroadsheet) {
		super(name);
		this.numOfAds = numOfAds;
		this.isBroadsheet = isBroadsheet;
	}

	public double getAdRevenue() {
		return numOfAds * 5;
	}

	public int getNumOfAds() {
		return numOfAds;
	}

	public void setNumOfAds(int numOfAds) {
		this.numOfAds = numOfAds;
	}

	public boolean isBroadsheet() {
		return isBroadsheet;
	}

	public void setBroadsheet(boolean isBroadsheet) {
		this.isBroadsheet = isBroadsheet;
	}
}
