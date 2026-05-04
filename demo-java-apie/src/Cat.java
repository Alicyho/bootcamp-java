//!APIE: Inheritance
// Cat/Dog is a Child Class
public class Cat extends Animal {
  // private String name;
  // private int age;

  // public Cat(String name, int age) {
  //   this.age = age;
  //   this.name = name;
  // }

  public Cat() {

  }

  // public int getAge() {
  //   return this.age;
  // }

  // public String getName() {
  //   return this.name;
  // }

  // public void setName(String name) {
  //   this.name = name;
  // }

  // public void setAge(int age) {
  //   this.age = age;
  // }

  public static void main(String[] args) {
    Cat c1 = new Cat();
    c1.setAge(5);
    c1.setName("Mary");
    System.out.println(c1.getAge());
    System.out.println(c1.getName());
  }
}