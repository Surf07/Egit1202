package Lesson739;//Listから範囲を切り出してsubListを作る方法

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> mainList = new ArrayList<>();
		mainList.add(0);
		mainList.add(1);
		mainList.add(2);
		mainList.add(3);
		mainList.add(4);

		List<Integer> sbList = mainList.subList(1, 3);

		System.out.println("元のList = " + mainList);
		System.out.println("subList = " + sbList);
	}
}

/*subListの中身ですが、インデックスの終わりを含まないことに気をつけること。
ここでは(1, 3)指定したので[1, 2]が出力される。 */