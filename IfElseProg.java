public class IfElseProg{
	public static void main(String[] args){
		String[] namesfCarBrands= {"Kia","Toyota","Mahindra","Hyundai","Tata","Mustang","Renault","Porche"};
		System.out.println(namesfCarBrands[3]);
		
		for(int i=0;i<=7;i++){
			System.out.println(namesfCarBrands[i]);
	}
	if(namesfCarBrands[5]=="Mustang"){
		System.out.println("BRAVO");
	}
	else
	{
		System.out.println("REVERT");
	}
	if(namesfCarBrands[4]=="Hyundai"){
		System.out.println("BRAVO");
	}
	else
	{
		System.out.println("REVERT");
	}
	if(namesfCarBrands[6]=="Renault"){
		System.out.println("BRAVO");
	}
	else
	{
		System.out.println("REVERT");
	}
	if(namesfCarBrands[5]=="Kia"){
		System.out.println("BRAVO");
	}
	else
	{
		System.out.println("REVERT");
	}
	if(namesfCarBrands[7]=="Porche"){
		System.out.println("BRAVO");
	}
	else
	{
		System.out.println("REVERT");
	}
	}
}