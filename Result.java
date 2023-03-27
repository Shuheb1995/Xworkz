public class Result{
	
	Output output;
	static int rollNo;
	byte marks;
	
	public Result(int rollNo,byte marks){
		
		this.rollNo=rollNo;
		this.marks=marks;
	}
	public static void main(String[] args){
		Result display= new Result(1414,(byte)99);
		
		System.out.println(Output.PASS.value);
		System.out.println(display.rollNo);
		System.out.println(display.marks);
	}
	enum Output{
		PASS("pass"),FAIL("fail");
		final String value;
		
		Output(String value){
			this.value=value;
		}
	}
}