package Lesson762;



class SuperClass{
	public SuperClass() {
		System.out.println("引数なしコンストラクタ");
	}

	public SuperClass(String s) {
		System.out.println("引数ありコンストラクタ:" + s);
	}
}

class SubClass extends SuperClass {
	public SubClass() {
		super("スーパークラスへ送りたい文字列");
	}
}

public class TestClass {
	public static void main(String[] args) {
		SubClass s = new SubClass();
	}
}

/*superを使って、サブクラスからスーパークラスのコンストラクタを呼び出すことが可能です。
自動的に呼び出されるのは引数のないコンストラクタなので、引数のあるコンストラクタを呼び出すには
superを使う必要があります。*/
