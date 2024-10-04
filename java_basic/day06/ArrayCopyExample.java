//package day06;
//
//public class ArrayCopyExample {
//	public static void main(String[] args) {
//		String oldStrArray = {"java", "array", "copy"};
//		String[] newStrArray = new String[5];
//		String[] newStrArray2 = new String[5];
//		
//		newStrArray2 = oldStrArray;
//			
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		for(int i=0; i<newStrArray.length; i++) {
//			System.out.print(newStrArray[i]+",");
//		}
//		
//		oldStrArray = "python";
//		
//		System.out.println("newStrArray2 내용 시작 ....");
//		for(int i=0; i<newStrArray2.length; i++) {
//			System.out.print(newStrArray2[i]+",");
//		System.out.println("내용 끝 ... ");
//		}
//	}
//}

//old를 수정하니, array2도 복사됨.
//new array가 바라봄. 하나 수정하니 또 하나도 수정됨.   --> 얕은 복사
//우리가 원하는 것은 깊은 복사가 많음.