package hw8;

import java.util.Objects;

// • 請設計一個Train類別，並包含以下屬性:
//   - 班次 int number  - 車種 String type  - 出發地 String start
//   - 目的地 String dest  - 票價 double price
//   設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，
//   放到每小題需使用的集合裡
//   - (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//   - (1254, “區間”, “屏東”, “基隆”, 700)
//   - (118, “自強”, “高雄”, “台北”, 500)
//   - (1288, “區間”, “新竹”, “基隆”, 400)
//   - (122, “自強”, “台中”, “花蓮”, 600)
//   - (1222, “區間”, “樹林”, 七堵, 300)
//   - (1254, “區間”, “屏東”, “基隆”, 700)

public class Hw821_Train implements Comparable<Hw821_Train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Hw821_Train() {
	};

	public Hw821_Train(int number, String type, String start, String dest, double price) {

		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getStart() {
		return start;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getDest() {
		return dest;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void showInfo() {
		System.out.println(number + ", " + type + ", " + start + ", " + dest + ", " + price);
	}	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true; // 檢查是否相同物件 (for性能優化)
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false; // 空值或不同類別...無法比較
		}
		Hw821_Train other = (Hw821_Train) obj; // 將 obj 強制轉換為 Hw821_Train 類別進行比較
		if (number == other.number &&
				Double.compare(price, other.price) == 0 &&
				Objects.equals(type, other.type) &&
				Objects.equals(start, other.start) &&
				Objects.equals(dest, other.dest)) // 比較所有字段的值，確保它們相等。
		{
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = result * 31 + number;
		result = result * 31 + (type != null ? type.hashCode() : 0);
		result = result * 31 + (start != null ? start.hashCode() : 0);
		result = result * 31 + (dest != null ? dest.hashCode() : 0);
		result = result * 31 + (int) price;
		return result;
	}

	// 實作cpmpareTo進行大小排序
	public int compareTo(Hw821_Train t2) {
		return Integer.compare(this.getNumber(), t2.getNumber());
	}
}
