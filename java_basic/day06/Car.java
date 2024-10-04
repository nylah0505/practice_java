package day06;

public class Car {
	String company = "현대자동차";
	String model = "그랜저";
	String color="검정";
	int maxSpeed = 350;
	int speed;
	
	//생성자
	public Car(String color, int cc) {       // 파라미터 값이 2개.
		// TODO Auto-generated constructor stub
	}
	
	public Car () {                          // 파라미터 값이 없음.
	}
	
	public Car(int cc,String color) {        // 파라미터 값이 2개.
		// TODO Auto-generated constructor stub
	}
	
	// 이렇게 많은 같은 이름의 생성자들... 오버로드 라고 부름.    --> 짐을 과하게 싣다.
	
}
