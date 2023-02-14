package ch02.lecture.p01.variable;

public class C01Variable {
	public static void main(String[] args) {
		// 변수
		// 값을 담을 수 있는 이름있는 공간
		
		int age;
		double average;
		
		// 변수명
		// 영문대소문자, _, $, 숫자 조합으로 작성가능, 숫자시작 X
		// 변수명 작성 관습 : lowerCamelCase
		
		int $;
		// int _; _ 만 써서 변수명 불가
		int hello;
		int your_age; // yourAge
		int h3;
		// int 3h; 숫자 시작불가
		int 나이; // 한글도 되지만 권장X
		
		// 변수명 여러개 선언가능
		int myAge, hisAge, herAge;
		
		// 같은 이름의 변수 선언 불가
		int hi;
//		int hi; <-  x
		
		// 변수에 값 대입(할당)
		hi = 3;
		
		// 변수 선언, 값 대입 - 초기화
		int var2 = 100;
		
		// 여러개 가능
		int var3 = 20, var4 = 30;
		
		// 값을 할당하지 않은 변수 사용불가
		// 초기화하지 않은 변수 사용 불가
		int var5;
//		System.out.println(var5);
		
		// 변수명 작성시 어떤 값을 갖는지 알아볼 수 있게
		int koreanScore;
		int ks; // x
		int englishScore;
		
		
		
	}

}
