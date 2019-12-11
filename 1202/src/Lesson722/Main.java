package Lesson722;//iteratorを使ったfor文


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		for(Iterator<Integer> it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}
}

/*Listインターフェースを実装するクラスでは、iteratorメソッドを使ってIterator型のオブジェクトを使用することができるようになります。
Iterator型のオブジェクトからはhasNextメソッドやnextメソッドを呼び出して利用でき、hasNextメソッドは、リストが次の要素を持っている
場合にtrueを返す。nextメソッドはリストの次の要素を返す。Listインターフェースを実装するクラスには、例えばArrayListクラスなどがある。*/



