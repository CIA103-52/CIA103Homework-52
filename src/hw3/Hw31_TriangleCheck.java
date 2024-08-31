package hw3;

// • 請設計一隻程式，使用者輸入三個數字後，
//   輸出結果會為正三角形、等腰三角形、直角三角形、其它三角形或不是三角形。

import java.util.Scanner;

public class Hw31_TriangleCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a + b > c && a + c > b && b + c > a) {
			if (a == b && b == c) {
				System.out.println("正三角形");
			} else if (a == b && b != c || a == c && c != b || b == c && c != a) {
				System.out.println("等腰三角形");
			} else if (pyththm(a, b, c)) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}
		sc.close();
	}

// 進階功能：加入直角三角形的判斷。

	public static boolean pyththm(double a, double b, double c) {
		double asquared = Math.pow(a, 2);
		double bsquared = Math.pow(b, 2);
		double csquared = Math.pow(c, 2);
		return (asquared + bsquared == csquared || asquared + csquared == bsquared || csquared + bsquared == asquared);
	}
}
