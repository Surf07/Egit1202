package Lesson721;//asListメソッドで変換したListのサイズ（要素数）を変更する方法


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
	public static void main(String[] args) {

		String[] array = {"さ","む","ら","い"};
		List<String> list = Arrays.asList(array);

		//ここで要素を追加しようとすると、「UnsupportedOperationException」の例外が発生する。
		//list.add("塾"); 次のようにすれば要素の追加が可能になる。

		List<String> newList = new ArrayList<>(list);
		newList.add("塾");

		System.out.println("配列=" + Arrays.toString(array));
		System.out.println("List=" +list);
		System.out.println("List=" +newList);

	}
}


