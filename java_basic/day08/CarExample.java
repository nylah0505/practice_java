package day08;

public class CarExample {
	 public static void main(String[] args) {
		 Car myCar = new Car();
		 
		 myCar.setSpeed(-50);
		 
		 System.out.println("현재 속도 : " + myCar.getSpeed());
		 
		 myCar.setSpeed(60);
		 System.out.println("현재 속도 : " + myCar.getSpeed());
		 if(!myCar.isStop()) {
			 myCar.setstop(true);
			 
		 }
		 System.out.println("현재 속도 : " + myCar.getSpeed());
	 }
}
