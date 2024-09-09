package hw7;

// • 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，
//   寫到C:\data\Object.ser裡。注意物件寫入需注意的事項。
//   若C:\內沒有data資料夾，請用程式新增這個資料夾。

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Hw74_ObjectOutputStream {

	public static void main(String[] args) throws IOException {

		Dog[] dogs = new Dog[2];
		dogs[0] = new Dog("Douglas");
		dogs[1] = new Dog("Dora");

		Cat[] cats = new Cat[2];
		cats[0] = new Cat("Carey");
		cats[1] = new Cat("Carol");

		File dir = new File("C:\\data");

		if (!dir.exists()) {
			dir.mkdir();
		}

		File file = new File("C:\\data\\Object.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < dogs.length; i++)
			oos.writeObject(dogs[i]);

		for (int i = 0; i < cats.length; i++)
			oos.writeObject(cats[i]);

		oos.close();
		fos.close();

		System.out.println("物件輸出完畢。");
		System.out.println();
	}
}
