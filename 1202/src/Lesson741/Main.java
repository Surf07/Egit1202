package Lesson741;//元のListの値を変えるとsubListの値も変わる。少しややこしい。

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

		List<Integer> sbList = mainList.subList(1, 3);//1番目と２番目を切り出す、最後の番目は抜く。
		mainList.set(2, 102);  // mainListの切り出した１と２の２である１番目に102を代入。
		sbList.set(0, 101);   // mainListの切り出した１と２の１である０番目に101を代入。

		System.out.println("元のList = " + mainList);
		System.out.println("subList = " + sbList);

	}
}