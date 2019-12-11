package Lesson754;//正規表現による文字列の置換


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest3 {
	public static void main(String[] args) {

		String s = "SN123 xyz SN456";
		String patternString = "\\d+";

		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(s);

		System.out.println(m.replaceAll("#"));
		System.out.println(m.replaceFirst("#"));
	}
}
/*特定の文字列からマッチする箇所を探して、その場所を置換するという操作*/