package hw3;

//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭的數字是4,
//	這次他想要依心情決定討厭哪個數字,
//	請設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數。

import java.util.Scanner;

public class PickNum {

	public static void main(String[] args) {

		System.out.println("阿文...請輸入0~9你討厭哪個數字？");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		System.out.println();
		for (int i = 1; i <= 49; i++) {
			if (i % 10 == num || i / 10 == num) {
			} else {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("總共有" + count + "個數字可選");
	}
}

//	進階挑戰：輸入不要的數字後，亂數印出6個號碼且不得重複。
