package day03;

public class qstopExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		while(true) {
			keyCode = System.in.read();
			System.out.println("key code: "+ keyCode);
			if (keyCode == 113) {
				break;
			}
		}
		System.out.println("종료");
	}

}
