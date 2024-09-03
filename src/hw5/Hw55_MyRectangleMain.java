package hw5;

// • 請另外建立一個MyRectangleMain類別，此類別只有main方法
//   (1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
//   (2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果

public class Hw55_MyRectangleMain {

	public static void main(String[] args) {

		Hw54_MyRectangle r1 = new Hw54_MyRectangle();

		r1.setWidth(10);
		r1.setDepth(20);

		System.out.println("Area of r1: " + r1.getArea());

		Hw54_MyRectangle r2 = new Hw54_MyRectangle(10, 20);

		System.out.println("Area of r2: " + r2.getArea());
	}
}
