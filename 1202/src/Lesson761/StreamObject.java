package Lesson761;//オブジェクトの保存 – ObjectInputStream／ObjectOutputStreamクラス

/*Javaでは、Objectをシリアライズすることで、バイトストリームに出力するための手段を備えています。
＃シリアライズ＃とは、オブジェクトのような構造化データをファイル／ネットワーク経由でやり取りできるように、
バイト配列に変換することを言います。シリアライズされたバイト配列を元のオブジェクトに戻すことを
デシリアライズと言います。 そして、シリアライズ／デシリアライズのための機能を提供するのが
ObjectInputStream／ObjectOutputStreamクラスの役割です。*/

//以下は、オブジェクトPersonをファイルPerson.serに保存するためのサンプルです。
//また、Person.serを読み込み、その内容をオブジェクトとして復元しています。


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StreamObject {
  public static void main(String[] args) {
    String filename = "C:/data/Person.ser";

    try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
      ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
      out.writeObject(new Person("山田太郎", 50));

      Person p = (Person) in.readObject();
      p.showInfo(); // 結果：「山田太郎」50歳

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}