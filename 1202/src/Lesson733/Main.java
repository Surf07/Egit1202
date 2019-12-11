package Lesson733;//StringでlastIndexOf



public class Main {
	public static void main(String[] args) {

		String str1 = "appleorangemelonorange";
		String str2 = "orange";

		int result = str1.lastIndexOf(str2);

		if (result != -1) {
			System.out.println(str2 + "が見つかった位置："+ result);
		} else {
			System.out.println(str2 + "は見つかりませんでした");
		}
	}

}
