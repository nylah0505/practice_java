package day05;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		

		int[] scores ;
		scores = new int[] {83,90,87};
		int sum1 = 0;
		
		
		int sum = 0;
		for (int i =0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: "+ sum);
			
		int sum2 = add( new int[] {83,90,87});
		for (int i =0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: "+ sum2);
		}
	
	public static int add(int[] scores) {
		int sum=0;
		for (int i =0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
		
}
	
	