package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class T01ArrayListTest {
	public static void main(String[] args) {
		//Default Capacity = 10;
		
		//List list1 = new ArrayList();
		List list1= new Vector();  //벡터도 리스트의 메소드임을 알 수 있음.
		
		// add() 메서드를 이용해서 데이터를 추가한다.
		list1.add("aaa");
		list1.add("bbb");
		list1.add(111);
		list1.add('k');
		list1.add(true);
		list1.add(12.34);
		
		// size() => 데이터의 개수
		System.out.println("size => "+list1.size());
		System.out.println("list1 => "+ list1);
		
		// get()으로 데이터 꺼내오기
		System.out.println("1번째 데이터: " + list1.get(0));
		
		//데이터 끼워넣기도 같다.
		list1.add(0,"zzz");
		System.out.println("list1 => " + list1);
		
		//데이터 변경하기 : set() 메서드 이용
		String temp = (String) list1.set(0, "YYY");
		System.out.println("temp => " + temp);
		System.out.println("list1 => " +list1);
		
		//데이터 삭제하기
		list1.remove(0);
		System.out.println("데이터 삭제 후 : " + list1);
		
		list1.remove("bbb");
		System.out.println("bbb 삭제 후 : " + list1);
		
		list1.remove(Integer.valueOf(111));
		System.out.println("111 삭제 후 : " + list1);
		System.out.println("===================================");
		
		
		/// 제너릭을 지정하여 선언할 수 있다.
		List<String> list2 = new ArrayList<String>(); //string으로 고정되게 함.
		list2.add("AAA");
		list2.add("BBB");
		list2.add("CCC");
		list2.add("DDD");
		list2.add("EEE");
		
		for (String s: list2) {
			System.out.println(s);
		}
		System.out.println("---------------------");
		
		//contains(비교객체) => 리스트에 '비교객체'가 있으면 true
		//					   존재하지 않으면 false 반환함.
		System.out.println(list2.contains("DDD"));
		System.out.println(list2.contains("ZZZ"));
		
		//indexOf (비교객체) => 리스트에 '비교객체'를 찾아 존재하는 위치의 index값 반환
				//					   존재하지 않으면 -1 반환함.
		
		System.out.println("DDD의 INDEX 값 : "
				+ list2.indexOf("DDD"));
		System.out.println("ZZZ의 INDEX 값 : "
				+ list2.indexOf("ZZZ"));
		System.out.println("--------------------------------");
		
		//ArrayList 삭제처리에 대하여 ...
		for(int i=0; i<list2.size(); i++) {
			list2.remove(i);
		}
		
		//list2.clear();   --> 전체 지우기
		System.out.println("List 삭제 처리 후 데이터 개수 : "
				+ list2.size());
	}
}
