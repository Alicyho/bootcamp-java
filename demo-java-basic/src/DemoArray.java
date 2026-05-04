
import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // int type
    int age = 10;
    int johnAge = 18;
    int maryAge = 17;

    // Array: store a set of same type values
    // Array is an unit in memory
    int[] ages = new int[3];  //意思是開了三個房倉，已決定左要幾多個格仔
    // First Box
    ages[0] = age; // Assign 10 into the first box
    // Second Box
    ages[1] = johnAge;
    // Third Box
    ages[2] = maryAge;

    // swap john and mary age (array)
    int temp = ages[1];
    ages[1] = ages[2];
    ages[2] = temp;

    // 顯示交換後的陣列
   
    System.out.println("ages[0]: " + ages[0]);  // 25 (不變)
    System.out.println("ages[1] (John): " + ages[1]);  // 28 (變成Mary的年齡)
    System.out.println("ages[2] (Mary): " + ages[2]);  // 30 (變成John的年齡)


    //text
    // 交換前：
    // 索引:   [0]    [1]    [2]
    //       ┌────┬────┬────┐
    //       │ 25 │ 30 │ 28 │
    //       └────┴────┴────┘
    //             ↑     ↑
    //           John  Mary

    // 執行交換：
    // 1. int temp = ages[1];  // temp = 30
    // 2. ages[1] = ages[2];   // ages[1] = 28
    // 3. ages[2] = temp;      // ages[2] = 30

    // 交換後：
    //       ┌────┬────┬────┐
    //       │ 25 │ 28 │ 30 │
    //       └────┴────┴────┘
    //             ↑     ↑
    //           John  Mary (年齡互換了)

    for (int i = 0; i < ages.length; i++) { // 0,1,2. --只有三個間仔
      System.out.println(ages[i]);
    }
    // System.out.println(ages[0]);
    // System.out.println(ages[1]);
    // System.out.println(ages[2]);

    // System.out.println(ages[-1]); // runtime error
    // System.out.println(ages[3]); // runtime error

    // declare length 100 int array (0-99)
    int[] arr = new int[100]; // default value 0
    // print out all values
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    // assign 100 - 199 into the array
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 100;
    }

    // Two ways to declare an array (with known value set)
    //(已知的value) Two way to declare an arrray (with know value set)
    char[] chs = new char[4]; //char array 只能放char

    // Assignment

    //1.
    //順序 （a,b,c,d)
    chs[0] = 'a';
    chs[1] = 'b';
    chs[2] = 'c';
    chs[3] = 'd';

    System.out.println("chs[0]"+chs[0]);
    System.out.println("chs[1]"+chs[1]);
    System.out.println("chs[2]"+chs[2]);
    System.out.println("chs[3]"+chs[3]);


  //2. print out all prices

    double[] prices = new double[] {99.99, 50.3, 100.0};
    // print out all prices
    for (int i = 0; i < prices.length; i++) {
      System.out.println(prices[i]);
    }
    //3. sum up all prices
    double totalPrice = 0.0;
    for (int i = 0; i < prices.length; i++) {
      totalPrice += prices[i];
    }
    System.out.println("total price=" + totalPrice);
    
    //4. find the min value
    double minPrice = prices[0];
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }
    }

      //5. find the max value
    double maxPrice = prices[0];
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] > maxPrice) {
        maxPrice = prices[i];
      }
    }
  

    // int[], double[], String[], char[]. -- 主要的array
    char[] chs2 = new char[] {'a', 'e', 'i', 'o', 'u'};
    String name = "Mary";
    // loop: Check the name if it contains the char value in chs2
    boolean found = false;
    for (int i = 0; i < name.length(); i++) {
      if (name.charAt(i) == chs2[0] || name.charAt(i) == chs2[1]
          || name.charAt(i) == chs2[2] || name.charAt(i) == chs2[3]
          || name.charAt(i) == chs2[4]) {
        found = true;
        break; // break loop
      }
    }
    System.out.println(found); // true

    // outer loop and inner loop
    found = false;
    for (int i = 0; i < name.length(); i++) { // outer loop (every char in the name)
      for (int j = 0; j < chs2.length; j++) { // inner loop (every char in the chs2)
        if (name.charAt(i) == chs2[j]) {
          found = true;
          break; // break inner loop
        }
      }
      if (found) {
        break; // break outer loop
      }
    }
    System.out.println(found); // true

    //
    int[] arr2 = new int[] {100, 4, 99, 55, 17};
    // move the first number to the tail -> 4, 99, 55, 17, 100
    // swap
    for (int i = 0; i < arr2.length - 1; i++) {
      int backup = arr2[i];
      arr2[i] = arr2[i + 1];
      arr2[i + 1] = backup;
    }
    // 100, 4, 99, 55, 17
    // 4, 100, 99, 55, 17
    // 4, 99, 100, 55, 17
    // 4, 99, 55, 100, 17
    // 4, 99, 55, 17, 100
    System.out.println(Arrays.toString(arr2)); // [4, 99, 55, 17, 100]

    int[] arr3 = new int[] {100, 4, 200, 55, 17};
    // Move the max number to the tail [x, x, x, x, 200]
    for (int i = 0; i < arr2.length - 1; i++) {
      if (arr3[i] > arr3[i + 1]) {
        int backup = arr3[i];
        arr3[i] = arr3[i + 1];
        arr3[i + 1] = backup;
      }
    }
    System.out.println(Arrays.toString(arr3)); // 4, 100, 55, 17, 200

    // Sorting. (有SWAP元素) -- bubble sort (冒泡排序法) -- O(n^2) -- 兩層loop
    // 4, 55, 17, 100, 200
    int[] arr4 = new int[] {100, 4, 200, 55, 17};
    for (int i = 0; i < arr2.length - 1; i++) { // 0,1,2,3 (How many times you move the max number)
      for (int j = 0; j < arr2.length - 1 - i; j++) { // (How many moves you need for max number)
        if (arr4[j] > arr4[j + 1]) {
          int backup = arr4[j];
          arr4[j] = arr4[j + 1];
          arr4[j + 1] = backup;
        }
      }
    }
    System.out.println(Arrays.toString(arr4));

    String str = "abcdefg";
    // reverse the string
    // gfedcba
    String reversedString = "";
    for (int i = 0; i < str.length(); i++) {
      reversedString += str.charAt(str.length() - 1 - i);
    }
    System.out.println("reversed=" + reversedString);


  }
}
