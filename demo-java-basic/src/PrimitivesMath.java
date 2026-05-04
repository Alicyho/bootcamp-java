public class PrimitivesMath {
  public static void main(String[] args) {
    int count = 3;
    int price = 10;

    // Java: int value * int value -> int value
    // Assign int value into int variable (OK)
    int total = count * price;
    System.out.println(total); // 30

    int totalScore = 750;
    int peopleCount = 8;

    // Step 1: int value / int value -> int value (93)
    // Step 2: Assign int value into int variable (OK)
    int average = totalScore / peopleCount;
    System.out.println(average); // 93

    // Step 1: int value / int value -> int value (93)
    // Step 2: Assign int value into double variable (93 -> 93.0)
    double average2 = totalScore / peopleCount;
    System.out.println(average2); // 93.0

    // Math / 0
    int h = 100;
    int count1 = 0;
    // System.out.println(h / count1); // error

    int k = 100 + 300;
    System.out.println(k); // 400
    
    // Re-assignment
    k = 900;
    System.out.println(k); // 900

    // Overflow
    byte b1 = -128;
    // Step 1: byte value - int value -> int value
    System.out.println(b1 - 1); // -129

    // byte value - int value -> int value
    // I take my own risk
    b1 = (byte) (b1 - 3); // assign -131 into b1
    System.out.println(b1); // 125 (overflow)

    int amount = 2_100_000_000;

    // int value + int value -> int value
    // assign int value into int variable
    amount = amount + 100_000_000;
    System.out.println(amount); // -2094967296 (overflow)

    // how do you use long to solve?
    // int value + long value -> long value
    amount = 2_100_000_000;
    long newAmount = amount + 100_000_000L;
    System.out.println(newAmount); // 2200000000

    int o = 10 + 8 * 4;
    System.out.println(o);

    o = (10 + 8) * 4;
    System.out.println(o);

    o = ((10 + 8) / 2) * 4;
    System.out.println(o);

    double k2 = 0.1;
    double k3 = 0.2;
    System.out.println(k2 + k3); // 0.30000000000000004

}
}
