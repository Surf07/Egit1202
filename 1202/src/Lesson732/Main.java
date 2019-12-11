package Lesson732;//ListでlastIndexOf

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("s", "a", "m", "u", "r", "a", "i"));
		int index = list.indexOf("a");
		int lastIndex = list.lastIndexOf("a");

		System.out.println("最初の要素番号 = " + index);
		System.out.println("最後の要素番号 = " + lastIndex);

	}
}
