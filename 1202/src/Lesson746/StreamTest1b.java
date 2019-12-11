package Lesson746;//StringWriter による String のバッファリング

/*前の例ではチョット読んで、チョット書き出して、、、とやりましたが、そうしないで読み込んだものを
溜め込んで（バッファリング）しておいて、 全部読み込み終わってから出力してみましょう。文字を溜め込むのは、
StringWriter で実現できます。(この場合は StringBuilder や StringBuffer でも良いのですが
ここではあえて java.io.Writer の StringWriter を使っています)*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class StreamTest1b {

  public static void main(String[] args) {

    try {

      int size;
      char[] cbuf = new char[2];

      InputStreamReader inReader =
        new InputStreamReader(
          new FileInputStream("/home/keisukeo/tmp/hello.txt"));
      StringWriter sWriter = new StringWriter();

      while( (size = inReader.read(cbuf)) != -1){
        sWriter.write(cbuf, 0, size);
      }

      System.out.println(sWriter.toString());

      inReader.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

//全部読み込んでから出力、ということで今度はちゃんと "Hello!" とつながって表示されました。結果は、

//Hello!