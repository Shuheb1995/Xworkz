public class MethodOverloading{
	public static void main(String[] args){
		tech();
		tech(1000);
		tech(100);
		tech(500);
		tech(5000);
		tech("Mustang");
		tech(50000,420);
		tech(120,2,125);
        tech(2,20,2,40);
		tech("David",'B',410,6,60);
		tech(500,'A');
		tech('A',500);
		tech(3,"Nelson");
		tech("Murdock",4);
		tech(3,true);
		tech(false,4);
	}
	public static void tech(){
		System.out.println("write a new method");
	}
	public static void tech(int num){
		System.out.println(num);
	}
	public static void tech(byte num){
		System.out.println(num);
	}
	public static void tech(short num){
		System.out.println(num);
	}
	public static void tech(long num){
		System.out.println(num);
	}
	public static void tech(String name){
		System.out.println(name);
	}
	public static void tech(int bikes,int number){
		System.out.println(bikes);
		System.out.println(number);
	}
	public static void tech(int numbers,int cars,int serviceCars){
		System.out.println(numbers);
		System.out.println(cars);
		System.out.println(serviceCars);
	}
	public static void tech(int number,int pencils,int packs,int price){
		System.out.println(number);
		System.out.println(pencils);
		System.out.println(packs);
		System.out.println(price);
	}
	public static void tech(String name,char grade,int marks,int subjects,int percentage){
		System.out.println(name);
		System.out.println(grade);
		System.out.println(marks);
		System.out.println(subjects);
		System.out.println(percentage);
	}
	public static void tech(int number,char grade){
		System.out.println(number);
		System.out.println(grade);
	}
	public static void tech(char grade,int number){
		System.out.println(grade);
		System.out.println(number);
	}
	public static void tech(int tokenNumber,String name){
		System.out.println(tokenNumber);
		System.out.println(name);
	}
	public static void tech(String name,int tokenNumber){
		System.out.println(name);
		System.out.println(tokenNumber);
	}
	public static void tech(int children,boolean three){
		System.out.println(children);
		System.out.println(three);
	}
	public static void tech(boolean four,int children){
		System.out.println(four);
		System.out.println(children);
	}
	
	
	
	
	
	
}