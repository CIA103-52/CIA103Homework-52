package hw7;

// • 承上題，請寫一個程式，能讀取Object.ser這四個物件，
//   並執行speak()方法觀察結果如何。(請利用多型簡化本題的程式設計)

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Hw751_ObjectInputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			while (true) {
				((Hw750_Pet) ois.readObject()).speak();
				System.out.println("--------------------");
			}
			
		} catch (EOFException e) {
			System.out.println("資料讀取完畢。");
		}
		
		ois.close();
		fis.close();
	}
}