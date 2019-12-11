package Lesson752;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest13 {
public static void main(String[] args) {
	String s = "AB123EF";
	String patternString = "[0-9]+";

	Pattern p = Pattern.compile(patternString);

	Matcher m = p.matcher(s);

	System.out.println(m.find() ? "O" : "x");
	System.out.println(m.matches() ? "o" : "x");
}
}
