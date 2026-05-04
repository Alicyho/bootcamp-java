

public class DemoLoop {
  //重複做一個程序
  public static void main(String[] args) {
    

    //For Loop (以下example repeat 50 times)
    // intialization -> int i = 0;
    // 中間 continue criteria -> i < 3
    // 最後 Each Iteration End -> i++
    for (int i= 0; i<3;i++ ){
      System.out.println("bye");
    }
    // Step 1: int i = 0;
    // Step 2: check if i <3
    // Step 3: print bye
    // Step 4: i++
    // Step 5: check if i <3
    // Step 6: print bye
    // Step 7: i++
    // Step 8: check if i <3
    // Step 9: print bye
    // Step 10: i++
    // Step 11: check if i <3 (i=3)
    // Step 12: exit loop

    for (int i=0; i<10;i++){// 0-9
      if(i %2 ==1){
        System.out.println("bye");
      }
    }

    // Print the numbers between 0-99, which divided by 3, and it is greater than 50
    for (int i=0; i<100; i++){
      if(i%3==0){
        if (i>=50)
          System.out.println(i);
      }
    }
    for (int i=0; i<100; i++){
      if (i>=50 && i%3==0){
        System.out.println(i);
      }
    }

    //hello
    //Find if character 'l' exists
    
    String s = "hello";
    boolean isTargetExists = false;
    for (int i = 0; i < s.length(); i++ ){
    System.out.println(s.charAt(i));
    if (s.charAt(i) == 'l'){
        isTargetExists = true;
        break; //break nearest loop
    }
  }
  System.out.println(isTargetExists);


    
  
  System.out.println(isTargetExists);

  String s2 = "947852106"; // Find the largest even digit

  int max = Integer.MIN_VALUE;

  for (int i = 0; i < s.length(); i++ ){
    int digit = s2.charAt(i)- '0'; // charAt-charAt = int - int
    if (digit % 2 ==0 && digit > max){
        max = digit;
      }
    }
  System.out.println(max);

  //

  String s3 ="8A3ahs0nd3";

  String output ="";
  for (int i = 0; i < s.length(); i++ ){
    boolean isAlphabet = s3.charAt (i) >=97 && s3.charAt(i) <122;
    if (isAlphabet){
      output +=s3.charAt(i);
    }
  }
  System.out.println(output);
  
   

   //"725094849"
   //Find the largest index of the largest digit
   //8
   String s5="725094849";
   int maxDigit = Integer.MIN_VALUE;
   int maxIndex =-1;

   //為什麼 maxDigit 設成 Integer.MIN_VALUE？
   // 確保第一個數字一定 >= 它，這樣第一個數字一定會被記錄
   // 如果設成 0，萬一數字都是負數就會出錯（但這裡是數字字串，沒問題，但習慣這樣寫更安全）
   // 為什麼 maxIndex 設成 -1？
   // 因為合法索引從 0 開始，-1 代表「還沒找到任何東西」
   // 如果最後還是 -1，代表整個字串沒有數字（但這裡一定有）
   
   for (int i = 0; i < s.length(); i++) {
    int digit = s.charAt(i) - '0'; // digit 也是自己取的名字，代表「目前字元轉成的數字」
    if (digit >= maxDigit) {
        maxDigit = digit;
        maxIndex = i;
    }
}










  }
}
