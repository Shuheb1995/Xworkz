public class SameNewkeyword{
	public static void main(String[] args){
		String[] maleModels= new String[8];
		String[] femaleModels= new String[9];
		System.out.println(maleModels[4]==femaleModels[4]);
		String[] hatchbackCars= new String[10];
		String[] suvCars= new String[6];
		System.out.println(hatchbackCars[5]==suvCars[5]);
		String[] serviceCenter= new String[23];
		String[] mobileServiceCenter= new String[18];
		System.out.println(serviceCenter[15]==mobileServiceCenter[15]);
		String[] gyms= new String[50];
		String[] shops= new String[85];
		System.out.println(gyms[42]==shops[42]);
		String[] programmingLanguages= new String[9];
		String[] dataTypes= new String[8];
		System.out.println(programmingLanguages[5]==dataTypes[5]);
	}
}