public class ParameterTest{
	public static void main(String[] args){
		test(10);
		test(20000);
		test('S');
		test(true);
		test(25,2500000);
		test(64.4f);
		test(89.98);
	}
	public static void test(int a){
		System.out.println("price for a Pencil");
		System.out.println(a);
	}
	public static void test(long b){
		System.out.println("price for a Bike");
		System.out.println(b);
	}
	public static void test(char d){
		System.out.println("First letter of my Name");
		System.out.println(d);
	}
	public static void test(boolean c){
		System.out.println("Ulaga is genius");
		System.out.println(c);
	}
	public static void test(int e,long f){
		System.out.println("Quantity and Price");
		System.out.println(e);
		System.out.println(f);
	}
	public static void test(float g){
		System.out.println("Average");
		System.out.println(g);
	}
	public static void test(double h){
		System.out.println("Percentage");
		System.out.println(h);
	}
	
	
}