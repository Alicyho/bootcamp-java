// Java 1-21 (super first)
// Java 23-25
// super? this?

import java.math.BigDecimal;
import java.util.Objects;

public class Circle extends Shape {
  private double radius;

  // Child Class
  // ! Inherit Attributes & Instance Methods
  // ! Won't inherit constructors

  // public Circle() {
    //  implicitly calling parent's empty constructor
  // }

  // ! Every Child Class Constructor would call parent's constructor
  public Circle(double radius) {
    // super(Color.BLACK); // calling Shape All Args Constructor
    super(); // calling Shape Empty Constructor
    this.radius = radius;
  }

  // RED Circle
  public Circle (double radius, Color color) {
    super(color);
    this.radius = radius;
  }

    public double getRadius() {
    return this.radius;
  }

  // area
  @Override // ! check if parent class has area() Method
  public double area () {
    return BigDecimal.valueOf(this.radius)//
    .multiply(BigDecimal.valueOf(this.radius))//
    .multiply(BigDecimal.valueOf(Math.PI))//
    .doubleValue();
  }
  

   // ! equals (radius)
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Circle))
      return false;
    Circle c1 = (Circle) o;
    return c1.getRadius() == this.radius && c1.getColor() == super.getColor();
  }


  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, Color.RED);
    System.out.println(c1.getColor()); // RED
    System.out.println(c1.getRadius()); // 3.5

    Circle c2 = new Circle(3.5, Color.BLACK);
    System.out.println(c1.equals(c2)); // after override, false


    Circle c3 = new Circle(3.5, Color.RED);
    System.out.println(c1.equals(c3)); // after override, true
  }
}
 
