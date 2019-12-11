package Lesson720;//配列(Array)からListに変換する方法

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		String[] array = {"さ","む","ら","い"};
		List<String> list = Arrays.asList(array);

		System.out.println("配列=" + Arrays.deepToString(array));
		System.out.println("List=" + list);
	}
}

/*asListメソッドは配列を簡単にListに変換することができて便利なメソッドですが、注意点がある。それはasListメソッドが
 「固定サイズのList」を返すので、Listの要素を追加(add)したり削除(remove)することが出来なく点です。*/
