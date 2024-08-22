package hw2;

public class ContProduct {

	public static void main(String[] args) {

//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)	

		int product = 1;
		for (int i = 1; i <= 10; i++) {
			product *= i;
		}
		System.out.println("使用for迴圈計算連乘積：" + product);

//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

		int prod = 1;
		int j = 1;
		while (j <= 10) {
			prod *= j;
			j++;
		}
		System.out.println("使用while迴圈計算連乘積：" + prod);
	}
}
