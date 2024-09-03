package hw5.strategy.good;

public abstract class Hero {
	protected String name;
	
	private IAttackBehavior attackBehavior;
	private IDefendBehavior defendBehavior;
	private IRunBehavior runBehavior;
	
	public void setAttackBehavior(IAttackBehavior attackBehavior) {
		this.attackBehavior = attackBehavior;
	}
	public void setDefendBehavior(IDefendBehavior defendBehavior) {
		this.defendBehavior = defendBehavior;
	}
	public void setRunBehavior(IRunBehavior runBehavior) {
		this.runBehavior = runBehavior;
	}
	
	protected void attack() {
		attackBehavior.attack();
	}
	
	protected void defend() {
		defendBehavior.defend();
	}
	
	protected void run() {
		runBehavior.run();
	}
}
