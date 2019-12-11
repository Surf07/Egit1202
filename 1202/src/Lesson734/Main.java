package Lesson734;//StringBufferでlastindexOf


public class Main {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("appleorangemelonorange");

		String str = "orange";

		int result = sb.lastIndexOf(str);

		if(result != -1) {
			System.out.println(str + "が見つかった位置：" + result);
		} else {
			System.out.println(str + "は見つかりませんでした");
		}
	}
}
