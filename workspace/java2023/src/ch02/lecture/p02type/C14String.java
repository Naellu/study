package ch02.lecture.p02type;

public class C14String {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "h";
//		char c1 = (char) s2; -> 참조타입과 기본타입간 형변환 안됨
		String s3 = "";
		
		// 문자열(String)과 기본타입간 형변환
		
		// 문자열 -> 기본타입
		String str1 = "300";
		int i1 = Integer.parseInt(str1);
		System.out.println(i1);
		
		String str2 = "900000000000";
		long l2 = Long.parseLong(str2);
		System.out.println(l2);
		
		String str3 = "9.99";
		float f4 = Float.parseFloat(str3);
		System.out.println(f4);
		
		String str4 = "";
		
	}

}
