package bootcamp;

public class Accounts {
  private static String x = "helloworld";

  // constant -> capital letter
  public static final double PI = 3.14159;
  public static final double HKD_USD_RATE = 7.85;

  public static String getX() {
    return x;
  }

  public static void main(String[] args) {
    System.out.println(Accounts.getX());

    System.out.println(Math.PI); // 3.14
    System.out.println(Accounts.PI);
    System.out.println(Accounts.HKD_USD_RATE);
  }
}