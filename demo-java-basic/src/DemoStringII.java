public class DemoStringII {
  public static void main(String[] args) {
    //! "hello" -> JVM create object in String Pool
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1.equals(s2));//true

    //String is a class
    //! new -> produce object (Force)
    int []arr = new int[3]; // produce array object
    Person p1 = new Person (); //produce person object
    String s3 = new String ("hello"); // produce String object
    String s4 = new String ("hello");
    
    // ! Don't use "==" for commparsion forever
    //  ! For Class Object (Non-Primitive) always use equals for comparsion
    //"==" -> check if they are in same address (same object)
    System.out.println(s1 == s2); // ture
    System.out.println(s4 == s3);  // false
    System.out.println(s1 == s3); // false
    System.out.println(s2 == s4); // false  

    // equals -> check if they are with same String value
    if (s1.equals(s4)) { // true
      System.out.println("hello");
    }

    //! All primitive still use == for comparsion.
    int x = 3;
    if (x == 3) {

    }

    Person p2 = new Person ();
    Person p3 = new Person();
    System.out.println(p2 == p3); // false ()
    System.out.println(p2.equals(p3));//false


  }
  
}
