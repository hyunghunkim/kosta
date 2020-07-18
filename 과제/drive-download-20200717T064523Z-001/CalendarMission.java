package kosta.api;

import java.util.Calendar;

public class CalendarMission {

	public static void main(String[] args) {
		// 캘린더 만들기
		// 월 입력 : 7
		// <2020년 7월>
		// 일	월	화	수	목	금	토
		// 		  		1	2	3	4
		// 5	6	7	8	9	10	11
		// ...........................
		
		Calendar gc = Calendar.getInstance();
		gc.set(2020, 6, 1);		// 해당 월의 1일로 이동
		
		// 7월 1일이 수요일인 것을 구한다.
		
		// 7월의 마지막 날을 구한다.
		int n = gc.getActualMaximum(Calendar.DATE);
		System.out.println(n);
	}

}
