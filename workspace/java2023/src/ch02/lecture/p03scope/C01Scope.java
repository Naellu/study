package ch02.lecture.p03scope;

public class C01Scope {
	public static void main(String[] args) {
		// 변수의 사용범위(scope)
		// 선언된 블락 안에서만 사용가능
		
		int v1 = 1;
		System.out.println("v1: " + v1);
		if(true) {
			int v2 = 2;
			if(true) {
				int v3 = 2;
				System.out.println("v1: " + v1);
				System.out.println("v2: " + v2);
				System.out.println("v3: " + v3);
			}
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
//			System.out.println("v3: " + v3); 컴파일 에러
		}
		System.out.println("v1: " + v1);
//		System.out.println("v2: " + v2); 컴파일 에러
	}

}
