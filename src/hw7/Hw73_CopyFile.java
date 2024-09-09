package hw7;

// • 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。
//   呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案。(路徑)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hw73_CopyFile {

	public static void copyFile(String sourcePath, String targetPath) throws IOException {

		File source = new File(sourcePath);
		File target = new File(targetPath);

		FileReader in = new FileReader(source);
		FileWriter out = new FileWriter(target); // 覆蓋原始資料

		BufferedReader bin = new BufferedReader(in);
		BufferedWriter bout = new BufferedWriter(out);

		String str; // 讀取後輸出
		while ((str = bin.readLine()) != null) {
			bout.write(str);
			bout.newLine();
		}

		bout.close();
		bin.close();
		out.close();
		in.close();
		
		System.out.println("檔案複製完畢。");

	}

	public static void main(String[] args) throws IOException {

		copyFile(".\\src\\hw7\\Source.txt", ".\\src\\hw7\\Target.txt");
	}
}
