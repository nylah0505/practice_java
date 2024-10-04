package day12.h;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("tv를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv를 끕니다.");
		}
	};
	
	void method1() {
		//로컬 변수 값으로 대입
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("audio를 킵니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("audio를 끕니다");
			}
		};
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
