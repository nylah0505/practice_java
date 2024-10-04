package day03;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValaue= byteValue;
		
		long longValue = 500000000;
		float floatValue = longValue;
		double doubleValue = longValue;
		
		System.out.println("floatValue: ");
		
		byte byteValue2 = 65;
		// char charValue = byteValue2;
		
		//casting 강제 변환,  promotion 자동변환
		
		
		//강제 변환 casting 
		int intValue2 = 10;
		double doubleValue2 = 5.5;
		int result2 = intValue2 + (int)doubleValue2;
		System.out.println("result2: "+ result2);
		
		
		double result3 = 1.5+2.3;
		// float result4 = 1.5+2.3;	//error가 나는 이유: 기본 설정이 double이라 자료형이 맞지 않아서
		float result5 = 1.5f+2.3f;
		
		int x2 = 1;
		int y2 = 2;
		double result6 = x2/y2; //int값 나누기 int는 int, 즉 0.5의 정수부분인 0만 나옴.
		System.out.println("result6: " + result6);
		
		//String str = String.value(3);
		//System.out.println("str" + str);
		
		//System.out.printf("이름: "$s    $s", "hello", "world!!!");
		
		
	}

}
