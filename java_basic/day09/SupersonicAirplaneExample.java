package day09;

public class SupersonicAirplaneExample {
public static void main(String[]args) {
	SupersonicAirplane sa = new SupersonicAirplane();
	sa.takeOff();
	sa.fly();
	
	sa.flyMode = SupersonicAirplane.SUPERSONIC;
	sa.fly();
	System.out.println("-------------------------------------");
	
	sa.flyMode = SupersonicAirplane.NORMAL;
	sa.fly();
	System.out.println("-------------------------------------");
	
	sa.land();
}
}