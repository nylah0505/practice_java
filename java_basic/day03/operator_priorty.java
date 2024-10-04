package day03;

public class operator_priorty {

	public static void main(String[] args) {
		// and 연산자
		int x = 1;
		int y = -1;	
		boolean result = x>0 && y<0;
		System.out.println("result: " + result);
		
		//계산의 우선순위
		int A = 100*2/3%5;
			System.out.println(A);
		
		//계산의 우선순위2
		int var1 = 1;
		int var2 = 3;
		int var3 = 2;
		int result3 = (var1+var2)*var3;
		System.out.println("result3 : "+ result3);
		
		//계산 방법 공부하기
		int x4 = 1;
		int x5 = 1;
		int result4= x4++ +10;
		int result5= ++x5 +10;
		System.out.println("result4 : "+ result4);
		System.out.println("result5 : "+ result5);	}

}
