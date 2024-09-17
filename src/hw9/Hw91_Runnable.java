package hw9;

// • 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
//   每個動作都以 Thread.sleep()暫停一下，以達到顯示效果。
//   Sleep時間由亂數產生500~3000之間的毫秒數。
//   **參考範例:CounterRunnable.java
//   需留意主執行緒執行順序

public class Hw91_Runnable implements Runnable {

	private String name;
	private long endTime;

	public Hw91_Runnable() {
	}

	public Hw91_Runnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		int i = 1;
		while (i <= 10) {
			System.out.println(name + "吃第" + i + "碗飯");
			i++;
			try {
				Thread.sleep((int) (Math.random() * 2501) + 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			Thread.sleep((int) (Math.random() * 2501) + 500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "吃完了！");

		endTime = System.currentTimeMillis();
	}

	public long getEndTime() {
		return endTime;
	}

	public static void main(String[] args) {

		System.out.println("-----大胃王快食比賽開始！-----");

		Hw91_Runnable r1 = new Hw91_Runnable("饅頭人");
		Hw91_Runnable r2 = new Hw91_Runnable("		詹姆士");

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("-----大胃王快食比賽結束！-----");
		System.out.println();

		if (r1.getEndTime() < r2.getEndTime()) {
			System.out.println(r1.name + "獲勝！");
		}

		else if (r1.getEndTime() > r2.getEndTime()) {
			System.out.println(r2.name + "獲勝！");

		} else {
			System.out.println("-----平手！-----");
		}
	}
}