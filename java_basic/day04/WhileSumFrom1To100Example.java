package day04;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while (i<=100) {
			sum +=i;
			i++;
		}
		
		System.out.println("결과: "+ sum);
	}
}

// 결과:  5050