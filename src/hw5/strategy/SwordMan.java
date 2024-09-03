package hw5;

public class SwordMan extends Hero {
	
	public SwordMan() {
		super();
	}
	
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	@Override
	public void attack() {
		System.out.println("揮劍");
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
