public class ProjectedSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double INCREASE_PERCENT = 0.10;
		double saleTotalNorth = 4000, saleTotalSouth = 5500;
		double saleTotalNorthProjected = ((INCREASE_PERCENT * saleTotalNorth) + saleTotalNorth), saleTotalSouthProjected = ((INCREASE_PERCENT * saleTotalSouth) + saleTotalSouth);
		System.out.println("The current company sales for the North and South division are " + saleTotalNorth + " and " + saleTotalSouth + " dollars respectively and are projected to be " + saleTotalNorthProjected + " and " + saleTotalSouthProjected + " dollars respectively again.");
	}

}
