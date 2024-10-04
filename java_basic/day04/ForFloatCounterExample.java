package day04;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		for (float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}
}

//실행시 다음과 같은 결과 값이 출력됨.

/*
0.1
0.2
0.3
0.4
0.5
0.6
0.70000005
0.8000001
0.9000001
*/