package hw4;

// • 有個字串陣列如下 (八大行星)：
//   {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//   請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//   (提示:字元比對，String方法)

import java.util.Arrays;

public class Hw43_CharComp {

	public static void main(String[] args) {

		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		String result = Arrays.toString(planet);

		int count = 0;
		for (int i = 0; i < result.length(); i++) {
			char c = result.charAt(i);
			switch (c) {
			case 'a','e','i','o','u':
				count++;
			}
		}
		System.out.print("本字串共有" + count + "個母音");
	}
}
