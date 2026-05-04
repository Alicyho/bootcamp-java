import java.util.Arrays;
import java.util.Random;
import javax.naming.ldap.SortKey;

public class DemoMath {
  // Tool
  public static boolean isDuplicated(int[] arr, int newNumber) { // input
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == newNumber) {
        return true;
      }
    }
   return false;
  }

  public static void main(String[] args) {
    // ! PI
    double pi = Math.PI;
    // circle area
    double radius = 3.5;
    double area = radius * radius * Math.PI;
    System.out.println(area);

    // ! sqrt (square 開方)
    System.out.println(Math.sqrt(9)); // 3.0
    System.out.println(Math.sqrt(81)); // 9.0
    System.out.println(Math.sqrt(80)); // 8.94427190999916

    // ! round (四捨五入) x
    System.out.println(Math.round(10.453)); // 10
    System.out.println(Math.round(10.543)); // 11

    // ! pow
    double result = Math.pow(2, 3); // implicit promotion
    System.out.println(Math.pow(2.333, 2.5)); // 8.313556391492568
    System.out.println(result); // 8.0

    double bmi = 76 / Math.pow(1.76, 2); // int / double -> double
    System.out.println(bmi);

    // ! abs
    int x = -2; // 2 / -2
    if (x < 0) {
      x = x * -1;
    }
    System.out.println(x); // 2
    
    int y = -3;
    System.out.println(Math.abs(y)); // 3

    // ! max/ min
    int[] arr = new int[] {10, 4, 8, 99, -2};
    // 同時找 find max mix
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);
      min = Math.min(arr[i], min);
    }
    // python arr.max -> 99 (loop)
    // python arr.min -> -2 (loop)
    
    // ! floor, ceil
    System.out.println(Math.floor(10.9)); // 10.0
    System.out.println(Math.ceil(10.1)); // 11.0

    // ! random
    double number = Math.random(); // 0 - 1
    System.out.println(number);

    // 100 - 1100
    // (Math.random() * 1000) + 100;

    // Assignment
    // 1 - 49 (random)
    // output: int[] -> 6 numbers (marksix) (no Duplicate)
int[] answers = new int[6];
    int idx = 0;
    // ! While Loop handles uncertain elapse time for end loop
    while (idx <= 5) {
      // ! Get a number
      int num = new Random().nextInt(49) + 1;
      if (isDuplicated(answers, num)) {
        continue; // ! Skip the rest, go to the next iteration
      } else {
        // ! place num to answers
        answers[idx++] = num; // 0-5
      }
    }
    System.out.println(Arrays.toString(answers));

  // Java Sorting (真係返工的JAVA)
    // Bubble Sort (inner loop), sort n numbers -> n^2 iterations.  
    //(因為如果 SORT NUMBER是100， 就要LOOP大概是100^2)
    Arrays.sort(answers); // sort n numbers -> n * logn (logn < n)
    System.out.println(Arrays.toString(answers));
  }
}
