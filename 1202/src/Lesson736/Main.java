package Lesson736;//自作クラス内の値をindexOfで検索する方法


import java.util.ArrayList;
import java.util.List;

class TestClass{
	String str;

	TestClass(String s){
		str = s;
	}

	public boolean equals(Object obj) {

		TestClass tc = (TestClass)obj;

		String tcStr = tc.str;
		return str.equals(tcStr);
	}
}


public class Main {
	public static void main(String[] args) {

		List<TestClass> list = new ArrayList<>();
		TestClass testClass = new TestClass("samurai");

		list.add(testClass);

		TestClass testClass2 = new TestClass("samurai");
		System.out.println("要素番号 = " + list.indexOf(testClass2));
	}
}
/*indexOfメソッドを使って自作クラス内に特定の値が含まれているか確認するには、メソッドの内部でequalsメソッドを使用して、
List内に特定の値があるかを判定します。そのため、equalsメソッドをオーバーライドして自作クラス内の値と比較するように変更すると、
indexOfメソッドで自作クラス内の値と比較することができるようになります。equalsメソッドをオーバーライドして自作クラス内に定義した
プロパティをチェック。 */

