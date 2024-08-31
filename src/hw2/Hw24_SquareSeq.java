package hw2;

//請設計一隻Java程式，輸出結果為： 1 4 9 16 25 36 49 64 81 100

public class Hw24_SquareSeq {

	public static void main(String[] args) {

		int square = 1;
		for (int i = 1; i <= 10; i++) {
			square = i * i;
			System.out.print(square + " ");
		}
	}
}
