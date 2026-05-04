public class DemoString {
  public static void main(String[] args) {

    // ! String is not Primitive, but a class
    // Class has method

    // Print String value
    System.out.println("hello");

    // "" -> define String value
    // String value can be any length
    String s1 = "h";
    char c1 = 'h';

    // String support + operation (append)
    s1 = s1 + "!!!";
    System.out.println(s1); // h!!!

    // String has methods (function)
    // 1. length() -> return int
    System.out.println(s1.length()); // 4
    System.out.println(s1); // h!!!

    // 2. charAt() -> return char
    String s2 = "hello";
    // Find the third character in s2

    // Java index: start with 0 -> length - 1
    // "hello" -> 0 (h), 4 (o)
    System.out.println(s2.charAt(2)); // l

    // Find the last character of s2
    // length(), charAt()

    // length() -> int value
    // int value - 1 -> int value
    System.out.println(s2.charAt(s2.length() - 1));

    int stringLength = s2.length();
    int lastIndex = stringLength - 1;
    System.out.println(s2.charAt(lastIndex));

    // 3. eqauls() -> return boolean
    String s3 = "hello";
    System.out.println(s2.equals(s3)); // true

    String s4 = "Hello";
    System.out.println(s2.equals(s4)); // false

    // 4. isEmpty()
    String s5 = ""; // empty value
    System.out.println(s5.isEmpty()); // true
    System.out.println(s4.isEmpty()); // false
    if (s5.isEmpty()) {

    }

    // 5. isBlank()
    String s6 = " ";// 裏面有空間，所以不算EMPTY
    System.out.println(s6.isEmpty()); // false
    System.out.println(s6.isBlank()); // true

    // 6. toLowerCase/ toUpperCase
    String lowercase = s4.toLowerCase();
    String uppercase = s4.toUpperCase();
    System.out.println(s4); // Hello
    System.out.println(lowercase); // hello
    System.out.println(uppercase); // HELLO

    // 7. contains() (Case-sensitive) --找出"ll" 這兩個字
    if (s4.contains("ll")) {
      System.out.println("contains ll");
    }
    if (s4.contains("lll")) {
      System.out.println("contains lll");
    } else {
      System.out.println("Does not contain lll");
    }

    // 8. starts with / ends with
    if (s4.startsWith("He")) {
      System.out.println("Starts with He");
    }
    if (s4.endsWith("llo")) {
      System.out.println("Ends with llo");
    }

    // 9. replace -> return String (由o 改為 x)
    String s10 = "Bootcamp";
    String s11 = s10.replace('o', 'x');
    System.out.println(s11); // "Bxxtcamp"

    //9. remove "camp"
    String s12 = s10.replace("camp", "");
    System.out.println(s12); // Boot

    // 10. substring(startIndex, endIndex)
    String s13 = "hello";
    String ss = s13.substring(2, 4);
    System.out.println(ss); // ll, because startIndex = 2, endIndex - 1 = 3
    //endIndex 會減-1，所以變左第3個INDEX


    System.out.println(s13.substring(1)); // ello (由1 index 去到尾 )

    // 11. indexOf -> return index
    String s14 = "bootcamp";
    System.out.println(s14.indexOf('o')); // 1 （如有相同 oo, 會搵最後一個o)
    System.out.println(s14.indexOf("camp")); // 4
    System.out.println(s14.indexOf("java")); // -1 (搵唔到出 -1)
    System.out.println(s14.indexOf("CAMP")); // -1
    System.out.println(s14.indexOf(97)); // 5 --97 對應的字元是 'a'（小寫 a），4 → 'a' 在索引 4
     System.out.println(s14.indexOf("t"));//3


    // 12. lastIndexOf
    System.out.println(s14.lastIndexOf('o')); // 2
    System.out.println(s14.lastIndexOf("oo")); // 1

    // 13. trim (Remove the leading and tail space)-- remove 所以頭尾space
    String s15 = "   hello world ";
    String afterTrim = s15.trim();
    System.out.println(afterTrim); // "hello world"
    System.out.println(s15.replace(" ", "")); // helloworld

    // 14. concat. (兩個加起來)
    String s16 = "hello";
    String s17 = "world";
    // String + String -> String
    System.out.println(s16 + s17); // helloworld

    String combinedString = s16.concat(s17);
    System.out.println(combinedString); // helloworld

    // 15. compareTo
    String s18 = "abc";
    String s19 = "def";
    System.out.println(s18.compareTo(s19)); // -3 ('a' - 'd')

    if (s18.compareTo(s19) > 0) {
      System.out.println("s18 ASCII > s19 ASCII");
    } else {
      System.out.println("s19 ASCII > s18 ASCII");
    }

    // 16. equalsIgnoreCase()
    String s20 = "John Lau";
    String s21 = "JOHN LAU";
    if (s20.equalsIgnoreCase(s21)) {
      System.out.println("The names are same.");
    }


  }
}