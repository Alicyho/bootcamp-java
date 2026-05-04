import java.math.BigDecimal;

public class Circle {
  private double radius;

  // constructor
  // ! Empty Contructor
  public Circle() {

  }

  // ! All Arguments Contructor (with all attribute)
  public Circle(double radius) {
    this.radius = radius;
  }
        //set 是自己, return 去某FOLDER
        //GET 人地 的資料，RETURN 取某些東西
  // get, set
  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  // area
  // Presentation
  public double area() {
    return BigDecimal.valueOf(this.radius) // 半徑
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) // PI是圓周率率： 3.1415
        .doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(new Circle(3.5).area()); // 38.48451000647496

    Circle c1 = new Circle(); // default 0.0
    System.out.println(c1.area()); // 0.0
    c1.setRadius(7.5);
    System.out.println(c1.area()); // 176.71458676442586
  }
}