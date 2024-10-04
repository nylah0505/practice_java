package day05;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1==strVar2) {
			System.out.println("STR VAR1과 VAR2는 참조가 같음");
		} else {
			System.out.println("var1 var2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strvar1과 strvar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3==strVar4) {
			System.out.println("STR VAR3과 VAR4는 참조가 같음");
		} else {
			System.out.println("var3 var4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strvar3과 strvar4는 문자열이 같음");
		}
	}
}
