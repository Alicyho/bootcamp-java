import java.util.LinkedList;
import java.util.List;


    //excepted error
  //unavoidable
  //recoverable

public class DemoException {
  public static void main(String[] args) {
    String s = "hello";
    System.out.println(s.charAt(0)); // h

    if (s != null) {
      System.out.println(s.charAt(0));
    } else {
      System.out.println("s is null");
    }

    String[] arr = new String[3]; // 0,1,2
    // System.out.println(arr[-1]); // ArrayIndexOutOfBoundsException
    // System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

    // System.out.println("hello".charAt(5)); // StringIndexOutOfBoundsException

    List<String> names = new LinkedList<>();
    names.add("Peter");
    names.add("Jason");
    // System.out.println(names.get(2)); // java.lang.IndexOutOfBoundsException

    // Math (divide 0)
    int count = 0;
    // double average = 999 / count; // java.lang.ArithmeticException

    double d1 = Double.valueOf("23.4");
    System.out.println(d1);

    // double d2 = Double.valueOf("23.4a"); // java.lang.NumberFormatException
    // System.out.println(d2);

    String s4 = "-1";
    // check if s4 is a number -> true/false
    // Learn: try-catch
    boolean isNumber = false;
    try {
      double d10 = Double.valueOf(s4);
      // (line 44) if not number, throw NumberFormatException -> line 47 catch
      isNumber = true;
    } catch (NumberFormatException e) {
      isNumber = false;
    }
    System.out.println("s4 is number: "+ isNumber);

    try {
      String[] arr2 = new String[] {"hello", "123"};
      System.out.println(arr2[arr2.length]); // ! it is bug, not exception.
    } catch (ArrayIndexOutOfBoundsException e) {
      // ...do something
    }

    // ! Unchecked Exception (Runtime Exception)
    // 
    // ! Checked Exception (Complie time Exception)
    

    

  }
}