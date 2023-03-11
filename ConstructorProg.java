public class ConstructorProg{
    public ConstructorProg(){
	  System.out.println("Constructor Programme");
    }
	public ConstructorProg(long price){
		System.out.println("I bought a Bike");
		System.out.println(price);
		
	}
	public ConstructorProg(boolean torf){
		System.out.println("Ulaga is Ginius");
		System.out.println(torf);
	}
	public ConstructorProg(String noun){
		System.out.println("Proper noun");
		System.out.println(noun);
	}
	public ConstructorProg(char letter){
		System.out.println("Capital Letter in Laptop");
		System.out.println(letter);
	}
	
	    public static void main(String[] args){
			ConstructorProg display= new ConstructorProg();
			ConstructorProg rate= new ConstructorProg(150000);
			ConstructorProg answer= new ConstructorProg(true);
			ConstructorProg reply= new ConstructorProg("Name");
			ConstructorProg print= new ConstructorProg('L');
		}
	

}