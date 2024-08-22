package hw1;

public class Hw1 {

	public static void main(String[] args) {

//請設計一隻Java程式,計算12,6這兩個數值的和與積

		int num1 = 12, num2 = 6;

		System.out.println("相加=" + (num1 + num2));
		System.out.println("相乘=" + num1 * num2);

//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

		int eggnum = 200;
		System.out.println((eggnum / 12) + "打" + (eggnum % 12) + "顆");

//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒		

		int second = 256559;
		System.out.print(second / 86400 + "天");

		second %= 86400;
		System.out.print(second / 3600 + "時");

		second %= 3600;
		System.out.print(second / 60 + "分");

		System.out.println(second % 60 + "秒");

//• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

		final double PI = 3.1415;
		double r = 5;
		System.out.println("圓面積=" + Math.pow(r, 2) * PI);
		System.out.println("圓周長=" + 2 * r * PI);

//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,
//  本金加利息共有多少錢 (用複利計算,公式請自行google)

		int principle = 1_500_000;
		double interest = 0.02;
		double year = 10;

		System.out.println("本利和=" + (principle + principle * Math.pow((1.0 + interest), year)) + "元");

//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果，
//	並請用註解各別說明答案的產生原因。
//5 + 5
//5 + ‘5’
//5 + “5”

		System.out.println(5 + 5);   // 兩個數值相加
		System.out.println(5 + '5'); // 數字與ASCII編碼號碼相加
		System.out.println(5 + "5"); // 數字與字串串接

	}

}
