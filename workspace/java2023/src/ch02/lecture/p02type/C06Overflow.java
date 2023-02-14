package ch02.lecture.p02type;

public class C06Overflow {
	public static void main(String[] args) {
		int i1 = 2147483647;
		int i2 = i1 + 1;
		
		System.out.println(i1);
		// overflow로 2147483648이 아닌 -2147483647이 나오게 된다
		// 표현할 수 있는 값의 범위를 넘어섰음
		System.out.println(i2);
		
	}

}
