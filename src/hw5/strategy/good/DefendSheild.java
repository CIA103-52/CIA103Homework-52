package hw5.strategy.good;

public class DefendSheild implements IDefendBehavior {

	@Override
	public void defend() {
		System.out.println("用盾牌格擋");
	}

}
