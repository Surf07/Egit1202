package Lesson756;//静的初期化ブロック。よう分からん？


/*オブジェクト毎ではなく、クラスのロード時に一度だけ変数を初期化する場合には、
次のように static 付きの初期化ブロックを利用することもできます。*/

import java.util.Random;

class InitBlock {

	static int x;
	int y;

    //静的初期化ブロック
	static
	{
		Random gen = new Random();
		x = gen.nextInt( 100 );
	}
	//オブジェクト初期化ブロック
	{
		y = x;
		x++;
	}
	public void printValue() {
		System.out.format( "x= %d, y=%d\n", x,y );
	}
}


public class InitBlock2 {
	public static void main(String[] args) {

		InitBlock b1 = new InitBlock();
		b1.printValue();

		InitBlock b2 = new InitBlock();
		b2.printValue();
	}
}

/*結果、１行目、２行目はそれぞれ別のオブジェクトからの出力ですが、
  確かに x が共通して使われていることがわかります。*/


