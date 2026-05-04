public class DemoObject {

 public static void main(String[] args) {
    //Top most class - Object
    Object o1 = new Object();
    //左邊作最高的指針
    //Object is the parent for all Class in Java.
    // implicit extends
    Object o2 = new Cat();
    Object o3 = new Superman();
    Object o4 = new Circle(3.5);


  }
  
}
