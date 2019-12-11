package Lesson753;//正規表現で split する

/*「カンマあるいは空白文字で文字列を区切り、文字列の配列にする」にはどうしたらよいでしょうか。*/

import java.util.regex.Pattern;

public class RegExpTest1 {
	public static void main(String[] args) {

		Pattern p = Pattern.compile("[,\\s]+");
		String[] result = p.split("1, 2, 3  4, 5");

		for(int i=0; i<result.length; i++) {
			System.out.println("[" + result[i] + "Kazu"+"]");
		}
	}
}
/*パターン文字列として [,\s]+ を指定。これによって、「カンマ (,) または空白文字 (\s) が
 ひとつ以上 (+) で区切る」ということを指定したことになります。*/