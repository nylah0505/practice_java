package day15;

public class StringReplaceExample {
	public static void main(String[]args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 에이피아이를 지원합니다";
		String newStr= oldStr.replace("자바", "java");
		String newStr1= newStr.replace("에이피아이", "api");
		System.out.println(oldStr);
		System.out.println(newStr1);
	}
}
