public class Forint{
	public static void main(String[] args){
		int[] zipcodes= {573134,573201,530068,560001,560002,560003,560004};
		int[] smartPhonePrices= {15000,30000,40000,50000,60000,70000,100000};
		int[] bikePrices= {90000,100000,200000,150000,80000,75000,250000};
		int[] numberBoards= {2774,5886,5987,2654,2301,3055,5280,6551,4621};
		int[] fiveDigitNos= {25874,25896,23654,14563,89745,63214,55555,96587};
		int[] feeInInstitutes= {25000,28000,30000,45000,60000,75000,80000,90000};
		int[] carPrices= {500000,600000,800000,900000,1200000,1500000,4500000};
		int[] last6DigitsOfDebitCards= {258963,879654,854698,789632,885214,547896,215698,478965};
		int[] landLineNos= {82770,87620,91870,94480,94490,94810,94820,94840,94821};
		int[] invoiceNos= {16591,16592,16552,24589,58742,65897,23654,15879};
		System.out.println(zipcodes[0]);
		System.out.println(smartPhonePrices[1]);
		System.out.println(bikePrices[5]);
		System.out.println(numberBoards[6]);
		System.out.println(fiveDigitNos[3]);
		System.out.println(feeInInstitutes[2]);
		System.out.println(carPrices[5]);
		System.out.println(last6DigitsOfDebitCards[1]);
		System.out.println(landLineNos[8]);
		System.out.println(invoiceNos[7]);
		
		for(int i=0;i<carPrices.length;i++)
			System.out.println(carPrices[i]);
	}
}