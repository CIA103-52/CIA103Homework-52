package hw8;

// • 請建立一個Collection物件並將以下資料加入:
//   Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、
//   “Kitty”、Integer(100)、Object物件、“Snoopy”、BigInteger(“1000”)
//   (1) 印出這個物件裡的所有元素(使用Iterator， 傳統for與foreach)
//   (2) 移除不是java.lang.Number相關的物件
//   (3) 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw81_Collection {

	public static void main(String[] args) {

		List<Object> data = new ArrayList<>();
		
		data.add(100);
		data.add(3.14);
		data.add(21L);
		data.add((short) 100); // Short.valueOf(100)手動裝箱
		data.add("Kitty");
		data.add(100);
		data.add(new Object());
		data.add("Snoopy");
		data.add(new BigInteger("1000"));

		// 使用Iterator取值
		Iterator<Object> objs = data.iterator();

		while (objs.hasNext()) {
			System.out.print(objs.next() + "  ");
		}
		System.out.println();

		// 使用傳統for迴圈取值
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i) + "  ");
		}
		System.out.println();

		// for-each取值
		for (Object element : data) {
			System.out.print(element + "  ");
		}
		System.out.println();
		System.out.println("========================================");

		// 移除非java.lang.Number相關物件
		Iterator<Object> del = data.iterator();
		while (del.hasNext()) {
			Object obj = del.next();
			if (!(obj instanceof Number)) {
				del.remove();
			}
		}

		// 印出移除成功的元素(Iterator)
		Iterator<Object> num = data.iterator();
		while (num.hasNext()) {
			System.out.print(num.next() + "  ");
		}
		System.out.println();

		// (for)
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i) + "  ");
		}
		System.out.println();

		// (for-each)
		for (Object element : data) {
			System.out.print(element + "  ");
		}
		System.out.println();
	}
}
