package hw5.strategy.ng;

public abstract class Hero {
	protected String name;
	protected abstract void attack();
	protected abstract void defend();
	protected abstract void run();
}
