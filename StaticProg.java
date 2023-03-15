public class StaticProg{
	public static void main(String[] args){
		Programme print= new Programme();
		
		
		Programme.a=30000;
		Programme.b=8217650069L;
		Programme.c=100;
		Programme.d=2000;
		Programme.e= "Solved";
		
		
		System.out.println(Programme.a);
		System.out.println(Programme.b);
		System.out.println(Programme.c);
		System.out.println(Programme.d);
		System.out.println(Programme.e);
		
		print.f= "Mustang";
		print.g= 'S';
		print.h= 4500;
		print.j= 8861506520L;
		print.k= 420;
		
		System.out.println(print.f);
		System.out.println(print.g);
		System.out.println(print.h);
		System.out.println(print.j);
		System.out.println(print.k);
		
		
	}
	public static class Programme{
		public Programme(){
			System.out.println("Run it");
		}
		static int a;
		static long b;
		static byte c;
		static short d;
		static String e;
		
		String f;
		char g;
		int h;
		long j;
		short k;
	}
}