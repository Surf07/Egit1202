package Lesson728;//indexOfで要素の位置を検索する方法


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

    	List<String> list = new ArrayList<>(Arrays.asList("s","a","m","u","r","a","i"));

    	int index = list.indexOf("a");

    	System.out.println("要素番号=" + index);
    }
}