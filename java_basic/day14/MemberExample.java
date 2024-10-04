package day14;

public class MemberExample {
	public static void main(String[]args) {
		Member obj1 = new Member(1);
		Member obj2 = new Member(1);
		Member obj3 = new Member(2);
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동일합니다");
		} else {
			System.out.println("obj1과 obj2는 동일하지 않습니다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동일합니다");
		} else {
			System.out.println("obj1과 obj3는 동일하지 않습니다.");
		}
	}
}
