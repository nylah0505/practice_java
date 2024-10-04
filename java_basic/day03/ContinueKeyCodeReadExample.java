package day03;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args)throws Exception {  //throws : 예외 던지기, exception: 어떤 클래스. 사용방법 모름
		// TODO Auto-generated method stub
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
	}

}
