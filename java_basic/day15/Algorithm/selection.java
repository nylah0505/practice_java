package day15.Algorithm;

import java.util.Arrays;

public class selection {
	public static void main(String[] args) {
		int intArr[] = {9,8,7,6,5,4,3,2,1};
		
		System.out.println("정렬 전 : ");
		System.out.println(Arrays.toString(intArr));
		
		selectionSort(intArr); // 버블 정렬 수행
		System.out.println("정렬 후 : ");
		System.out.println(Arrays.toString(intArr));
		
	}
	
	
	
	private static void selectionSort(int[] intArr1) {
		int intArr[] = {9,8,7,6,5,4,3,2,1};
		
		for (int i = 0; i<intArr.length; i++) {
			int minIndex = i;
			for (int j=i+1; j<intArr.length; j++) {
				if (intArr[minIndex]> intArr[j]) {
					minIndex = j;
				}
			}
			
			//스와핑
			int temp = intArr[i];
			intArr[i] = intArr[minIndex];
			intArr[minIndex] = temp;
		}
	}
}
