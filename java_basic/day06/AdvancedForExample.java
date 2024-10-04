package day06;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95,39,43,56,100};
		
		int sum = 0;
		for (int score: scores) {
			sum = sum+score;
		}
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균= " + avg);
	}
}
