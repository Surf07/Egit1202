package Lesson763;


class SuperClass{

	public SuperClass() {
		System.out.println("引数なしコンストラクタ");
	}

	public SuperClass(String s) {
		System.out.println("引数ありコンストラクタ:" + s);
	}
}

class SubClass extends SuperClass{

	public SubClass() {
		this(1,2);
	}

	public SubClass( int a, int b) {
		super(); //superのポジションに注意。SubClass()の方ではない。
		System.out.println("a + b =" + String.valueOf( a + b));
	}
}

public class TestClass {
	public static void main(String[] args) {
		SubClass s = new SubClass();
	}
}

/*このプログラムでは、スーパークラスのコンストラクタが呼ばれた後に、
サブクラスのコンストラクタがthisを使って呼ばれています。*/
