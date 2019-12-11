package Lesson738;//subListでListの一部をコピーする方法、sublist(○,○)は最初含めた間をトルので注意。

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

		System.out.println(sbList);
	}

}