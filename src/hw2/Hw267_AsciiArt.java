package hw2;

public class Hw267_AsciiArt {

	public static void main(String[] args) {

// • 請設計一隻Java程式，輸出結果為以下：
//   1 2 3 4 5 6 7 8 9 10
//   1 2 3 4 5 6 7 8 9
//   1 2 3 4 5 6 7 8
//   1 2 3 4 5 6
//   1 2 3 4 5
//   1 2 3 4
//   1 2 3
//   1 2
//   1

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 11 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();

// • 請設計一隻Java程式，輸出結果為以下：
//   A
//   BB
//   CCC
//   DDDD
//   EEEEE
//   FFFFFF

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				char letter = (char) ('A' + i);
				System.out.print(letter);
			}
			System.out.println();
		}
	}
}
