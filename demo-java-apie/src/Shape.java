public abstract class Shape {
  private Color color;

  // Empty Constructor
  public Shape() {
    
  }

  // All Args Constructor
  public Shape (Color color) {
    this.color = color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  //public double area (){
  //return -0.1;
  //}

    // ! implicitly public
  abstract double area ();  //先建構一個抽象的範圍


  public static void main(String[] args) {
    Shape s1 = new Circle(3.5);
    System.out.println(s1.area());
    //Dynamic Polymorphism

    // for-each 

    //code Patter:Open-Closed (Polymorphism)
    // Shape [] -> 2 Circle 1 Square
    Shape[] shapes = new Shape[]{new Circle (3.5), new Circle (4.5), 
      new Square (5.0, Color.BLACK)};
    // loop -> sum all area
    double sum = 0.0;
    for (Shape shape : shapes){
      sum += shape.area (); // BigDecimal
      // ! Compile Time: Shape Type -> can call area ()
      // ! Runtime: shape -> actual memor object area () content
    }
  System.out.println(sum); 
  
  //What is the different between interface and parent class
  //1. interface has No attributes
  //2. parent class and interface can process the polymorphism  (eg. shape array)
  //2. parent class and interface can process the static variable/method.
  //3. what the diff interface and polymophism
  //interface: have no attributes, no constructor, no concrete method 
  //4. Parent Class (Normal Class / Abstract Class (cannot new))
  //5. Extend ONE Parent, implement MANY interface
  //

}
}




