import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // 0.1 + 0.2
    System.out.println(0.1 + 0.2);

    // Solution
    // new String("hello")

    // ! 1. new BigDecimal("0.1")
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");

    BigDecimal result = bd1.add(bd2);
    System.out.println(result); // 0.3

    double salary = 22500.99;
    double bonus = 1500.99;
    System.out.println(salary + bonus); // 24001.980000000003

    // ! 2. BigDecimal.valueOf
    BigDecimal bonus2 = BigDecimal.valueOf(1500.99);

    BigDecimal result2 = BigDecimal.valueOf(22500.99) //
        .add(BigDecimal.valueOf(1500.99));
    System.out.println(result2); // 24001.98

    // + add
    // - subtract
    // * multiply
    // / divide

    // subtract (0.3 - 0.1)
    BigDecimal result3 = BigDecimal.valueOf(0.3) //
        .subtract(BigDecimal.valueOf(0.1));
    System.out.println(result3); // 0.2

    // multiply (0.1 * 0.2) -> 0.02
    BigDecimal result4 = BigDecimal.valueOf(0.1) //
        .multiply(BigDecimal.valueOf(0.2));
    System.out.println(result4); // 0.02

    // divide
    // 1. 10 / 3 -> 3.33333333
    // 2. rounding

    // ! Non-terminating decimal expansion
    // BigDecimal result5 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3));
    // System.out.println(result5);

    // 4捨5入
    BigDecimal result5 = BigDecimal.valueOf(10) //
        .divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP); // HALF -> 5, 
        //HALF -->5. HALF_UP 意思是0.5 以上就進1（ 四捨五入）
    System.out.println(result5); // 3.33
    
    // 5捨6入
    BigDecimal result6 = BigDecimal.valueOf(6.7).divide(BigDecimal.valueOf(2),
        1, RoundingMode.HALF_DOWN);
    System.out.println(result6); // 3.3, RoundingMode.HALF_DOWN);

    BigDecimal bd3 = BigDecimal.valueOf(10.0);
    BigDecimal bd4 = BigDecimal.valueOf(0.0);

    // risk (Divide Zero) -> avoid
    if (!bd4.equals(BigDecimal.valueOf(0.0))) {
      BigDecimal result7 = bd3.divide(bd4, 1, RoundingMode.HALF_DOWN); //
    } else {
      System.out.println("Sorry, bd4 cannot be zero.");
    }



  }
}