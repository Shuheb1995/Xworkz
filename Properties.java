public class Properties{
	public static void main(String[] args){
		Properties trainers= new Properties((byte)5);
		Properties classes= new Properties((byte)5,(short)10);
		Properties students= new Properties((byte)5,(short)10,400);
		Properties studentNumber= new Properties((byte)5,(short)10,400,8889996663L);
		Properties boysPercentage= new Properties((byte)5,(short)10,400,8889996663L,65.5f);
		Properties girlsPercentage= new Properties((byte)5,(short)10,400,8889996663L,65.5f,34.50d);
		Properties section= new Properties((byte)5,(short)10,400,8889996663L,65.5f,34.50d,'A');
		Properties learningJava= new Properties((byte)5,(short)10,400,8889996663L,65.5f,34.50d,'A',true);
		Properties instituteName= new Properties((byte)5,(short)10,400,8889996663L,65.5f,34.50d,'A',true,"Xworkz");
	}
	byte trainers;
	short classes;
	int students;
	long studentNumber;
	float boysPercentage;
	double girlsPercentage;
	char section;
	boolean learningJava;
	String instituteName;
	
	public Properties(byte a){
		System.out.println(a);
	}
	public Properties(byte a,short b){
		System.out.println(a);
		System.out.println(b);
	}
	public Properties(byte a, short b,int c){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public Properties(byte a,short b,int c,long d){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public Properties(byte a,short b,int c,long d,float e){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	public Properties(byte a,short b,int c,long d,float e,double f){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
	public Properties(byte a,short b,int c,long d,float e,double f,char g){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
	public Properties(byte a,short b,int c,long d,float e,double f,char g,boolean h){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
	public Properties(byte a,short b,int c,long d,float e,double f,char g,boolean h,String i){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
	}
	
}