
public class Demoif {
  public static void main(String[] args) {

    // if
    int age = 13;

    if (age >= 18) {
      System.out.println("hello");
    }

    // >, <, >=, <=
    if (age >= 18) { // because age is 13, so the result is false, go to else code block
      System.out.println("adult");
    } else {
      System.out.println("child"); // print
    }

    // 8 Primitives + String
    // boolean
    // = (assignment)
    // == (check if equals)
    age = 70;

    if (age > 65) {
      System.out.println("Fee=2");
    }

    boolean isElderly = age > 65; // true
    
    if (isElderly) {
      System.out.println("Fee=2");
    }

    if (isElderly == true) {
      System.out.println("Fee=2");
    }

    // && (AND) || (OR)
    int a = 18;
    // 2 conditions (fulfill at the same time)
    if (a >= 5 && a <= 20) {
      System.out.println("a is between 5 and 20.");
    }
    // Fulfill one of the conditions
    // ! or -> be careful to use else.
    if (a >= 5 || a <= 20) {
      System.out.println("a is either >= 5 or <= 20");
    }

    int b = 10;
    if (a > 20 || b > 12) {
      System.out.println("hello");
    } else {
        
    }

    // Event 1: a > 20 -> false
    // Event 2: b > 6 && b < 20 -> true
    if (a > 20 || b > 6 && b < 20) {
      System.out.println("correct.");
    }
    
    // Swap(交換 X同Y)
    int x = 9;
    int y = 5;
    int temp = x; // x -> backup
    x = y;
    y = temp;
    System.out.println(x);// 5
    System.out.println(y);// 9

    //find max between 2 numbers
    int j = 10;
    int k = 5;
    //10
    int max = k;
    if (j>k){
      max = j;
      System.out.println(j);
    }else {
      max = k;
    }
    System.out.println(k);


    // Find main btween 3 number  (設定全部的數字值不知道是多少，找最少的字數)
    int q = 10;
    int u = 2;
    int t = 8;


     int min = u;
    if (q<u){
      if (q<t){
        min =q;
      }else{
        min =t;
      }
    }else{
      if (u<t){
        min=u;
      }else{
          min = t;
        }
        } 
      
    //min
    System.out.println("min="+min);




    // double, char, String (Comparsion)
    // String -> methods

    int score = 78;
    // >=90 Grade A
    // >=80 and <90 Grade B
    // >=70 and <80 Grade C

    // Grade A or Grade B --> Excellet
    // Grade C -> Pass
    
        if (score >= 90) {
            System.out.println("Excellent! You got A");
        } else if (score >= 75 && score < 90) {
            System.out.println("Good! You got B");
        } else if (score >=60 && score <75) {
            System.out.println("Pass! You got C");
        } else {
            System.out.println("Fail... You need to study harder");
        }


    char grade = 'F';
        if (score >= 90){
          grade = 'A';
        } else if (score >=80){
          grade = 'B';
        } else if(score>=70){
          grade = 'C';
        }
        // Grade A or Grade B -> Price Excellent
        // Grade C -> Print Pass
        if (grade == 'A'|| grade =='B'){
          System.out.println("Excellent");
        }else if (grade =='C'){
          System.out.println("Pass.");
        }

        String s1 = "Java";
        // check if s1 starts with J or s1 length > 5 -> print hello
        // otherwise -> print byebye

        if (s1.charAt(0)=='J'||s1.length()>5){
          System.out.println("hello");
        }else{
          System.out.println("byebye");
        }

        // Switch 
        // 1. AND OR
        // 2. CANNOT Range checking 

        char gender = 'M';
        switch (gender){
          case'M':
           System.out.println("This is a men");
           break;
           case'F':
           System.out.println("This is a female");
           break;
           default:
            System.out.println("Invaild Gender.");}

        //
           int year = 2100;
           //it is a leap year.
           // it is not a leap year.

        // 用 boolean 來存判斷結果
        boolean isLeapYear = false;

        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        // 輸出結果
        if (isLeapYear) {
            System.out.println(year + " it is a leap year");
        } else {
            System.out.println(year + " it is not a leap year");
        }
    }


          }
        
        







        

  

