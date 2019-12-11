package Lesson735;//indexOfメソッドで複数の要素を検索する方法



public class Main {
	public static void main(String[] args) {

		String str = "samurai";
		int result;

		for(int i=0; i < str.length(); i++) {
			result = str.indexOf("a",i);

			if(result != -1) {
				System.out.println("要素番号 = " + result);
				i = result;
			}
		}
	}
}

/*このプログラムでは、indexOfメソッドで指定した文字が含まれているかを検索しています。文字が見つかった場合には、
 その位置の次のインデックスをindexOfメソッドの第2引数に指定することで、続きから残りの文字列を検索しています。
 このようにしてindexOfメソッドの第2引数を指定して複数の要素を検索することができました！*/


