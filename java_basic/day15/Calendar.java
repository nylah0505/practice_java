//package day15;
//
//import java.util.*;
//
//public class Calendar {
//
//	public static void main(String[] args) {
//		Calendar now = Calendar.getInstance();
//		
//		int year = now.get(Calendar.YEAR);
//		int month = now.get(Calendar.MONTH)+1;
//		int day = now.get(Calendar.DAY_OF_MONTH);
//		
//		int week = now.get(Calendar.DAY_OF_WEEK);
//		String strWeek = null;
//		switch(week) {
//			case Calendar.MONDAY:
//				strWeek = "월";
//				break;
//			case Calendar.TUESDAY:
//				strWeek="화";
//				break;
//			case Calendar.WEDNESDAY:
//				strWeek="수";
//				break;
//		}
//		
//		int amPm = now.get(Calendar.AM_PM);
//		String strAmPm = null;
//		if(amPm==Calendar.AM) {
//			strAmPm="오전";
//		}else {
//			strAmPm="오후";
//		}
//		
//		int hour =now.get(Calendar.HOUR);
//		int minute = now.get(Calendar.MINUTE);
//		int second = now.get(Calendar.SECOND);
//		
//		System.out.println(year+"년");
//		System.out.println(month+"월");
//	}
//
//	private static Calendar getInstance() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
		
		//int year = now.get(Calendar.YEAR);
