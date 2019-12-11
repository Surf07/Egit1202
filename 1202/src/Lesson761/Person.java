package Lesson761;


import java.io.Serializable;

public class Person implements Serializable {

  private static final long serialVersionUID = -7053655917805742728L;
  public String name;
  public int age;
  public transient boolean deleted;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void showInfo() {
    System.out.println("「" + this.name + "」" + this.age + "歳");
  }
}