package Lesson748;//BufferedReader で一行毎に読込み

/*テキストファイルを一行毎に読むというよくやりそうなことをやります。一行毎に読むということは、
 ある程度データを読んで溜め込んでおき、改行文字 (CR, LF) などを見つけて、そこまでを取り出す、
 という作業になりますよね。 ですから「一行ずつ読む」ということをするのは、BufferedReader
  (バッファーされたリーダー、ということで)　です。BufferedReader の readLine メソッドは
  改行文字までの一行を返します。*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StreamTest3 {
  public static void main(String[] args) {
    try {

      BufferedReader buffReader =
        new BufferedReader(
          new FileReader("/home/keisukeo/tmp/hello.txt"));

      String s;

      while( (s = buffReader.readLine()) != null ){
        System.out.println(s);
      }

      buffReader.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

//結果は
// Hello!