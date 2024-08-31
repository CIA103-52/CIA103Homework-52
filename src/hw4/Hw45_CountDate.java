package hw4;

//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天。
//例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」。
//(提示1：Scanner，陣列)
//(提示2：需將閏年條件加入)
//(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

import java.util.Scanner;

public class Hw45_CountDate {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("請輸入西元年(yyyy)：");
		int y = scn.nextInt();

		while (y < 1) {
			System.out.print("請輸入有效的年份(>0)：");
			y = scn.nextInt();
		}

		System.out.print("請輸入月份(mm)：");
		int m = scn.nextInt();

		while (m < 1 || m > 12) {
			System.out.print("請輸入有效的月份(1~12)：");
			m = scn.nextInt();
		}

		System.out.print("請輸入日期（dd）：");
		int d = scn.nextInt();

		boolean leapYear = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);

		switch (m) {
		case 1, 3, 5, 7, 8, 10, 12:
			while (d < 1 || d > 31) {
				System.out.print("請輸入有效日期(1~31)：");
				d = scn.nextInt();
			}
			break;

		case 4, 6, 9, 11:
			while (d < 1 || d > 30) {
				System.out.print("請輸入有效日期(1~30)：");
				d = scn.nextInt();
			}
			break;

		case 2:
			int feb = leapYear ? 29 : 28;
			while (d < 1 || d > feb) {
				System.out.print("請輸入有效日期(1~" + feb + ")：");
				d = scn.nextInt();
			}
			break;
		}

		int[] dayInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (leapYear) {
			dayInMonth[1] = 29;
		}

		int dayOfYear = 0;

		for (int i = 0; i < m - 1; i++) {
			dayOfYear += dayInMonth[i];
		}
		dayOfYear += d;

		System.out.println("您輸入的日期為該年的第" + dayOfYear + "天");

		scn.close();
	}
}
