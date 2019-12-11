package Lesson737;//containsとindexOfのパフォーマンス(速度)の比較



public class Main {
	public static void main(String[] args) {

		String[] str = new String[100];
		for(int i = 0; i<100; i++) {
			str[i] = "appleorangemelon";
		}

		//contains検索処理開始
		long start1 = System.nanoTime();
		for(int j = 0; j < 100; j++) {
			boolean b = str[j].contains("orange");
		}
		//contains処理終了時間
		long end1 = System.nanoTime();
		System.out.println("contains:" + (end1 - start1) / 1000000f + "ms");

		//indexOf検索処理開始
		long start2 = System.nanoTime();
		for(int k = 0; k < 100; k++) {
			int num = str[k].indexOf("orange");
		}

		//indexOf処理終了時間
		long end2 = System.nanoTime();
		System.out.println("indexOf:" + (end2 - start2) / 1000000f + "ms");

	}
}

/*このプログラムでは、containsメソッドとindexOfメソッドでそれぞれ100回検索した場合の処理速度を比較しています。
実行結果から、ほとんど速度に違いがないことがわかりました。そのため、どちらを使っても問題はありません。*/
