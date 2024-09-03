package hw5;

// • 建立父類別Pen
//   (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計)
//   (2) 建構子設計：一個無參數與一個根據屬性而設計
//   (3) 定義Getter/Setter方法
//   (4) 宣告一個抽象方法write()

public abstract class Hw57_Pen {

	private String brand;
	private double price;

	public Hw57_Pen() { // 保留無參數建構子
		// super(); 通常省略
	}

	public Hw57_Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public abstract void write();
}