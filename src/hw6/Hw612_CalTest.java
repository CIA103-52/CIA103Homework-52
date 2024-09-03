package hw6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Hw612_CalTest {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		try {
			System.out.println("====計算x的y次方====");

			System.out.print("請輸入x的值：");
			int x = scn.nextInt();

			System.out.print("請輸入y的值：");
			int y = scn.nextInt();

			Hw61_Calculator cal = new Hw61_Calculator(x, y);
			int result = cal.getPowerXY();

			System.out.println(x + " 的 " + y + " 次方 = " + result);
		}

		catch (Hw611_CalException e) {
			e.printStackTrace();

		} catch (NumberFormatException e) {
			e.printStackTrace();

		} catch (InputMismatchException e) {
			System.err.println("輸入格式不正確");

		} finally {
			scn.close();
		}
	}
}
