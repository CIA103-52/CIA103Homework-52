package hw2;

public class F {
	public static void main(String[] args) {
	    	 int count = 0; // 用來計算不包含數字 4 的數字的數量
	         
	         // 遍歷 1 到 50 的數字
	         for (int i = 1; i <= 50; i++) {
	             // 檢查數字是否不包含 '4'
	             if (!containsFour(i)) {
	            	 if (!containsFour(i)) {
	                     System.out.print(i);
count++;
	             }
	         }
	         
	         System.out.println("不包含數字 4 的數字總數是：" + count);
	     }
	}

	// 檢查數字是否包含 '4'
	private static boolean containsFour(int number) {
		// 將數字轉為字符串形式
		String numStr = Integer.toString(number);
		// 檢查字符串中是否包含 '4'
		return numStr.contains("4");
	}
}