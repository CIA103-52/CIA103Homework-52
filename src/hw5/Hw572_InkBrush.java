package hw5;

// • 建立兩個子類別Pencil與InkBrush繼承Pen父類別 // (建構子不會繼承要自己呼叫)
//   (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//   (2) Pencil實際售價為定價8折，InkBrush為定價9折

public class Hw572_InkBrush extends Hw57_Pen {

	public Hw572_InkBrush(String brand, double price) {
		super(brand, price);
	}

	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}

	@Override
	public double getPrice() {
		return super.getPrice() * 0.9;
	}
}
