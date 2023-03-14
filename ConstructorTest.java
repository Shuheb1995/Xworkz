public class ConstructorTest{
	ConstructorTest(){
	System.out.println("Default Constructor");
	}
	ConstructorTest(int a){
		this('A');
		System.out.println("Parameterized Constructor");
	}
	ConstructorTest(String c){
		this(15000);
		System.out.println("Price of Bike");
	}
	ConstructorTest(long b){
		this(100);
		System.out.println("Name of Institute");
	}
	ConstructorTest(char d){
		this();
		System.out.println("Grade");
	}
	public static void main(String[] args){
		ConstructorTest name= new ConstructorTest("Xworkz");
		System.out.println(name);
	}
}