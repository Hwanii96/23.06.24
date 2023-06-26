package day03_basic;

public class Ex09_operator1 {

	public static void main(String[] args) {
		
		/*
		 * 1. 산술 연산자
		 * 		1) + 
		 * 		2) - 
		 * 		3) * 
		 * 		4) / : 정수(몫), 실수(나누기)
		 * 		5) % : 정수(나머지) (나머지 값이 나온다)
		 * (java에서는 나누기가 우리가 아는 /가 있고, %가 있다)
		 * 	
		 * 2. 대입 연산자
		 * 		1) = : 대입
		 * 		2) += : 더해서 대입
		 * 			int a=3;
		 * 			a=a+4; (문법상 상식적으로, 좌변의 a는 변수, 우변의 a는 값으로 사용된것이다)
		 * (따라서 a를 3으로 초기화 했는데, 그 값 3을 우변의 a에 대입해서 좌변의 변수 a는 7이 되는 것이다)
		 * 		3) -= : 빼서 대입
		 * 		4) *= : 곱해서 대입
		 * 		5) /= : 몫을 구해서 대입, 나눠서 대입
		 * 		6) %= : 나머지를 구해서 대입
		 * 
		 * 3. 증감 연산자
		 * 		1) a++ : a를 사용하고 1증가
		 * 		2) ++a : a를 1증가 시키고(시켜서) 사용
		 * 		3) a-- : a를 사용하고 1감소
		 * 		4) --a : a를 1감소 시키고(시켜서) 사용
		 * 
		 * 
		 * 
		 */

		System.out.println(1+2);
		System.out.println(3-2);
		System.out.println(2*4);
		System.out.println(10/3);
		System.out.println(10%3);
		
		int a=100;
		a+=3; // (a=a+3)
		System.out.println(a);
		a-=90; // (a=a-90)
		System.out.println(a);
		
		System.out.println("----------");
		
		int num=1;
		System.out.println(num++);
		// 괄호안에 있는 num을 출력 명령어 (println)로 먼저 사용하고 이후에 num을 1 증가 시킨다.
		System.out.println(num++); // 2
		System.out.println(++num); // 4
		// 괄호안에 있는 num에 1을 먼저 증가시키고 출력 시킨다.
		
		int num2=3;
		System.out.println(num2--); // 3
		System.out.println(num2); // 2
		System.out.println(--num2); // 1
		
		// 임의의 2자리 정수 (10 ~ 99)를 선언하고
		// 그 수가 카프리카수 인지 판단해서 맞으면 true, 아니면 false를 저장
		// 81은 카프리카수 이다.
		
		int n = 55;
		int square = n * n;
		// n의 제곱이 6561이면 분리된 앞자리가 65, 분리된 뒷자리가 61이다.
		// 65이랑 61랑 더한 값이 126이고 126 곱하기 126이 처음 그 수가 나오면 그걸 카프리카수 라고 한다. 
		// 결론은 6561은 카프리카수가 아니다.
		
		// n의 제곱이 3025이면 분리된 앞자리가 30, 분리된 뒷자리가 25이다.
		// 그러면 30이랑 25랑 더한 값이 55이고, 55곱하기 55를 하면 3025가 나오므로, 얘는 카프리카 수가 맞다.
		
		int front = square/100; // 분리된 앞 자리 30 (3000을 100으로 나누면 30이 나온다)
		int back = square%100; // 분리된 뒷 자리 25 (3025를 100으로 나누면 몫이 30 나머지가 25가 나오므로 25 이다)
		boolean isKaprekar = n == (front + back);
		System.out.println(isKaprekar);
		
		
		
		int n2 = 126;
		int square2 = n2 * n2;
		
		int front2 = square2/100;
		int back2 = square2%100;
		boolean isKaprekar2 = n2 == (front2 + back2);
		System.out.println(isKaprekar2);
		
	}

}
