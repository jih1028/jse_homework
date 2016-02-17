package H20160216;

import java.util.Scanner;

public class DateMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DateService dateS = new DateServiceImpl();
		int year = 0, month = 0;
		String endOfDay = "";
		System.out.println("**날짜 프로그램**");
		while (true) {
			
			System.out.println("[메뉴]\n 1.해당년월의 마지막날 구하기 \n 9. 종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("년을 입력하시오 : ");
				year = scanner.nextInt();
				System.out.println("월을 입력하시오 : ");
				month = scanner.nextInt();
				endOfDay = dateS.getEndDayOfMonth(year, month);
				if (endOfDay != "") {
					System.out.println("\n\n\n"+year + "년" + month + "월의 마지막 날은 " + endOfDay + "일 입니다.");
				} else {
					System.out.println("잘못된 값을 입력했음");
				}
				break;
			case 9: return;
			default:
				break;
			}	
		}
		
		
	}
}
