package hw5;

// • 建立兩個子類別Pencil與InkBrush繼承Pen父類別
//   (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//   (2) Pencil實際售價為定價8折，InkBrush為定價9折

public class Hw571_Pencil extends Hw57_Pen {

	public Hw571_Pencil(String brand, double price) {
		super(brand, price);
	}

	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
	}

	@Override
	public double getPrice() {
		return super.getPrice() * 0.8;
	}
}
