package Lesson740;//subListの値を変えると元のListの値も変わる

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

		List<Integer> sbList = mainList.subList(1, 4);
		sbList.set(0,101);//0に101を代入すること。

		System.out.println("元のList = " + mainList);
		System.out.println("subList = " + sbList);

	}
}
//subListと元のListは値を共有しています。そのため、subListの値を変更すると元のListの値も変わります。