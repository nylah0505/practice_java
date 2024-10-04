package day05;

public class MainStringArrayArugument {
	public static void main(String[]args) {
		if(args.length !=3) {
			System.out.println("값 수 부족");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		String strNum3 = args[2];
		
		int num1= Integer.parseInt(strNum1);
		int num2= Integer.parseInt(strNum2);
		int num3= Integer.parseInt(strNum3);

		int result = num1 + num2+ num3;
		System.out.println(result);    //코드 결과 60 나옴. 파라미터, 10,20,30 넣음.
	}
}
