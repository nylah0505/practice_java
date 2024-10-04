package day04;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random() *6)+1;
		System.out.println(num);
		if (num==1) {
			System.out.println("1 나왔어");
		} else if (num==2) {
			System.out.println("2 나왔어");
		} else if (num==3) {
			System.out.println("3 나왔어");
		} else if (num==4) {
		System.out.println("4 나왔어");
		} else if (num==5) {
		System.out.println("5 나왔어");
		} else {
		System.out.println("6 나왔어");
		}
	}

}
