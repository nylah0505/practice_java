package day15;

public class StringSubStringExample {
	public static void main(String[]args) {
		String ssn = "9903071439501";
		
		String firstNum=ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
	
}
