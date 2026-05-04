

public class DemoASCII {
  public static void main(String[] args) {
    // char (0-65535) -> int (21xxxxx)
    char c1 = 'a';
    
    // auto-conversion (promotion)
    int asciiValue = 'a';
    System.out.println(asciiValue); // 97

    // 'C'
    int ascii2 = 'C';
    System.out.println(ascii2);

    // '8'
    int ascii3 = '8';
    System.out.println(ascii3);

    int ascii4 = '好';
    System.out.println(ascii4); // 22909

    int ascii5 = ';';
    System.out.println(ascii5); // 59

    // how to convert back to char value.
    
    int ascii6 = 97;
    // char c2 = ascii6; // ! potentially risk

    char c3 = 65000;
    // char c4 = 66000;

    byte b1 = 100;
    byte b2 = 110;
    // byte value (+,-,*,/) -> int
    // ! byte + byte -> int + int
    int i2 = b1 + b2;
    System.out.println(i2); // 210

    short s1 = 20000;
    short s2 = 20000;
    // ! short + short -> int + int
    int i3 = s1 + s2;
    System.out.println(i3); // 40000

    double d1 = 999.99;
    // float f1 = d1; // risky (因為DOUBLE大於FLOAT)

    float f2 = 999.99f;
    double d2 = f2; // OK

  }
}

