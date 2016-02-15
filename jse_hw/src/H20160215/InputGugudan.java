package H20160215;

import java.util.Scanner;

public class InputGugudan {
	/*
	 * 단수를 입력받아서 구구단을 출력함
	 * 예를 들어 2를 입력하면 2*1 ~ 2*9 = 18 까지 나옴..
	 * 단, 입력값이 0 또는 음수일땐 잘못 입력받았다고 하고 프로그램 종료
	 * for loop으로 처리
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단수를 입력하시오");
		int s;
		s = scanner.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			
			System.out.println(s+"*" + i +"=" + s*i);
		}
		
	}
}
