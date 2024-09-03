package hw5;

// • 利用 Overloading 設計兩個方法，
//   int maxElement(int x[][]) 與 double maxElement(double x[][])，
//   可以找出二維陣列的最大值並回傳。

public class Hw53_MaxElement {

	public int maxElement(int[][] x) {

		int max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public double maxElement(double[][] x) {

		double max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		
		Hw53_MaxElement hw = new Hw53_MaxElement(); // 物件不能呼叫(.)static方法
		                                            // static只能通過類別名稱呼叫(.)
		System.out.println(hw.maxElement(intArray));
		System.out.println(hw.maxElement(doubleArray));

	}
}