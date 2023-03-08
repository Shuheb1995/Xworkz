public class Forshort{
	public static void main(String[] args){
		short[] mobilePrice= {10000,15000,12000,13599,16800,16000};
		short[] buildings= {120,220,230,250,350,380,420,450,500};
		short[] mobileReacharges={99,110,149,199,249,299,349,399};
		short[] vehicles= {100,1000,500,900,600,1200,10000,5000};
		short[] districtsInStates= {40,50,60,9,80,20,30,35,45};
		short[] hardDiskInGbs= {200,500,1000,1500,2000};
		short[] houseRent= {6000,7000,8000,9000,10000,5000,12000};
		short[] priceOfCycles= {5000,2000,3000,9000,8500,7400,6300};
		short[] billsInRestaurants= {500,2000,1500,1420,1580,1200,2500};
		short[] schoolFeez= {5000,2000,2500,20000,30000,15000,12000,22000};
		System.out.println(mobilePrice[5]);
		System.out.println(buildings[6]);
		System.out.println(mobileReacharges[7]);
		System.out.println(vehicles[5]);
		System.out.println(districtsInStates[8]);
		System.out.println(hardDiskInGbs[4]);
		System.out.println(houseRent[3]);
		System.out.println(priceOfCycles[2]);
		System.out.println(billsInRestaurants[3]);
		System.out.println(schoolFeez[1]);
		
		for(int i=0;i<houseRent.length;i++)
			System.out.println(houseRent[i]);
	}
}