package ch02.lecture.p05print;

public class C09Print {
	public static void main(String[] args) {
		// width 출력할 때 차지할 문자칸 수
		System.out.printf("%d%n", 300);
		System.out.printf("%5d%n", 300);
		System.out.printf("%6d%n", 300);
		System.out.printf("%6d%n", 300300300);
		
		System.out.printf("%6s%n", "hi");
		System.out.printf("%6s%n", "hello world");
		
	}

}
