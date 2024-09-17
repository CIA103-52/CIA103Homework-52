package hw9;

// • 熊大在念大學，生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花，不好好唸書，
//   所以只要看到熊大帳戶的餘額超過3000元，就會停止匯款給熊大；
//   但要是帳戶餘額在2000元以下，熊大就會要求媽媽匯款給他。
//   如果帳戶餘額低於熊大要提款的金額，熊大就會暫停提款，直到媽媽告知他錢已經入帳戶。
//   假設媽媽一次匯款 2000 元，熊大一次提款1000元。
//   寫一個Java程式模擬匯款10次與提款10次的情形。(可能有死結發生)
//   **參考範例:TestWaitNotify.java、Work9_2.java

class BankAccount {
	private int balance = 0;

	synchronized public void deposit(int money) {
//		String name = Thread.currentThread().getName();
		while (balance > 3000) {
			System.out.println("餘額已達3000，媽媽暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				// main方法呼叫媽媽執行緒的interrupt()，代表wait被中斷就會觸發此例外
				System.err.println("熊大執行緒已經結束，媽媽執行緒可以休息了");
				return;
				// return 是用來終止"整個方法"的執行，並返回到呼叫該方法的位置。
				// 當方法執行到 return 時，它會立即退出，
				// 不會再執行 return 之後的任何代碼。
				// break是跳出迴圈，迴圈後繼續執行
				// continue是跳過後面但重新開始迴圈
			}
			System.out.println("媽媽被熊大要求匯款！"); // wait狀態醒過來時執行這裡
		}

		balance += money;
		System.out.println("媽媽存了" + money + "，帳戶餘額 = " + balance);
		notify();
	}

	synchronized public void withdraw(int money) {
//		String name = Thread.currentThread().getName();
		while (balance < money) {
			System.out.println("餘額不足，熊大暫停提款...");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("媽媽告知帳戶已經有錢！");
		}
		
		balance -= money;
		System.out.println("熊大領了" + money + "，帳戶餘額 = " + balance);
		if (balance <= 2000) {
			System.out.println("餘額在2000以下，熊大要求匯款");
			notify();
		}
	}
}

class Mama implements Runnable {
	
	private BankAccount account;

	public Mama(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.deposit(2000);
		}
	}
}

class Child implements Runnable {
	
	public static boolean isFinished = false; // 熊大執行緒開始
	
	private BankAccount account;

	public Child(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			account.withdraw(1000);
		}
		isFinished = true; // 代表熊大執行緒已結束
	}
}

public class Hw92_WaitnNotify {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		Mama mom = new Mama(account);
		Child son = new Child(account);
		// 將 BankAccount 物件傳遞給 Mama 和 Child 的構造函數，確保它們操作的是同一個帳戶。
		
		Thread threadMom = new Thread(mom);
		Thread threadSon = new Thread(son);
		
		threadMom.start();
		threadSon.start();

		while (true) { // 無窮迴圈，將一直執行直到手動終止
			if (Child.isFinished && threadMom.isAlive()) {
				threadMom.interrupt();
				// 熊大執行緒結束了但媽媽還在就打斷wait狀態
			}
			try {
				Thread.sleep(500); // 控制無窮迴圈(睡一下)以讓出執行權
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			if (Child.isFinished && !threadMom.isAlive())
				break;
				// 兩個執行緒都結束了，離開迴圈結束main執行
		}
	}
}