package hw5.strategy.ng;

public class Poppy extends Hero {
	
	public Poppy(String name) {
		this.name = name;
	}
	
	@Override
	protected void attack() {
		System.out.println("技能 - 點燃");
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
