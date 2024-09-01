package hw4;

// • 班上有8位同學，他們進行了6次考試，結果如圖。請算出每位同學考最高分的次數。
//   (提示:二維陣列)

public class Hw46_HScoreTimes {

	public static void main(String[] args) {
		
		int[][] score = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] hScoreTimes = new int[8]; // 紀錄8位同學考最幾次最高分的矩陣

		for (int i = 0; i < score.length; i++) {

			int hScore = score[i][0]; // 只能宣告在這，因為再外面一點跳出迴圈的時候又指定回去了。

			for (int j = 1; j < score[i].length; j++) {
				if (score[i][j] > hScore) {
					hScore = score[i][j];
				}
			}

			for (int j = 0; j < score[i].length; j++) {
				if (score[i][j] == hScore) {
					hScoreTimes[j]++; // hSscoreTimes[j] = hSscoreTimes[j] + 1
				}
			}
		}

		for (int i = 0; i < hScoreTimes.length; i++) { // hScoreTimes = { 2, 1, 1, 1, 0, 0, 1 };
			System.out.println("6次考試中，" + (i + 1) + "號同學考 " + hScoreTimes[i] + " 次最高分");
		}
	}
}