package day13;

public class TryFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("JAVA.LANG.STRING2");
			System.out.println("프로그램이 종료되었습니다.");
			
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
