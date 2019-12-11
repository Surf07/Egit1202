package Lesson755;//コンストラクタ内から他のコンストラクタを呼出す

/*コンストラクタはパラメータ違いで複数定義することが可能。 あるコンストラクタから同じクラス内のもうひとつの
 *コンストラクタを呼出す場合はthis を用います。
 */


class Animal{

	int age;
	public Animal( int age) {
		this.age = age;
	}

	public void showAge() {
		System.out.format("Age: %d\n", age);
	}
}

class Dog extends Animal{

	String name;
	public Dog( int age) {
		this( age,"Pochi");
	}
	public Dog( int age, String name) {
		super(age);
		this.name = name;
	}
	public void showName() {
		System.out.format("Name: %s\n", name);
	}
}

public class Constructor1 {
   public static void main(String[] args) {
	   //Animal
	   Animal a = new Animal(10);
	   a.showAge();

	   //Dog
	   Dog d = new Dog(3);
	   d.showAge();
	   d.showName();

}
}


/*ここではコンストラクタが二つ定義されています。ひとつは Dog( int age ) で、 もうひとつは
 Dog( int age, String name ) です。前者のコンストラクタを利用した場合は、名前を "Pochi" に
 設定してもうひとつのコンストラクタを呼出しています。*/

/*派生クラスの初期化時にスーパークラスを初期化する必要がある場合は、スーパークラスのコンストラクタを
 呼出す必要があります。 スーパークラスがカプセル化されていれば、派生クラスからその private フィールドへ
 アクセスできないので、コンストラクタを経由してそれを初期化しなければならないからです。スーパークラスの
 コンストラクタは、super を用いて呼出します。super を経由してスーパークラスの変数 age を正しく
 初期化してますね。*/

