public class StaticBlock{
	public static void main(String[] args){
		System.out.println(Blocks.collegeName);
		System.out.println(Blocks.students);
		System.out.println(Blocks.USN);
		System.out.println(Blocks.studying);
		System.out.println(Blocks.section);
		
		Blocks victim= new Blocks("Rolex",413102,'A');
		System.out.println(victim.name);
		System.out.println(victim.rollnumber);
		System.out.println(victim.sec);
		
		Blocks.Local();
		Blocks.Compiling();
	}
	public static class Blocks{
		static String collegeName;
		static int students;
		static long USN;
		static boolean studying;
		static char section;	

	static{
		collegeName= "RIT";
		students= 1000;
		USN= 413102413102L;
		studying= true;
		section= 'A';
	}	
	    String name;
		int rollnumber;
		char sec;
		
	public Blocks(String name,int rollnumber,char sec){
		System.out.println("Pop Up Local Variable & Instance Variable With Same Reference");
			this.name=name;
			this.rollnumber=rollnumber;
			this.sec=sec;
		}
		
	public static void Local(){
		System.out.println("Call Shuheb");
		long mobNumber= 8217650069L;
		System.out.println(mobNumber);
	}
	public static void Compiling(){
		System.out.println("Call Ulaga");
		long mobileNum= 8861506520L;
		System.out.println(mobileNum);
	}
	}
}