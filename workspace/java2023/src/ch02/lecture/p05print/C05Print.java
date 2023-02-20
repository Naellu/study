package ch02.lecture.p05print;

import java.util.Scanner;

public class C05Print {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수:");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 수:");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		
		// 그냥 print문에 적어서 사용
		System.out.println(num1 + " + " + num2 + " = " + sum);
		// printf문으로 format string을 사용
		System.out.printf("%d + %d = %d%n", num1, num2, sum);
		
		
	}

}
