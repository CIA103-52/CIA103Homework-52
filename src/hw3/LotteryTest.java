package hw3;

// 從1~49隨機挑出6個不重複的號碼

import java.util.HashSet; // hashset特性：重複時"不加入"
import java.util.Iterator;
import java.util.Set;

public class LotteryTest {

	public static void main(String[] args) {

		Set set = new HashSet();

		while (set.size() != 6) {
			int r = (int) (Math.random() * 49) + 1;
			set.add(r);
		}

		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
	}
}
