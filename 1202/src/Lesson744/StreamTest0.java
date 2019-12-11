package Lesson744;//単純な FileInputStream によるデータの読み込み


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamTest0 {

  public static void main(String[] args) {

    try {

      FileInputStream fileInputStream =
        new FileInputStream("/home/keisukeo/tmp/hello.txt");

      int i;
      while( (i = fileInputStream.read()) != -1){
        if(0x1f<i && i<0x7e){
          System.out.println((char)i);
        }
      }

      fileInputStream.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

/*Java ではいろいろな方法がありますがここでは、ファイルを開き、そこからデータを汲み取るための基本は
 FileInputStream である、として見ていきましょう。*/

/*"/home/keisukeo/tmp/hello.txt" というテキストファイルから文字を読み込んで表示しようとしています。
FileInputStream のコンストラクタにファイルのパスを渡すだけで OK です。この入力ストリームの read メソッドで
1 バイト毎にデータを読み込んで、それを表示してみましょう。read メソッドが返す値は int 型です。 これだけでは「文字」
と言えませんね。これを char にキャストしたところで、ASCII コードでは何の文字にあたる、という風に意味付けして始めて
文字データといえます。ちなみに、入力元にはどんなデータが入っているか分からないものとして、念のため 0x1f から 0x7f
までの範囲の値の場合のみ出力しています。結果は次のとおり。FileInputStream による読み込み確かに
 H, e, l, l, o, ! という文字が表示されました。*/



