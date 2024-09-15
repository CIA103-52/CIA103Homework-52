package hw4;

// • 請建立一個字串，經過程式執行後，輸入結果是反過來的。
//   例如String s = “Hello World”，執行結果即為dlroW olleH
//   (提示；String方法，陣列)

import java.util.Scanner;

public class Hw42_ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入字串");
		String input = sc.nextLine();

		// 方法1
		char[] strArray = input.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		// 方法2寫法1
		StringBuffer stringBuffer = new StringBuffer(input);
		System.out.print(stringBuffer.reverse());
		System.out.println();
		
		// 方法2寫法2
		System.out.println(new StringBuffer(input).reverse());
		
		sc.close();
	}
}
