package hw3;

//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,
//猜錯會顯示猜錯囉,猜對則顯示答對了！答案就是__。

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r10 = (int) (Math.random() * 10);
		System.out.println("開始猜數字吧！範圍：0~9之間的整數");

		int guess10 = sc.nextInt();

		while (guess10 != r10) {
			System.out.println("猜錯囉");
			guess10 = sc.nextInt();
		}
		System.out.println("答對了！答案就是" + guess10);
		System.out.println("==============================");

// 進階功能:產生0~100亂數,每次猜都會提示你是大於還是小於正確答案

		int r100 = (int) (Math.random() * 101);
		System.out.println("開始猜數字吧！範圍：0~100之間的整數");

		int guess100 = sc.nextInt();

		while (guess100 != r100) {
			if (guess100 < r100) {
				System.out.println("猜大一點");
			} else {
				System.out.println("猜小一點");
			}
			guess100 = sc.nextInt();
		}
		System.out.println("答對了！答案就是" + guess100);
	}
}