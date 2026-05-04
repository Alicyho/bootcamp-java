public class Week1Revision {
  public static void main(String[] args) {
    System.out.println("hello");//打印
    //8 Primitives ＋ String
    //btye b1 = 5;  // -128 to 127
    //short s1 = 30000 // -30000 to 30000
    //int i1 = 2100,000,000 to -2100,000,000,000
    //long l1 = 2_200_000_000L; //一定要加L先係LONG，否則是INVALID INT VALUE
    //double 
    double d1 =10.99;
    //10.99 is double value (present ok)
     //10.99d is double value (present ok)
     
     //float 
     float f1 =10.99f;

     // boolean 

     boolean b01 = true; // ture or false

     // char ch1
     char ch1 = 'a';// 97 -> ascii
     // 0 - 6xxxx (有零至六萬多個字)


     //Math
     //涉及 overflow
     //casting (eg down casting -- int --> int)
     //divide 0
     // double + double (0.1 + 0.2)

     int number =2_100_000_000;
     //如果加上去 （以上已是MAX）
     //answer: (int+long)
     long number2= number +100_000_000L;
     System.out.println(number2);

     //overflow
     //int + int = int
     int number3 = number + 100_000_000;
     System.out.println(number3);

     //downcast
     //byte +byte -> int + int -> int
     // short + short ->  int + int -> int

     byte by1 = 100;
     short sh =32767;//另一種表達 -- short sh = Short.MAX_VALUE;
     //short sh2 = by1 + sh; (因為不正確，會變成INT)
     //以下為解決方法：
     short sh2 = (short)(by1 + sh);
     System.out.println(sh2); //-32669

     //double +double ->double
     System.out.println(0.1+0.2);//不正確，因為DOUBLE不能加DOUBLE


     //String
     String str1 = "hello";

     // length (return int)
     System.out.println(str1.length());

     // charAt (return char)
     System.out.println(str1.charAt(0));
     System.out.println(str1.charAt(str1.length()-1));
     String str2 ="hello";

     // equals (return boolean)
     System.out.println(str1.equals(str2));//ture

     //indexOf (return int)
     System.out.println(str1.indexOf('o'));//
     System.out.println(str1.indexOf("ll"));

     //contains (return boolean)
     System.out.println(str1.contains("ll"));//true

     // substring (endIndex -1) (return String)
     System.out.println(str1.substring(0, 3)); // hel

     //replace (return String)
     System.out.println(str1.replace ("ll", "xxx"));//hexxxo

     //startsWith (return boolean)
     System.out.println(str1.startsWith("he"));//true
     //endsWith (return boolean)
  
     System.out.println(str1.endsWith("lllo"));//false
     // equalsIgnoreCase (return boolean)
    System.out.println("Hello".equalsIgnoreCase(str1)); // true
    // compareTo (return int)
    System.out.println("abc".compareTo("ggg")); // a - g (-6)

     // trim
     System.out.println(". hello. world.".trim());//"hello  world."

     //isEmpty (return boolean)
     System.out.println("abc".isEmpty());//false
     System.out.println("".isEmpty());//ture
     System.out.println(" ".isEmpty());//false

     //isBlank (return boolean)
     System.out.println("abc".isBlank());//false
     System.out.println("".isBlank());//ture
     System.out.println("".isBlank());// ture

     // lastIndexOf (return int)
     System.out.println("abcoodefooo".lastIndexOf("oo"));//9
     //concat (return String)
     System.out.println("abc".concat("def"));//abcdef
    // toLowerCase toUpperCase (retrun String)
     System.out.println("AbC".toLowerCase()); // abc
    System.out.println("AbC".toUpperCase()); // ABC


    //ASCII
    char ch2 = 'a';

    // char + int -> int + int -> int
    int ascii = ch2 +1;
    System.out.println(ascii);//98

    // char + int -> int + int -> int
    int ascii2 = ch2 + 70000;
    System.out.println(ascii2); // 70097

    //take risk --> overflow

    // char + int -> int + int -> int
    // You take risk -> down cast -> overflow
    char ch3 = (char) (ch2 + 65535 + 1); // 0 - 65535
    System.out.println(ch3); // a

    //Operator
    // Math: +,-,*,/,%,++,--,+=,-=,*=,/=
    int h = 3;
    h++;
    ++h;
    System.out.println(h);


    int a = 10;
    // 11 + (33) = 44
    // 12
    System.out.println(++a + a++ * 3); // 44

    // same as:
    a = 10;
    ++a; // 11
    a = a + a * 3; // 44


    //Comparison:>,<,>=,<=,==,!=, !
// Primitives Comparsion (>,<,>=,<=,==,!=,!)
    int age = 19;
    boolean isAdult = age >= 18;
    if (!isAdult) { // isAdult == false
      System.out.println("He is not an adult.");
    }

    // String Comparsion (method)
    String s10 = "hello";
    String s11 = new String("hello");
    System.out.println(s10); // hello
    System.out.println(s11); // hello
    System.out.println(s10 == s11); // false
    System.out.println(s10.equals(s11)); // true

    //If + Switch (Conditiional)
    //!else if -> If you are beginner, strongly recommand not to write complicated condition in "else if"
double price = 99.99;
    int quantity = 10;
    // amount >= 500, discount 10% off
    // amount >= 1000, discount 20% off
    // below 500, 5% off
    double amount = price * quantity;
    if (amount >= 1000) {
      amount = amount * 0.9;
    } else if (amount >= 500) {
      amount = amount * 0.8;
    } else {
      amount = amount * 0.95;
      }

    // Switch
    // 加break
    // Check Single Value ONLY (Not range checking)
char grade = 'A';
    switch (grade) {
      case 'A':
        System.out.println("Grade=A.");
        break;
      case 'B':
        System.out.println("Grade=B.");
        break;
      default:
        System.out.println("Failed.");
    }

    // For loop
    for (int i = 0; i < 3; i++) {
      System.out.println("bootcamp");
    }
    String s = "hello";
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i));
    }

    
    // hlo
    // el

    // Searching -> target -> do something.
    String t1 = "";
    String t2 = "";
    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        t1 += s.charAt(i);
      } else {
        t2 += s.charAt(i);
      }
    }
    System.out.println(t1);
    System.out.println(t2);

    //counting -> target
    //how many 'l'in the string
    int countl = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'l') {
        countl++;
      }
    }
    System.out.println(countl);


  }
}





