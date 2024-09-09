package hw7;

// • 請寫一個程式讀取老師提供的Sample.txt檔案，並輸出以下訊息：
//   Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hw71_CountBytes {

	public static void main(String[] args) throws IOException {

		File inputFile = new File(".\\src\\hw7\\Sample.txt");

		// System.out.println(System.getProperty("user.dir"));
		// 顯示當前工作目錄，檔案在當前目錄裡可以用(.\)檔名，不在的話用路徑

		FileReader fr = new FileReader(inputFile);
		BufferedReader br = new BufferedReader(fr);

		String str;
		int charCount = 0;
		int lineCount = 0;

		while ((str = br.readLine()) != null) {
			// System.out.println(str);
			// System.out.println(str.length());
			charCount += str.length();
			lineCount++;
		}

		System.out.println(
				"Sample.txt檔案共有 " + inputFile.length() + " 個位元組， " + charCount + " 個字元， " + lineCount + " 列資料。");

		br.close();
		fr.close();
	}
}
