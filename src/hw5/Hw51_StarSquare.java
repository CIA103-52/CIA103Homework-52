package hw5;

// • 請設計一個方法為starSquare(int width, int height)，
//   當使用者鍵盤輸入寬與高時，即會印出對應的*長方形。

import java.util.Scanner;

public class Hw51_StarSquare {

	public static void starSquare(int width, int height) {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("請輸入矩形寬度：");
		int width = scn.nextInt();

		System.out.print("請輸入矩形高度：");
		int height = scn.nextInt();

		starSquare(width, height);

		scn.close();
	}
}
