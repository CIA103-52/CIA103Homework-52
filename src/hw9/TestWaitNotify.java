package hw9;

class Depot {
	private int stock = 0; // 庫存量

	synchronized public void produce(int qty) {
		while (stock > 20) {
			System.out.println("庫存量超過20，暫停生產");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock += qty;
		System.out.println("產量：" + qty + "；庫存量：" + stock);
		notify();
	}

	synchronized public void consume(int qty) {
		while (stock < qty) {
			System.out.println("庫存量不足，暫停消費");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock -= qty;
		System.out.println("消費量：" + qty + "；庫存量" + stock);
		if (stock < 5) {
			System.out.println("庫存量低，催促生產");
			notify();
		}
	}
}

class Producer extends Thread {
	Depot depot;

	public Producer(Depot depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			depot.produce(4); // 每次生產4個
	}
}

class Consumer extends Thread {
	Depot depot;

	public Consumer(Depot depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			depot.consume(3); // 每次消費3個
	}
}

public class TestWaitNotify {
	public static void main(String[] args) {
		Depot depot = new Depot();
		Producer producer = new Producer(depot);
		Consumer consumer = new Consumer(depot);
		producer.start();
		consumer.start();
	}
}
