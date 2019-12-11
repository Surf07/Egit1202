package Lesson719;//Listから配列(Array)に変換する方法


/*toArrayメソッドの使い方を解説。Listから配列に変換するには「java.util.Collection.toArrayメソッドを使います。」
配列のデータを表示するためにtoStringメソッドを使っています。*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("さ");
		list.add("む");
		list.add("ら");
		list.add("い");

		String[] array = list.toArray(new String[list.size()]);

		System.out.println("List =" + list);
		System.out.println("配列 ＝" + Arrays.toString(array));

	}
}
