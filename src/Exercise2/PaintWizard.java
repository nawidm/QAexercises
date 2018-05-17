package Exercise2;

public class PaintWizard {
	
	private double roomSize;
	private int cheapoSize = 20;
	private double cheapoPrice = 19.99;
	private int cheapoCoverPerLitre = 10;
	private int aveSize = 15;
	private double avePrice = 17.99;
	private int aveCoverPerLitre = 11;
	private int duluxSize = 10;
	private double duluxPrice = 25;
	private int duluxCoverPerLitre = 20;
	
	public PaintWizard(double roomSize) {
		this.roomSize = roomSize;
	}
	
	public int getCheapest() {
		
		double cheapoCoverPerTin = cheapoSize * cheapoCoverPerLitre;
		double aveCoverPerTin = aveSize * aveCoverPerLitre;
		double duluxCoverPerTin = duluxSize * duluxCoverPerLitre;

		double numberOfCheapoTins = Math.ceil(roomSize/cheapoCoverPerTin);
		double numberOfAveTins = Math.ceil(roomSize/aveCoverPerTin);
		double numberOfDuluxTins = Math.ceil(roomSize/duluxCoverPerTin);

		double priceUsingCheapo = numberOfCheapoTins * cheapoPrice;
		double priceUsingAve = numberOfAveTins * avePrice;
		double priceUsingDulux = numberOfDuluxTins * duluxPrice;
		
		if(priceUsingCheapo < priceUsingAve && priceUsingCheapo < priceUsingDulux) {
			return 1;
		} else if(priceUsingAve < priceUsingCheapo && priceUsingAve < priceUsingDulux) {
			return 2;
		} else {
			return 3;
		}

	}
	
	public int leastWaste() {
		
		double cheapoCoverPerTin = cheapoSize * cheapoCoverPerLitre;
		double aveCoverPerTin = aveSize * aveCoverPerLitre;
		double duluxCoverPerTin = duluxSize * duluxCoverPerLitre;

		double wasteCheapoTins = cheapoSize*(Math.ceil(roomSize/cheapoCoverPerTin) - roomSize/cheapoCoverPerTin);
		double wasteOfAveTins = aveSize*(Math.ceil(roomSize/aveCoverPerTin) - roomSize/aveCoverPerTin);
		double wasteOfDuluxTins = duluxSize*(Math.ceil(roomSize/duluxCoverPerTin) - roomSize/duluxCoverPerTin);
		
		if(wasteCheapoTins <  wasteOfAveTins && wasteCheapoTins < wasteOfDuluxTins) {
			return 1;
		} else if(wasteOfAveTins < wasteCheapoTins && wasteOfAveTins < wasteOfDuluxTins) {
			return 2;
		} else {
			return 3;
		}

	}
}
