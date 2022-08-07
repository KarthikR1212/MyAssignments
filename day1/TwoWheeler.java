package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 1;
	long chassisNumber = 12356798L;
	boolean isPunctured = true;
	String bikeName = "KTM";
	double runningKM = 4788.45;

	public static void main(String[] args) {

		TwoWheeler twowheeler = new TwoWheeler();
		System.out.println("Wheels:" + twowheeler.noOfWheels);
		System.out.println("Mirrors:" + twowheeler.noOfMirrors);
		System.out.println("Chassis Number:" + twowheeler.chassisNumber);
		System.out.println("Punctured:" + twowheeler.isPunctured);
		System.out.println("Bike Name:" + twowheeler.bikeName);
		System.out.println("Kilometers Run:" + twowheeler.runningKM);
	}
}


