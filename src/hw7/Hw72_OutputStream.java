package hw7;

// • 請寫一隻程式，能夠亂數產生10個1~1000的整數，
//   並寫入一個名為Data.txt的檔案裡。
//   (請使用append功能讓每次執行結果都能被保存起來)

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Hw72_OutputStream {

	public static void main(String[] args) throws IOException {
		
		File outputFile = new File(".\\src\\hw7\\Data.txt");
		FileWriter wrt = new FileWriter(outputFile, true);
		BufferedWriter bwrt = new BufferedWriter(wrt);

		Random rand = new Random();

		Integer[] r10 = new Integer[10];
		for (int i = 0; i < r10.length; i++) {
			r10[i] = (int) (Math.random() * 1000 + 1);
			bwrt.write(r10[i].toString());
			bwrt.newLine();
		}
		bwrt.close();
		wrt.close();

		System.out.println("資料已成功輸出至 Data.txt。");
	}
}
