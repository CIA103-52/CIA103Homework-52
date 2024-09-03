package hw5;

// • 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
//   請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
//   此驗證碼內容包含了英文大小寫與數字的亂數組合。

public class Hw56_GenAuthCode {

	public static void genAuthCode() {

		char[] code = new char[62];

		for (int i = 0; i < 26; i++) {
			code[i] = (char) ('a' + i);
		}

		for (int i = 0; i < 26; i++) {
			code[26 + i] = (char) ('A' + i);
		}

		for (int i = 0; i < 10; i++) {
			code[52 + i] = (char) ('0' + i);
		}

		int[] index = new int[8];
		for (int i = 0; i < index.length; i++) {
			index[i] = (int) (Math.random() * 62);
			System.out.print(code[index[i]]);
		}
	}

	public static void main(String[] args) {

		System.out.println("本次隨機產生驗證碼");

		System.out.print("Way I  : ");
		genAuthCode();

		System.out.println();

		System.out.print("Way II : ");
		genAuthCode2();

	}

	public static void genAuthCode2() {

		char[] code = new char[8];

		for (int i = 0; i < code.length; i++) {

			int index = (int) (Math.random() * 3);

			switch (index) {

			case 0:
				code[i] = (char) ('A' + (int) (Math.random() * 26));
				break;

			case 1:
				code[i] = (char) ('a' + (int) (Math.random() * 26));
				break;

			case 2:
				code[i] = (char) ('0' + (int) (Math.random() * 10));
				break;
			}

			System.out.print(code[i]);
		}
	}
}