package hw4;

//有個一維陣列：{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素。
//(提示：陣列，length屬性)

public class Hw41_AvgValue {

	public static void main(String[] args) {

		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.print("此陣列所有元素的平均值為：");
		System.out.println(sum / array.length);

		int average = 0;
		average = sum / array.length;
		System.out.print("大於平均值的元素是：");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > average) {
				System.out.print(array[i] + " ");
			}
		}
	}
}
