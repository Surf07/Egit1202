package Lesson757;



/*普通のクラスやメンバクラスは、classキーワードでまず「宣言」し、その後newで「利用」しますが、 
 匿名クラスは「宣言と利用」を同時に行います。
 */


interface Printable{
	void print();
}


interface Printable2{
	void print2();
}

//匿名クラスとはあるメソッドの中で一回しか使わない、つまり「その場で使い捨てる」クラスを作りたい場合のためにある。
// ■匿名クラスの宣言兼利用 new 匿名クラスの親クラス指定(){匿名クラスの内容(メンバ)定義}


public class Test105 {
	public static void main(String[] args) {

		Printable p = new Printable() {
			public void print() {

				System.out.println("TEST");
				System.out.println("TEST2");
			}
		};
		p.print();

		Printable2 p2 = new Printable2() {
			public void print2() {
				System.out.println("TEST3");
			}
		};
		p2.print2();
	}
}
