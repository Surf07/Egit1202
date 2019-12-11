package Lesson760;//バッファリング処理 – BufferedReader／BufferedWriterクラス


/*バッファリング処理とは、書き込み時であればデータを一旦メモリー（バッファ）に蓄積し、いっぱいになったところで
ファイルに出力することを言います。読み込み時であればバッファにまとめてデータを読み込み、いっぱいになったところで
データを処理します。いずれの場合もデータをまとめて処理できるので、読み書きを効率化できます。このような
バッファリングを担うのが、BufferedReader／BufferedWriterクラスの役割です。
BufferedReader／BufferedWriterクラスを利用するには、コンストラクターに対してもととなる
Reader／Writerオブジェクトを渡すだけです。*/

//以下は、テキストファイルsample.txtの内容をsample2.txtに転記する例です。


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamBuffer {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(
        new InputStreamReader(
          new FileInputStream("C:/data/sample.txt"), "UTF-8"));

       BufferedWriter writer = new BufferedWriter(
        new OutputStreamWriter(
          new FileOutputStream("C:/data/sample2.txt"), "UTF-8"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        writer.write(line);
        writer.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}