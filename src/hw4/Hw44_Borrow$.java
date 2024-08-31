package hw4;

//阿文上班時忘了帶錢包，想要向同事借錢，和他交情比較好的同事共有 5 個，
//其員工編號與身上現金如下：no.25=2500, no.32=800, no.8=500, no.19=1000, no.27=1200
//請設計一個程式，可以讓阿文輸入欲借的金額後，
//便會顯示哪些員工編號的同事有錢可借他，並且統計有錢可借的總人數：
//例如輸入 1000 就顯示「有錢可借的員工編號： 25 19 27 共 3 人!」
//(提示:Scanner，二維陣列)

import java.util.Scanner;

public class Hw44_Borrow$ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] array = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };

		System.out.println("要借多少錢？");
		int input = sc.nextInt();

		System.out.print("有錢可借的員工編號：");
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (input <= array[i][1]) {
				System.out.print(array[i][0] + " ");
				count++;
			}
		}
		System.out.println("共" + count + "人!");
		sc.close();
	}
}
