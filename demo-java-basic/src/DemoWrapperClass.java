public class DemoWrapperClass {
  public static void main(String[] args) {
    //Primitives (byte, short, int, long, float, double, char, boolean)
    //Wrapper Class
    byte b1 = 100; // Primitive
    Byte b2 = 100; // Class

    short s1 = 100;
    Short s2 = 100;

    int x1 =100;
    if (x1 ==100){

    }
    // !Always use method for comparsion
    Integer x2 = 99;
    // Integer compareTo:
    // left > right -> return 1
    // left < right -> return -1
    // left == right ->  return 0
    //Integer compareTo: left > right -> return 1

    if (x2.compareTo(100) > 0) { // check if x2 is larger than 100
      System.out.println("larger than");
    }
    if (x2.compareTo(100) < 0) { // check if x2 is smaller than 100
      System.out.println("smaller than");
    }
    if (x2.equals(100)) { // check if x2 equals to 100
      System.out.println("equals");
    }
    if (!x2.equals(100)) { // check if x2 NOT equals to 100
      System.out.println("NOT equals");
    }


    long l1 = 100L;
    Long l2 = 100L;

    float f1 = 9.0f;
    Float f2 = 9.0f;

    double d1 = 100.99;
    Double d2 = 100.99;

 char ch1 = 'c';
    Character ch2 = 'c';
    
    if (ch2.equals('c')) {
      System.out.println("equals");
    }
    if (!ch2.equals('c')) {
      System.out.println("NOT equals");
    }
    if (ch2.compareTo('c') > 0) {
      System.out.println("ASCII left > right");
    }
    if (ch2.compareTo('c') < 0) {
      System.out.println("ASCII left < right");
    }
          

    boolean o1 = true;
    Boolean o2 = true;
 // equals and NOT equals

   // Internal Cache
   Integer k1 = 127;
   Integer k2 = 127;
   System.out.println(k1.equals(k2));// ture
   System.out.println(k1 == k2);//ture

    Integer k3 = 128;// create a new object, because not in the range of common use
 // create a new object, because not in the range of common use
   Integer k4 = 128;  // create a new object, because not in the range of common use
   // 因為JAVA覺得128 唔係常用數，所以128 就會變成OBJECT，
   //而不是常用數，所以k3 同K4 不同，所以K3＝K4 答案是FALSE
   System.out.println(k3.equals(k4)); // true
   System.out.println(k3 == k4); // false

   //！-128 to 127 (Java Define a range of common use number)

   // Integer (Class/Object) -> comparsion -> compareTo, equals

    //Implicit Promotion
    float f10 = 1000L;
    double d10 = 10.9f;
    float f12 = 19;
    byte b10 = 127;
    double d11 = b10; // OK (Assign byte value into double variable)
    int x10 = 'a';
    double d12 = 'a';//OK, 97.0

   // ! Wrapper Class vs Primitives (auto-box / un-box)
    //auto-box (long -> Long)
    Long l30 = 100L;//long -> Long
    Integer i30 = 100; // int -> Integer
    Character ch30 = 'x';

    // ! un-box (Long -> long)
    long l31 = l30;
    int i31 = i30;
    char ch31 = ch30;

    long l20 =100; // int -> long
    //! Java would not auto convert (implicit promotion) and (auto-box) at the same time
    //Long l21 = 100; // int -> long (implicit promotion) -> Long (auto-box)
    //Double d100 = 10;int->double ->Double (做唔錯)

    // !Unsafe down casting (Java disallow)
    //int x11 = d12;//!risky
    int x11 = (int) d12; // take risk, may be overflow
    System.out.println(x11);//97


    }
  }
  

