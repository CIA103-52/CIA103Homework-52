package hw5.strategy.ng;

public class Tahmkench extends Hero {
	
	public Tahmkench(String name) {
		this.name = name;
	}

	@Override
	protected void attack() {
		System.out.println("技能 - 虛弱");
	}

	@Override
	protected void defend() {
		System.out.println("防禦");
	}

	@Override
	protected void run() {
		System.out.println("跑起來！");
	}

}
