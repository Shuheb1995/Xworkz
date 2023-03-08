public class For{
	public static void main(String[] args){
		byte[] marks= {55,88,52,63,54,8,9};
		byte[] numbers={5,8,9,3,2,1,4,7,8};
		byte[] rollNos= {1,2,3,4,5,6,7,8,9};
		byte[] oddNos= {1,3,5,7,9,11,13,15};
		byte[] evenNos={2,4,6,8,10,12,14,16};
		byte[] noOfStudentsInEachClass= {60,40,20,50,64,73,52,42};
		byte[] distanceInKms= {10,22,15,13,3,8,9};
		byte[] trainersInInstitute= {4,5,9,8,7,2,3,10};
		byte[] ram= {1,2,4,6,8,12};
		System.out.println(marks[5]);
		System.out.println(numbers[6]);
		System.out.println(rollNos[5]);
		System.out.println(oddNos[4]);
		System.out.println(evenNos[3]);
		System.out.println(noOfStudentsInEachClass[2]);
		System.out.println(distanceInKms[1]);
		System.out.println(trainersInInstitute[7]);
		System.out.println(ram[4]);
		
		for(int i=0;i<evenNos.length;i++)
			System.out.println(evenNos[i]);
	}
}