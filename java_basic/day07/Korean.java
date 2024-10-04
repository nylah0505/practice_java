package day07;

public class Korean {
	
	// 필드
	String nation = "한국";
	String name;
	String ssn;
	
	// 생성자
	public Korean(String n, String s) {
		this.name = n;
		this.ssn = s;      //    this.  <--이거는 생략 가능함. 근데 name=name일 경우는 this.을 꼭 붙여주어야 함.
	}
	
	public Korean(){
		
	}
}
