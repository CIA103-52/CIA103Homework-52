package hw8;

//   (1) 請寫一隻程式，能印出不重複的Train物件
//   (2) 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
//   (3) 承上，不僅能讓班次編號由大排到小印出，還可以不重複印出Train物件
//   (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hw822_Collection {

	public static void main(String[] args) {

		Hw821_Train[] train = new Hw821_Train[7];
		train[0] = new Hw821_Train(202, "普悠瑪", "樹林", "花蓮", 400);
		train[1] = new Hw821_Train(1254, "區間", "屏東", "基隆", 700);
		train[2] = new Hw821_Train(118, "自強", "高雄", "台北", 500);
		train[3] = new Hw821_Train(1288, "區間", "新竹", "基隆", 400);
		train[4] = new Hw821_Train(122, "自強", "台中", "花蓮", 600);
		train[5] = new Hw821_Train(1222, "區間", "樹林", "七堵", 300);
		train[6] = new Hw821_Train(1254, "區間", "屏東", "基隆", 700);

		System.out.println("印出不重複的Train物件(HashSet)");
		System.out.println("==============================");

		// 放到HashSet(特性：無排序 & 重複不加入)
		Set<Hw821_Train> trainSet = new HashSet<>();
		for (Hw821_Train element : train) {
			trainSet.add(element);
		}

		// HashSet-Iterator
		Iterator<Hw821_Train> itSet = trainSet.iterator();
		while (itSet.hasNext()) {
			itSet.next().showInfo();
		}

		System.out.println("------------------------------");

		// HashSet-for：Set集合無順序=無索引=無法使用

		// HashSet-for-each
		for (Hw821_Train element : trainSet) {
			element.showInfo();
		}
		System.out.println("==============================");
		System.out.println("依班次編號由大到小印出Train物件(ArrayList)");
		System.out.println("==============================");

		// 放到ArrayList(特性：有序、可重複)
		List<Hw821_Train> trainList = new ArrayList<>();
		for (Hw821_Train element : train) {
			trainList.add(element);
		}

		Collections.sort(trainList); // 實作compareTo(T T2) & 呼叫sort進行排序
		Collections.reverse(trainList); // 再呼叫reverse進行反序

		// ArrayList-Iterator
		Iterator<Hw821_Train> itList = trainList.iterator();
		while (itList.hasNext()) {
			itList.next().showInfo();
		}

		System.out.println("------------------------------");

		// ArrayList-for
		for (int i = 0; i < trainList.size(); i++) {
			trainList.get(i).showInfo();
		}

		System.out.println("------------------------------");

		// ArrayList-for-each
		for (Hw821_Train element : trainList) {
			element.showInfo();
		}
		
		System.out.println("==============================");
		System.out.println("依班次編號由大排到小印出不重複的Train物件(TreeSet)");
		System.out.println("==============================");

		// 放到TreeSet(特性：加入時進行比較 & 重複不加入)
		// 建立比較器改寫排序方法
		Comparator<Hw821_Train> desc = new Comparator<Hw821_Train>() {
			@Override
			public int compare(Hw821_Train t1, Hw821_Train t2) {
				return Integer.compare(t2.getNumber(), t1.getNumber());
			}
		};

		Set<Hw821_Train> trainTreeSet = new TreeSet<>(desc);
		for (Hw821_Train element : train) {
			trainTreeSet.add(element);
		}

		// TreeSet-Iterator
		Iterator<Hw821_Train> itTreeSet = trainTreeSet.iterator();
		while (itTreeSet.hasNext()) {
			itTreeSet.next().showInfo();
		}

		System.out.println("------------------------------");

		// TreeSet-for：Set集合無順序=無索引=無法使用

		// TreeSet-for-each
		for (Hw821_Train element : trainTreeSet) {
			element.showInfo();
		}
		
		System.out.println("==============================");
		System.out.println("依班次編號由大排到小印出不重複的Train物件(TreeMap)");
		System.out.println("==============================");
		
		// 放入TreeMap：將int number設成key值降序
		TreeMap<Integer, Hw821_Train> trainMap = new TreeMap<>(Comparator.reverseOrder());
		for (Hw821_Train element : train) {
			trainMap.put(element.getNumber(), element);
		}

		// TreeMap-Iterator
		Iterator<Hw821_Train> iterator = trainMap.values().iterator();
		while (iterator.hasNext()) {
			iterator.next().showInfo();
		}

		System.out.println("------------------------------");

		// TreeMap-for：和索引無關，重點是key

		// TreeMap-for-each
		for (Hw821_Train element : trainMap.values()) {
			element.showInfo();
		}
	}
}
