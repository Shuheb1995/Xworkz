public class ReturnTypes{
	public static void main(String[] args){
		byte result = givebyte();
		System.out.println(result);
		short give = giveshort();
		System.out.println(give);
		int zipcode = giveint();
		System.out.println(zipcode);
		long billNumber = givelong();
		System.out.println(billNumber);
		float percentge = givefloat();
		System.out.println(percentge);
		double temperature = givedouble();
		System.out.println(temperature);
		char grade = givechar();
		System.out.println(grade);
		boolean imInBanglore = giveboolean();
		System.out.println(imInBanglore);
		String friend = givestring();
		System.out.println(friend);

	}
	public static byte givebyte(){
		return 2;
	}
	public static short giveshort(){
		return 220;
	}
	public static int giveint(){
		return 573201;
	}
	public static long givelong(){
		return 8654789;
	}
	public static float givefloat(){
		return 64.8f;
	}	
	public static double givedouble(){
		return 27.365;
	}	
	public static char givechar(){
		return 'A';
	}
	public static boolean giveboolean(){
		return true;
	}
	public static String givestring(){
		return "Hidayath";
	}
		
}