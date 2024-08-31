package hw2;

public class Hw223_ContProduct {

	public static void main(String[] args) {

//請設計一隻Java程式，計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)	

		int product1 = 1;
		for (int i = 1; i <= 10; i++) {
			product1 *= i;
		}
		System.out.println("使用for迴圈計算連乘積：" + product1);

		
//請設計一隻Java程式，計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

		int product2 = 1;
		int j = 1;
		while (j <= 10) {
			product2 *= j;
			j++;
		}
		System.out.println("使用while迴圈計算連乘積：" + product2);
	}
}
