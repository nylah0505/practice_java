package day04;

public class BreakExample {
	public static void main(String[] args) {
		int i = 0;
		while(true) {
			int num = (int) (Math.random() * 6) +1;
			System.out.println(num);
			i += 1;
					
			if (num == 6) {
				break;
			}
		}
		System.out.println(i + "번만에 프로그램 종료");
	}
}
