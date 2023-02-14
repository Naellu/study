package ch02.sec01;

public class VariableUseExample {
	public static void main(String[] args) {
		// Ctrl + 1을 눌러서 rename 누르고 같은 이름인 변수 동시 변경
		// Ctrl + Shift + f 눌러서 줄 맞추기
		int myHour = 3;
		int min = 5;

		System.out.println(myHour + "시간" + min + "분");

		int totalMinute = (myHour * 60) + min;
		System.out.println("총 " + totalMinute + "분");

	}

}
