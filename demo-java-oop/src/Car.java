public class Car {
  // color
  private String color;
  // brand
  private String brand;
  // year
  private int year;

  public String getColor() {
    return this.color;
  }

  public String getBrand() {
    return this.brand;
  }

  public int getYear() {
    return this.year;
  }

  // 
  public void setColor(String color) {
    this.color = color;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setYear(int year) {
    this.year = year;
  }

 public static void main(String[] args) {
    // 2 car objects
    // set and get
    Car c1 = new Car();
    c1.setBrand("tesla");
    c1.setColor("RED");
    c1.setYear(2023);
    System.out.println(c1.getYear()); // 2023

    c1.setYear(2025);
    System.out.println(c1.getYear()); // 2025

    Car c2 = new Car();
    c2.setBrand("BYD");
    c2.setColor("WHITE");
    c2.setYear(2021);
    System.out.println(c2.getColor()); // WHITE

    // "hello" -> String Object
    // s -> String Object Reference (Address)
    String s = "hello";
    s = "world";

 }
}