package Assignment1;

public class TwoWheeler {
	// variables
	int noOfWheels = 4;
	short noOfMirrors =3;
	long chassisNumber = 54321;
	boolean isPunctured = false;
	String bikeName = "Pulsar";
	double runningKM = 145.6;
	
	public static void main(String[] args) {
		TwoWheeler mybike = new TwoWheeler();
		System.out.println(mybike.noOfWheels);
		System.out.println(mybike.noOfMirrors);
		System.out.println(mybike.chassisNumber);
		System.out.println(mybike.isPunctured);
		System.out.println(mybike.bikeName);
		System.out.println(mybike.runningKM);
		
		
		
		
	}

}
