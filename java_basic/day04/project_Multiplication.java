package day04;

import java.util.Scanner;

public class project_Multiplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = scanner.nextInt(); 
        
        System.out.println("*** "+i+" 단 ***");

        for (int n = 1; n <= 9; n++) {
            System.out.println(i + " x " + n + " = " + (i * n));
        }

        scanner.close();
    }
}


/*
import java.util.Scanner;

public class project_Multiplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String i = scanner.nextLine();   				     //여기서 int i라고 쓰고, nextInt라고 썼어야 함.

		int i = (int) i;   									 //이거는 지우기

		for (int n=1; n<=9; n++) {

			System.out.println(i+" x "+ n +" = "+(i * n));
		}
														   	//여기에 scanner.close(); 추가
	}

}
*/

/*
String temp = scanner.nextLine();                           // nextLine으로 받을 경우 아래와 같은 문법을 사용할 수 있음.
int i = Integer.parseInt(temp);

*/