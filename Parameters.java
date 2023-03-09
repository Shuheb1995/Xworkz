public class Parameters{
	public static void main(String[] args){
		num(50);
		debt(100,"Lanson");
		bike(2,"Smith",150000);
		book(900,"JAVA",25.52,'J');
	}
	public static byte num(int number){
		System.out.println(number);
		return 10;
	}
	public static int debt(int money , String name){
		System.out.println("giving money to");
		System.out.println(name);
		System.out.println(money);
		return 100;
	}
	public static short bike(int number, String name,long price){
		System.out.println("Sold Bike to");
		System.out.println(name);
		System.out.println(number);
		System.out.println(price);
		return 1000;
	}
	public static String book(long pages,String name,double discount,char alphabet){
		System.out.println("I sold a Book");
		System.out.println(name);
		System.out.println(pages);
		System.out.println(discount);
		System.out.println(alphabet);
		return "Shuheb";
	}
}