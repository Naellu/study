package ch02.lecture.p02type;

public class C12Casting {
	public static void main(String[] args) {
		// 정수끼리
		// 큰타입 -> 작은타입 : 강제형변환(casting)
		int i1; // 4bytes
		long l1; // 8bytes
		
		l1 = 30;
		i1 = (int) l1; // 강제형변환(casting)
		System.out.println(i1);
		
		l1 = 3000000000L;
		i1 = (int) l1;
		System.out.println(l1);
		System.out.println(i1);
		
		short s1;
		byte b1;
		
		s1 = 20000;
		b1 = (byte) s1;
		// 캐스팅 하고나면 값의 일부를 잃어버릴 수 있음
		System.out.println(s1);
		System.out.println(b1);
		
		double d2;
		int i2;
		
		d2 = 3.14;
		i2 = (int) d2;
		// 실수 -> 정수로 캐스팅해서 소수점이 사라진 경우
		System.out.println(d2);
		System.out.println(i2);
	}

}
