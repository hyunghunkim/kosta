package kosta.api;

public class StringExam {

	public static void main(String[] args) {
		// 객체 생성방법
		String str = "ABC";		// 메모리를 먼저 검색해서 없으면 새로 생성하고, 있으면 그 주소를 참조한다.
		String str2 = new String("abc");	// 무조건 새로 생성
		
		// 불변성
		String str3 = str.concat(str2);	// 기존 문자열에 새로운 문자열을 추가
		System.out.println(str);	// 메서드만 가지고는 문자열 조작이 불가능하다.
		System.out.println(str3);	// 리턴값을 가지고 문자열 조작이 가능하다.
		
		String sql = "select * from board";
		int num = 10;
		if(num == 10)
		{
			sql += " where num = 10";	// 메서드로는 안되지만 +연산자로는 문자열 조작이 가능하다.
		}
		
		System.out.println(sql);
		
		// 가변성
		// StringBuffer, StringBuilder
		StringBuffer sb = new StringBuffer("가나다");
		sb.append("라마바");	// 메서드 만으로도 문자열 조작이 가능하다.
		System.out.println(sb);
		
		// indexOf("문자열") => 0이 기본값이고, 찾지 못하면 -1을 리턴
		// 해당 문자열의 위치를 파악
		System.out.println(sql.indexOf("board"));
		System.out.println(sql.indexOf("$"));
		
		// length()
		// 문자열의 길이 확인
		System.out.println(sql.length());
		
		// subString()
		// 문자열 부분 추출
		// subString(5), subString(5, 11);
		System.out.println(sql.substring(2));
		System.out.println(sql.substring(2,4));
		System.out.println(sql.substring(6,8));
		
		// Q. sql변수에서 "board" 단어를 추출해보자.(indexOf()와 subString()을 사용하라)
		int q = sql.indexOf("board");
		System.out.println(sql.substring(q, q+5));
		
		//
		String fileName = "kosta.jpg";
		int div = fileName.indexOf(".");
		String head = fileName.substring(0, div);	// head = kosta
		String pattern = fileName.substring(div+1);	// pattern = jpg
		
		System.out.println(head+ "." +pattern);
		
		// 문자열 비교
		String id = "kosta";
//		String m_id = "kosta";
//		String m_id = "Kosta";	// 대문자 포함
		String m_id = "Kosta ";	// 공백 포함
		
		if(id.equals(m_id))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		// 대소문자 구분 없이 문자열 비교
		if(id.equalsIgnoreCase(m_id))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		// 공백을 제거해서 문자열 비교
		if(id.equalsIgnoreCase(m_id.trim()))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		
		// 문자열을 배열로 변환
		String fruits = "사과,배,포도,수박";
		String[] arr = fruits.split(",");	// .은 String에서 문법적 의미가 있기 때문에 \\. 으로 사용해야 한다.
		for(String name : arr)
		{
			System.out.println(name);
		}
		
		// startsWith(), endsWith()
		// 해당 문자열이 매개변수로 시작/종료하는지 확인하는 메서드
		// 리턴값은 boolean
		// 이미지 파일 유무를 체크해보자(kosta.jpg)
		if(fileName.endsWith("jpg"))
		{
			System.out.println("이미지 파일입니다.");
		}
		else
		{
			System.out.println("알 수 없는 파일입니다.");
		}

		// Q. 다음 문자열을 지정한 문자열로 변경하자
		// 원본 = "c:\\Users\\Public\\Pictures\\Sample Pictures\\등대.jpg"
		// 변경 = 등대.jpg ==> 등대_small.jpg
		String path = "c:\\Users\\Public\\Pictures\\Sample Pictures\\등대.jpg";
		String change = path.substring(path.indexOf("jpg")-3);
		String[] resArr = change.split("\\.");
		
		String result = resArr[0]+ "_small." +resArr[1];
		System.out.println(result);
		
		
		
	}// main() : method

}// StringExam : class
