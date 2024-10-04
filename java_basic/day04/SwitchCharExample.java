package day04;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 8;
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원 입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원 입니다.");
			
		default:
			System.out.println("손님 입니다");
			
		}
	}

}
