public class ConstructorChain{
	public ConstructorChain(){
		System.out.println("Default Constructor");
	}
	public ConstructorChain(int number){
		this('J');
		System.out.println("Constructor Chaining");
	}
	public ConstructorChain(String name){
		this(100);
		System.out.println("Parameterized Constructor");
	}
	public ConstructorChain(double num){
		this();
		System.out.println("I Don't Know");
	}
	public ConstructorChain(char letter){
		this(10.01);
		System.out.println("Learn JAVA");
	}
	public static void main(String[] args){
		ConstructorChain branch= new ConstructorChain("Xworkz ODC");
	}
}