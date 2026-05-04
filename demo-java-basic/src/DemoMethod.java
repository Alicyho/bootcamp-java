public class DemoMethod {
  //  static ( non-OOP presentation, 

  //static varivable: 
  private static int daysPerYear = 365;
  private static int hoursPerDay = 24;
  
  
  // 只要加了static在任何地方，就變用不是OJECT)

  //"javac" -> compile javaile -> class file
  //"java" -> execute class file -> call main method (Pass parameter)

  public static int hoursPerYear (){
    return daysPerYear * hoursPerDay;
   } //
  public static void main(String[] args) {
    // 1 + 3 -> 4
    System.out.println(sum(1,3));//4

    // sum2 （instance method)
    DemoMethod dm = new DemoMethod (); // create instance
    System.out.println(dm.sum2(1,3));

    // Dog da = new Dog ()
    // d1.eat ();
  
    System.out.println(DemoMethod.hoursPerYear());//static call result 方法 --要記住LEE個CALL 法
  
}
  // ! Tool (not belongs to any object) (Static Method)
  public static int sum(int a, int b){
    return a + b;
  }

  // ! Methold belongs to Object (Instance Method)
  public int sum2 (int x, int y){
    return x + y;




  
  }
  }
  

