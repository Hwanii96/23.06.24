package day03_basic;

public class Ex10_operator2 {

	public static void main(String[] args) {
		
		/*
		 * 4. 관계 연산자
		 * 	1) <=	: 이상, 크거나 같다.
		 * 	2) >	: 초과, 크다.
		 * 	3) <= 	: 이하, 작거나 같다.
		 * 	4) <	: 미만, 작다.
		 * 	5) !=	: 같지 않다.
		 * 	6) ==	: 같다 (기본 자료형 : primitive type)
		 * 		a.equals(b)	:	같다. (참조 자료형 : reference type)
		 * 		(String, 즉, 문자열은 비교 하려고 할 때 ==을 사용 하면 안된다. a.equals(b)로 비교 해야 한다. 참조(주소) 자료형 이기 때문에)
		 * 
		 * 5. 논리 연산자
		 * 	1) &&	:	모든 조건식을 만족하면 true, 아니면 false (and)
		 * 	2) ||	:	조건식을 하나라도 만족하면 true, 전부다 아니면 false (or)
		 * 	3) !	:	not 연산, 결과를 반대로 변경.
		 * 	4) short circuit evaluation 을 지원 :
		 * 		- &&	: false 조건이 하나라도 나타나면 그 이후는 "처리하지 않음".
		 * 				  (and라는 것은 두개 다 모두 true 여야 전체가 true가 되기 때문에 하나라도 false 이면 나머지는 "처리를 하지 않는다")

		 * 		- || 	: true 조건이 하나라도 나타나면 그 이후는 "처리 하지 않음".
		 * 				  (or라는 것은 두개 중 하나라도 true 이면 전체가 true 이기 때문에 굳이 나머지를 "처리 하지 않는다")
		  	
		 * 6. 조건 연산자
		 * 	1) 조건식 ? 조건식이 true인 경우 : 조건식이 false인 경우
		 * 		예) int fee = isAdult ? 4000 : 2000
		 * 		예) int fee =  age >= 20 ? 4000 : 2000
		 * 
		 * 	2) if ~ else 대용으로 널리 사용
		 * 		(왜냐하면 조건문 보다 조건 연산자가 더 앞에 배우는 내용이기도 하고, 조건문 보다 얘가 처리 속도가 더 빠르다)
		 * 
		 */
		
//		1. 관계/논리 연산자
		int a = 100;
		System.out.println(a == 100 && a > 10);
//		a가 100이랑 같니? true. a가 10보다 크니? true. 따라서 논리 and 연산자라 전체가 true가 된다.
		
		System.out.println(a == 100 || a < 10);
//		a가 100이랑 같니? true. a가 10보다 작니? false 하지만 하나라도 true이기 때문에 전체가 true가 된다.
		
		System.out.println(!(a == 100));
//		a가 100이랑 같니? true. 그런데 이 값 자체를 반대로 바꿔 버린다. 결국 false가 된다.
		
//		2. short circuit evaluation
		int b = 100;
		boolean c = (a == 10) && (++b > 10);
		System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);

//		만약에 boolean c = (++b > 10) && (a == 10); 이였으면 b의 값은 101으로 출력 됬을 것이다.
//		왜냐하면 boolean c = (a == 10) && (++b > 10); 얘는, 처음에 (a == 10)가 true 가 아니기 때문에,
//		애초에 전체가 false가 되버린다. 그래서, 그 뒤에 있는 (++b > 10) 얘를 처리 자체를 시도 하지 않는다.
//		이 내용이, 위의 short circuit evaluation에 대한 개념이다.
		
//		\n은 내가 보기 좋으라고 줄바꿈 하려고 넣은것이다. 옆줄로 쭈욱 쓰려면 , 등으로 구분 해 주면 된다.
		
		boolean d = (a == 10) || (++b > 10);
		System.out.println("a = " + a + "\nb = " + b + "\nd = " + d);
		
//		얘는 and가 아니라 or 이기 때문에 처음에 (a == 10) 얘가 true가 아니더라도 둘중에 하나만 true여도 전체가
//		true 이므로 뒤에 (++b > 10) 얘를 처리하게 된다. 그래서 b가 출력 될 때 값이 101로 나오게 된다.
		
//		3. 조건 연산자 (삼항 연산자 : 조건 ? 참 : 거짓)
//			1) 요금 : 성인은 4,000원, 미성년자는 2,000원
		int age = 18;
		boolean isAdult = age >= 20;
		int fee = isAdult ? 4000 : 2000;
		
//		int fee =  age >= 20 ? 4000 : 2000; 도 가능하다.
//		근데 이렇게 안하는게 좋은 이유가, 사회적으로 성인의 나이가 20살로 되어있기 때문이다.
//		만약에 사회적으로 성인의 나이가 다르게 바뀔 경우가 생길 수도 있으니, 
//		age >= 20 으로 사용하게 되면, 아래와 같은 불편하고 비효율적인 상황이 생길 수 밖에 없다.
//		만약에 사회적으로 성인의 나이가 21살로 변경되면, age >= 20 이라고 적혀있는 문장을 찾아내서 일일이 모두 다 수정 해줘야 한다.
//		그러면 20을 전부다 21로 바꿔줘야 하는 번거로움이 생기기 때문에,
//		변수 isAdult를 만들고 (이 변수를 직접 사용 하기 위해서), boolean isAdult = age >= 20 라고 한것이다.
//		boolean 타입의 변수 isAdult에 우변의 조건에 대한 true 또는 false 값을 저장 하는 것이다.
//		사회적으로 성인의 나이가 21살로 바뀐다면, boolean isAdult = age >= 21이라고만 수정 해주면 되기 때문이다.
		
		System.out.println("요금 : " + fee + "원");
		
//			2) 아이디가 "admin"이면 "관리자", 아니면 "일반유저"
		
		String userId = "admin";
		
		System.out.println(userId.equals("admin") ? "관리자" : "일반유저");
		
//		문자열은 ==를 사용 하면 절대 안된다. a.equals(b) 를 사용 해야 한다.
		

		
// --------------------------------------------------------------------		
		
		/*
		String userId = "admin"; 
		String admin;
		String isAdmin = admin
		*/
		
//		위 주석은 의식의 흐름 대로 해본건데 복습 할 때 뭐가 잘못됬는지 꼭 확인 해 보자.
		
// 		아래는 복습할 때 써놓은 것. 나중에 다시 보자. 수업과 관련 없음.
		
		boolean e = userId == "admin";
		
		System.out.println(e);
		
		System.out.println(userId == "admin" ? "관리자" : "일반유저");
		
	}

}