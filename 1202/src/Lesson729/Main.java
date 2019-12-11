package Lesson729;//ListでindexOf

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("s","a","m","u","r","a","i"));
		boolean exists = list.contains("a");
		int index = list.indexOf("a");

		System.out.println("存在するか？ = " + exists);
		System.out.println("要素番号 = " + index);
	}
}