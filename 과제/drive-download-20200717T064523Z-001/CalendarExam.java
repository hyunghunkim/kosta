package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
		// 날짜와 시간을 담당하는 클래스
//		GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
		
		System.out.println(gc);
		
		// 현재 날짜와 시간
		String now = gc.get(Calendar.YEAR)+ "년 "
				+ (gc.get(Calendar.MONTH) + 1)+ "월 "
				+ gc.get(Calendar.DATE)+ "일 "
				+ gc.get(Calendar.HOUR)+ "시 "
				+ gc.get(Calendar.MINUTE)+ "분";
		System.out.println("현재 날짜와 시간 : " +now);
		
		// 현재 기준으로 100일 기념일 계산
		gc.add(Calendar.DATE, 100);
		String future = gc.get(Calendar.YEAR)+ "년 "
				+ (gc.get(Calendar.MONTH) + 1)+ "월 "
				+ gc.get(Calendar.DATE)+ "일 "
				+ gc.get(Calendar.HOUR)+ "시 "
				+ gc.get(Calendar.MINUTE)+ "분";
		System.out.println("100일 후 : " +future);

		// 과거 기준으로 100일 후 계산
		gc.set(2020, 5, 30);	// 기준 : 2020년 6월 30일
		gc.add(Calendar.DATE, 100);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String str = sdf.format(gc.getTime());
		System.out.println(str);
		
		// 
		char[] week = {'일', '월', '화', '수', '목', '금', '토'};
		for(int i=2020; i<=2030; i++)
		{
			gc.set(i, 6, 16);	// 2020 7 16
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];	// DAY_OF_WEEK는 기본값이 1
			System.out.println(i+ "년의 생일은 " +c+ "요일 입니다.");
		}
	}
}
