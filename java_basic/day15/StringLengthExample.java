package day15;

public class StringLengthExample {
	public static void main(String[]args) {
		String ssn = "9903071439501";
		int length = ssn.length();
		if (length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
}
