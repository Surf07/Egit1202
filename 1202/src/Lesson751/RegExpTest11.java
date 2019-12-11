package Lesson751;//正規表現は通常「文字のパターンマッチング」という意味で使われています。


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExpTest11 {
	public static void main(String[] args) {

		String s = "ABCDEF";
		String patternString = "CD";
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(s);

		System.out.println(m.matches() ? "o" : "x");
		System.out.println(m.find() ? "o" : "X");
	}
}
/*matches() メソッドは、パターンを適用する文字列全体がパターン文字列と合致するかどうかチェックします。
ここでは "ABCDEF" という文字全体が "CD" と合致するか、ということで、これは明らかに false となります。
find() メソッドはパターンを適用する文字列の中に指定したパターンが存在するかどうかチェックします。
ここでは "ABCDEF" という文字列の中に "CD" が存在するかどうか、ということになるので true が返ります。*/
