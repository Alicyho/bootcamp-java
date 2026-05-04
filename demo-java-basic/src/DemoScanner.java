import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    
    //Scanner for collect user input
    Scanner s = new Scanner (System.in);

    System.out.println("Please input a number");

    int number =s.nextInt();//Pause
    System.out.println(number);
    
    // Even Number -> "It is an even number."
    // Odd Number -> "It is an odd number."
    
    if (number %2 ==1){
      System.out.println("It is an odd number");
    } else {
      System.out.println("It is an even number");
    }

  }
  
}
