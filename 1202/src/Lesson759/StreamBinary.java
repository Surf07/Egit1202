package Lesson759;//テキストファイルの操作 – InputStreamReader／OutputStreamWriterクラス


/*テキストファイルを読み書きするには、FileInputStream／FileOutputStreamクラスを
InputStreamReader／OutputStreamWriterクラスで文字ストリーム（Reader／Writer）に変換します。
たとえば以下はsample.jpgを読み込み、その内容をそのままsample2.jpgに書きだす例です。
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamBinary {
  public static void main(String[] args) {
    try (FileInputStream in = new FileInputStream("C:/data/sample.jpg");
        FileOutputStream out = new FileOutputStream("C:/data/sample2.jpg")) {
      int data;
      while ((data = in.read()) != -1) {
        out.write((byte) data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}