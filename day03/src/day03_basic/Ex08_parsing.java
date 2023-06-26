package day03_basic;

public class Ex08_parsing {

	public static void main(String[] args) {
		
		/*
		 * 문자열 변환은 형 변환(casting)이 아니고, 구문 분석(parsing) 이다.
		 * 
		 * 컴퓨터에서 .은 ~안에 즉, in이라는 뜻이다.
		 * 즉, Integer.parseInt 이면 Integer안에 있는 parseInt라는 것이다.
		 * 이미, 라이브러리에 다 만들어져있는 기능을 우리는 끌어다 쓰는것이다.
		 * 
		 * 1. 문자열 -> 정수 (String -> int)
		 * 		String str1 = "100";
		 * 		int a = Integer.parseInt(str1);
		 * 
		 * 2. 문자열 -> 실수
		 * 		String str2 = "1.5";
		 * 		double b = Double.parseDouble(str2);
		 * (더블 안에 있는 파스더블이라는 기능을 사용한다) (더블로 바꿔주는 기능)
		 * 
		 * 3. 문자열 -> 논리
		 * 		String str3 = "true";
		 * 		boolean c = Boolean.parseBoolean(str3);
		 * 
		 * 4. 정수 -> 문자열
		 * 		int d = 100;
		 * 		String str4 = String.valueOf(d);
		 * 		String str4 = "" + d;
		 * (빈 문자열 + 무언가를 하면 문자열로 바뀐다)
		 * 
		 * 5. 실수 -> 문자열
		 * 		double e = 1.5;
		 * 		String str5 = String.valueOf(e);
		 * 		String str5 = "" + e;
		 * (빈 문자열 + 무언가를 하면 문자열로 바뀐다)
		 * 
		 */

		String strAge="20";
		String strHeight="180.5";
		
		int age=Integer.parseInt(strAge);
		double height=Double.parseDouble(strHeight);
		
		System.out.println("나이는"+age+"살이고, 키는"+height+"cm 이다.");
		System.out.println("내년에는"+(age+1)+"살이다.");
		
		
		
		int d = 100;
		String str4 = String.valueOf(d);
		System.out.println(str4);
		
	}

}
