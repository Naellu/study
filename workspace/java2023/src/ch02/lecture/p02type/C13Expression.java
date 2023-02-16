package ch02.lecture.p02type;

public class C13Expression {
	public static void main(String[] args) {
		// 연산 중 자동 형변환
		
		byte b1 = 30;
		byte b2 = 10;
		
		// byte, short, int의 연산 결과는 int
//		byte b3 = b1 + b2;
		int i3 = b1 + b2;
		
		byte b4 = (byte) (b1 + b2);
		byte b5 = 30 + 10; // literal값, 컴파일할 떄 b5에 바로 40을 넣어버림
		
		long l6 = 30;
		long l7 = 10;
		long l8 = l6 + l7;
		
		int i9 = 20;
		int i10 = (int) (i9 + l7);
		
	}

}
