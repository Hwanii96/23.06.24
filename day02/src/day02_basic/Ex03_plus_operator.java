package day02_basic;

public class Ex03_plus_operator {

	public static void main(String[] args) {
		
//		플러스 연산자 (문자열을 연결시켜주는 기능도 한다)
		
//		1. 숫자끼리의 + 연산자 : 산술 연산자
		System.out.println(1+1);
		System.out.println(1.5+2.5);
		System.out.println(1.5+2);
		
//		2. 문자열이 포함된 + 연산자 : 연결 연산자
//		c 에서는 strcat 함수
		System.out.println("Hello"+"World");
		
//		3. 출력 결과를 예상해보기.
		System.out.println(100+"원");
		System.out.println(100+100+"원");
		System.out.println("$"+100);
		System.out.println("$"+100+100);
//		컴퓨터는 위에서 부터 아래로 왼쪽에서부터 오른쪽으로 읽는다.
//		문자와 숫자를 더하면 숫자는 문자 타입으로 변경된다.
//		"$+100 -> "$100"
//		"$100"+100 -> $100100
		System.out.println("$"+(100+100));
//		괄호안에 있는 100+100을 먼저 더해서 200이 나오고, "$"+200 이다.
//		따라서 $200 이다.
		
		//	git test
		
	}

}
