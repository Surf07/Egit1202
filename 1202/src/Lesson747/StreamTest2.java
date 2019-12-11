package Lesson747;//FileReader


/*「ファイルを開いてそこから読み込む」という基本的な操作のために、FileReader というリーダーも用意されています。
こちらは FileInputStream を作ってそれを InputStreamReader に渡すということをやらなくとも、FileReader 
にパスを渡すとその中でストリームをオープンして、読込みを可能な状態にしてくれます。*/


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StreamTest2 {

  public static void main(String[] args) {

    try {

      char[] cbuf = new char[1];
      
      FileReader fileReader = 
        new FileReader("/home/keisukeo/tmp/hello.txt");
      
      while( (fileReader.read(cbuf)) != -1){
        System.out.print("[");
        System.out.print(cbuf);
        System.out.println("]");
      }
      
      fileReader.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

//ためしに 1 文字ずつ読み込むと次のようになりました。
//[H]
//[e]
//[l]
//[l]
//[o]
//[!]
//[
//]


