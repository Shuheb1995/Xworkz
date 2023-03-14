public class VariablesChain{
	 int a;
	 float b;
	 String c;
	 char d;
	 byte e;
	 short f;
	 long g;
	 boolean h;
	 double j;
	public VariablesChain(int a){
		this.a=a;
	}
	public VariablesChain(float b){
		this.b=b;
	}
	public VariablesChain(String c){
		this.c=c;
	}
	public VariablesChain(char d){
		this.d=d;
	}
	public VariablesChain(byte e){
		this.e=e;
	}
	public VariablesChain(short f){
		this.f=f;
	}
	public VariablesChain(long g){
		this.g=g;
	}
	public VariablesChain(boolean h){
		this.h=h;
	}
	public VariablesChain(double j){
		this.j=j;
	}
	public static void main(String[] args){
		VariablesChain mark= new VariablesChain(51);
		System.out.println(mark.a);
		VariablesChain percentage=new VariablesChain(50.2f);
		System.out.println(percentage.b);
		VariablesChain name= new VariablesChain("Ulaga");
		System.out.println(name.c);
		VariablesChain letter= new VariablesChain('U');
		System.out.println(letter.d);
		VariablesChain number= new VariablesChain((byte)10);
		System.out.println(number.e);
		VariablesChain num= new VariablesChain((short)25);
		System.out.println(num.f);
		VariablesChain mobileNumber= new VariablesChain(8521479632L);
		System.out.println(mobileNumber.g);
		VariablesChain trueOrFalse= new VariablesChain(true);
		System.out.println(trueOrFalse.h);
		VariablesChain temperature= new VariablesChain(27.27);
		System.out.println(temperature.j);
	}
}