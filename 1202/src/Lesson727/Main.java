package Lesson727;//sizeで要素数を取得する方法


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

    	List<String> list = new ArrayList<>(Arrays.asList("s","a","m","u","r","a","i"));

    	System.out.println("list =" + list);
    	System.out.println("要素数=" + list.size());
    }
}