public class KDKDNtry {
  public static void main(String[] args) {

    String s4 = "Hello";
    
        // 7. contains() (Case-sensitive) --找出"ll" 這兩個字
    if (s4.contains("ll")) {
      System.out.println("contains ll");
    }
    if (s4.contains("lll")) {
      System.out.println("contains lll");
    } else {
      System.out.println("Does not contain lll");
      // Result:
      //contains ll
      //Does not contain lll

    }

       // 8. starts with / ends with
    if (s4.startsWith("He")) {
      System.out.println("Starts with He");
    }
    if (s4.endsWith("ello")) {
      System.out.println("Ends with ello");
  }
}
  
}
