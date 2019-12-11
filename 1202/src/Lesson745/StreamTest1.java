package Lesson745;//InputStreamReader で少し変換


/*FileInputStream でも read メソッドを持っていてバイト列を読み込むことができます。 これを文字の列として
読み込むための橋渡しをするのが、InputStreamReaderです。*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamTest1 {

  public static void main(String[] args) {

    try {

      int size;
      char[] cbuf = new char[2];

      InputStreamReader inReader =
        new InputStreamReader(
          new FileInputStream("/home/keisukeo/tmp/hello.txt"));

      while( (size = inReader.read(cbuf)) != -1){

        System.out.print(cbuf);
        System.out.println( "(" + size + ")" );

        for(int i=0;i<cbuf.length;i++){
          cbuf[i]=0;
        }

      }

      inReader.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

//ちなみに、ここでは最大 2 文字ずつ数回に分けて読み出しているので、結果は次のようになります。

//He(2)
//ll(2)
//o!(2)