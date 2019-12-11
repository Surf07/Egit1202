package Lesson726;//getで要素の値を取得する方法


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

    	List<String> list = new ArrayList<>();

    	list.add("apple");
    	list.add("orange");
    	list.add("melon");

    	System.out.println(list.get(0));
    }
}