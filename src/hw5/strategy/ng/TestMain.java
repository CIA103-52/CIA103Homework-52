package hw5.strategy.ng;

public class TestMain {

	public static void main(String[] args) {
		Poppy poppy = new Poppy("波比");
		poppy.attack();
		poppy.defend();
		poppy.run();
		
		System.out.println("============");
		
		Tahmkench tahmkench = new Tahmkench("貪啃奇");
		tahmkench.attack();
		tahmkench.defend();
		tahmkench.run();
	}

}
