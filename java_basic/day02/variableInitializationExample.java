package day02;

public class variableInitializationExample {
	public static void main(String[] args) {
		
		//변수 value 선언 
		int value = 30; 
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		//int result = value + 10;    --> 오류! (변수 값 설정 전)
		
		int result = value + 10; // 오류 없음.
		
		//변수 result값을 읽어서 콘솔에 출력하기
		System.out.println(result);
	}
}
