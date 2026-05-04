package src;
import java.util.Scanner;

public class JavaExercise4 {
  /**
   * Expected Output:
   * 
   * Example 1: Input a month number: 2 Input a year: 2016
   * 
   * February 2016 has 29 days
   * 
   * Example 2: Input a month number: 12 Input a year: 2014
   * 
   * December 2014 has 31 days
   * 
   * Example 3: Input a month number: 2 Input a year: 2100
   * 
   * February 2100 has 28 days
   * 
   * Example 4: Input a month number: 2 Input a year: 2000
   * 
   * February 2000 has 29 days
   */

  // Program the number of days that the month of a year has.

    // Leap Year: The February has 29 days:
    // 1. Every 4 years (the year is divided by 4)
    // 2. But if the year is divded by 100 and NOT divided by 400 -> Not a leap year.
    // 3. if the year is divided by 400, it is a leap year.
    
public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);


    System.out.print("Input a month number: ");
    int month = scanner.nextInt();

    System.out.print("Input a year: ");
    int year = scanner.nextInt();

                  int days = 0;


  
        
        switch (month) {
            case 1:
                month = 1;
                days = 31;
                break;
            case 2:
                month = 2;
                days = 28;
                break;
            case 3:
                month = 3;
                days = 31;
                break;
            case 4:
                month = 4;
                days = 30;
                break;
            case 5:
                month = 5;
                days = 31;
                break;
            case 6:
                month = 6;
                days = 30;
                break;
            case 7:
                month = 7;
                days = 31;
                break;
            case 8:
                month = 8;
                days = 31;
                break;
            case 9:
                month = 9;
                days = 30;
                break;
            case 10:
                month = 10;
                days = 31;
                break;
            case 11:
                month = 11;
                days = 30;
                break;
            case 12:
                month = 12;
                days = 31;
                break;
            default:
                System.out.println("please input the number of the month and year");
                scanner.close();
                return;
        }

        if (month == 2){
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
          days = 29;
 
        }
      }
        
        System.out.println(year + " has " + days + " days");
        scanner.close();
    }
    
  }
  


