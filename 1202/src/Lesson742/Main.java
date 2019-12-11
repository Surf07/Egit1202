package Lesson742;


import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Integer> mainList = new ArrayList<Integer>();

		mainList.add(0);
		mainList.add(1);
		mainList.add(2);
		mainList.add(3);
		mainList.add(4);

		System.out.println("元のList = " + mainList);

		mainList.subList(1,3).clear();//1番目と２番目を切り出す、最後の番目は抜く。
		System.out.println("元のList = " + mainList);

	}
}
