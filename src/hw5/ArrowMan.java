package hw5;

public class ArrowMan extends Hero {
	
	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
	}

	@Override
	public void attack() {
		System.out.println("放弓箭");
	}

	@Override
	public void move() {
		System.out.println("跑步");
	}

	@Override
	public void defend() {
		System.out.println("做防禦動作");
	}
}
