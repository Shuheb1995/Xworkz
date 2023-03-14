public class ReturnTypeTest{
	public static void main(String[] args){
		int techStudents= 200;
		System.out.println(techStudents);
		long mechStudents= 20000;
		System.out.println(mechStudents);
		float civilPercentage= 20.1f;
		System.out.println(civilPercentage);
		char firstLetterOfJava= 'J';
		System.out.println(firstLetterOfJava);
		String javaDo= "Learn";
		System.out.println(javaDo);
	}
	public static int tech(){
		return 200;
	}
	public static long mech(){
		return 20000;
	}
	public static float civil(){
		return 20.1f;
	}
	public static char java(){
		return 'J';
	}
	public static String javaScript(){
		return "Learn";
	}
}