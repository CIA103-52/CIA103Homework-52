package hw3;

//阿文很喜歡簽大樂透(1~49)，他想要依心情決定討厭哪個數字，
//請設計一隻程式，讓阿文可以輸入他不想要的數字(1~9)，畫面會顯示他可以選擇的號碼與總數。

import java.util.Scanner;

public class Hw33_PickNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入1~9你討厭哪個數字？");
		int num = sc.nextInt();

		while (!(num >= 1 && num <= 9)) {
			System.out.println("請輸入1~9之間的數字");
			num = sc.nextInt();
		}

		int[] lottery = new int[50];
		int count = 0;
		for (int i = 1; i < lottery.length; i++) {
			if (!(i % 10 == num || i / 10 == num)) {
				lottery[i] = i;
				System.out.print(lottery[i] + " ");
				count++;
			}
		}

		System.out.println();
		System.out.println("總共有" + count + "個數字可選");
		System.out.println();

//進階挑戰：輸入不要的數字後，亂數印出6個號碼且不得重複。
		
		System.out.println("=====從中亂數印出6個號碼且不重複=====");

		int pick = 0;
		while (pick < 6) {
			int random = (int) (Math.random() * 49 + 1);
			if (lottery[random] != 0) {
				System.out.print(lottery[random] + " ");
				lottery[random] = 0;
				pick++;
			}
		}
		sc.close();
	}
}
