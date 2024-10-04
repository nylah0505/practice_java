package day12.d;

public class Outter {
	public void method2(int args) {
		int localVariable = 1;
		//args=100;
		//localVariable =100;
		class Inner{
			public void method() {
				int result = args + localVariable;
			}
		}
	}

}
