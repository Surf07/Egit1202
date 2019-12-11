package Lesson725;//setで要素を書き換える方法


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

    	List<Integer> list = new ArrayList<>();

    	for(int i=0; i<5; i++) {
    		list.add(i);
    	}

    	list.set(0,3);

    	System.out.println(list);

    }
    }

/*このプログラムではListのインスタンス変数listを初期化して用意したあと、addメソッドを使って0～4の値をList内に追加しています。
次にsetメソッドを使用して0番目のデータを3に書き換えるという処理を行っています。そのため、実行結果を見てわかるように一番最初のデータが
3になっていますよね。ここは元々は0だったのですがsetメソッドを使うことで3に上書きされたのです！*/


