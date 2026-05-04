

public class Primitives {
// RAM -> Stack,Heap Memory (Short Term) -> after main method complete
  // the assigned memory will be released.
  public static void main(String[] args) {
    // int -> integer （整數)
    // define "appleCount" -> store integer ONLY
    
    // appleCount -> variable (變量)
    int appleCount = 100;

    // double -> with decimal

    double applePrice = 4.99;

    // Java -> Cannot convert different type of data directly. 
    // int orangePrice = 10.99;

    System.out.println("hello");

    // Java Case-sensitive
    System.out.println(appleCount); // 100
    System.out.println(applePrice); // 4.99

    // Primitive (Raw Data Type)
    // int, byte, short, long
    // double, float
    // boolean
    // char

    // true or false
    boolean b1 = false;
    boolean isElderly = true;
    System.out.println(isElderly);

    // Single Character ONLY
    // 6xxxx
    // ' '
    char c1 = 'a';
    char c2 = '!';
    char c3 = '+';
    char c4 = '好';
    char c5 = ' ';
    // char c6 = '';

    // Java -> Integer

    // Declaration
    int i1;

    // Re-define same variable is not allowed
    // double i1;

    // Assignment
    i1 = 100;

    // declare + assign
    int i2 = 200;

    // Assign fixed Memory for i1
    // -2,1xx,xxx,xxx to 2,1xx,xxx,xxx
    int i3 = 2100000000;
    int age = 13;

    // long 2^63
    
    // byte (-128 to 127)
    byte by1 = 127;
    byte by2 = -128;
    // byte by3 = -129;

    // short
    // -32768 to 32767
    short s1 = 32767;
    short s2 = -32768;
    // short s3 = -32769;

    // 1,000,000
    int k1 = 1_000_000;

    // double, float
    
    // d1 (double variable)
    // 100.99 (double value)
    // 100.99d (double value)
    // so, we can assign a double value into a double value
    double d1 = 100.99;

    // 100.99f (float value)
    // f1 (float variable)
    // so, we can assign a float value into a float variable
    float f1 = 100.99f;

    // You cannot assign a double value into a float variable
    // float f2 = 100.99;

    // 100 -> int value
    // i20 -> int variable
    // 100L -> long value
    int i20 = 100;
    long l20 = 200L;

    // '9' -> char value
    // c9 -> char variable
    char c9 = '9';

    // true/false -> boolean value

    // +, -
    char c10 = 'a';
    

    System.out.println('a'+1);//98

        //! char + int -> int
        //! assign 98 into c11 (char exceptional case 小屋搬入大屋（int)
    char c11 = 'a' +1;
    System.out.println(c11);//b

    char c12 = 'a' + 25;
    System.out.println(c12);//z

    char ch1 = 'a';
    char ch2 = 'b';

    if (ch2 > ch1) {// compar ascii
      System.out.println("ch2 ascii > ch1 ascii");
    }

  }
}
