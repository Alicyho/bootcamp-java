public class DemoMethod {
  // ! static (non-OOP presentation)
  // Static Variable
  private static int daysPerYear = 365;
  private static int hoursPerDay = 24;

  // "javac" -> compile java file -> class file
  // java -> execute class file -> call main method (Pass parameter)

  public static int hoursPerYear() {
    return daysPerYear * hoursPerDay;
  }

  public static void main(String[] args) {
    // 1 + 3 -> 4
    System.out.println(DemoMethod.sum(1, 3)); // 4

    // sum2 (instance method)
    DemoMethod dm = new DemoMethod(); // create instance
    System.out.println(dm.sum2(1, 3));

    // Dog d1 = new Dog()
    // d1.eat();

    System.out.println(DemoMethod.hoursPerYear()); // 8760

  }

  // ! Tool (not belongs to any object) (Static Method)
  public static int sum(int a, int b) {
    return a + b;
  }

  // ! Method belongs to Object (Instance Method)
  public int sum2(int x, int y) {
    return x + y;
  }
}