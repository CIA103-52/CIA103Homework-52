package hw5;

// • 請設計一個方法為randAvg()，
//   從10個0~100(含100)的整數亂數中取平均值，並印出這10個亂數與平均值。

public class Hw52_RandAvg {

	public static void randAvg() {

		int[] array = new int[10];

		System.out.print("隨機亂數：");

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 101);
			System.out.print(array[i] + " ");
			sum += array[i];
		}

		int avg = sum / array.length;

		System.out.println();
		System.out.print("平均值 = " + avg);
	}

	public static void main(String[] args) {

		randAvg();

	}
}
