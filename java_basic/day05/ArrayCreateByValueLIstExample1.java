package day05;

public class ArrayCreateByValueLIstExample1 {
	public static void main(String[] args) {
		
		
		/*
		// int[] scores = {83, 90,87};
		int[] scores = new int[3];
		
		scores[0]=83;
		scores[1]=90;
		scores[2]=87;
		
		System.out.println("scores[0]: "+ scores[0]);
		System.out.println("scores[1]: "+ scores[1]);
		System.out.println("scores[2]: "+ scores[2]);
		
		int sum = 0;
		for (int i =0; i<3; i++) {
			sum += scores[i];
	
		}
		System.out.println("총합: "+ sum);
		double avg = (double)sum /3;
		System.out.println("평균: "+ avg);
*/
		int [] intarray = null;
		intarray[0] =10;  
		
		//Exception in thread "main" java.lang.NullPointerException: Cannot store to int array because "intarray" is null
		//at java_basic/day05.ArrayCreateByValueLIstExample1.main(ArrayCreateByValueLIstExample1.java:29)

		//NullPointerException error임.

	}
}
