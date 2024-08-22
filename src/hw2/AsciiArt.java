package hw2;

public class AsciiArt {

	public static void main(String[] args) {

//請設計一隻Java程式,輸出結果為以下:
// 1 2 3  
// 1 2 
// 1  

		int i;
		int j;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 11 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();

//請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC

		int x;
		int y;
		for (x = 0; x <= 5; x++) {
			for (y = 0; y <= x; y++) {
				char letter = (char) ('A' + x);
				System.out.print(letter);
			}
			System.out.println();
		}
	}
}
