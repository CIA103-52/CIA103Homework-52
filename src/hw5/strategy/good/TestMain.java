package hw5.strategy.good;

public class TestMain {

	public static void main(String[] args) {
		Poppy poppy = new Poppy("波比");
		poppy.setAttackBehavior(new AttackFire());
		poppy.setDefendBehavior(new DefendSheild());
		poppy.setRunBehavior(new Run());
		
		poppy.attack();
		poppy.defend();
		poppy.run();
	}

}
