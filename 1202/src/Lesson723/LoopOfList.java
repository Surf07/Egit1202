package Lesson723;//いろんなヤツ


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class LoopOfList {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("A","B","C","D");

		//1.愚直な例
		for( int i =0; i<list.size(); ++i) {
			String s = list.get(i);
			System.out.println(s);
		}

		//2.イテレータ
		for(Iterator<String>itr = list.iterator(); itr.hasNext();) {
			String s = itr.next();
			System.out.println(s);
		}

		//3.拡張for文
		for(String s : list) {
			System.out.println(s);
		}

		//4.ラムダ
		list.forEach(s -> {
			System.out.println(s);
		});

		//5.ラムダだがメソッド参照
		list.forEach(System.out::println);

	}

}
