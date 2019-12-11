package Lesson730;//StringでindexOf


public class Main {
	public static void main(String[] args) {

		String str1 = "appleorangemelon";
		String str2 = "orange";

		int result = str1.indexOf(str2);

		if(result != -1) {
			System.out.println(str2 +  "が見つかった位置：" + result);
		} else {
			System.out.println(str2 + "は見つかりませんでした");
		}
	}
}

/*indexOfメソッドは、対象の文字列から指定した部分文字列を検索します。部分文字列が見つかった場合は、
 文字列の先頭を0としたインデックス番号を返します。*/

