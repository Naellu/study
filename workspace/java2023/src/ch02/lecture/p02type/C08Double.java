package ch02.lecture.p02type;

public class C08Double {
	public static void main(String[] args) {
		// 실수
		// float(4 bytes), double(8 bytes)
		
		int i1 = 3;
//		il = 3.14; 정수타입에 실수 값 대입 불가능
		
		double d1 = 3.14;
		d1 = 99.9999;
		d1 = 3;
		// 실수 타입에 정수 저장 가능, 단 출력은 소수점도 같이 반환됨
		d1 = 99;
		
		float f1 = 3.14F; // F, f 끝문자로 float literal 표현
		f1 = 3;
		
		// 10진법 -> 2진법 으로 바꿔서 저장
		
		double d2 = 0.1; // 0.00011001100110011...
		double d3 = 0.2; // 0.00110011001100110011...
		
		double d4 = d2 + d3;
		
		// 근사값으로 나온다
		System.out.println(d4);
		
	}

}
