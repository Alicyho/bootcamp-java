package src;

public class JavaExercise2 {
    public static void main(String[] args) {

        // ==================== Question 1: int ====================
        int a = 10;

        if (a == 9) {
            System.out.println("a is equals to 9");
        } else if ( a>= 0 && a <= 8) {
            System.out.println("a is between 0 and 8");
        } else if (a > 9)  {
            System.out.println("a is greater than 9");
        } else {
            System.out.println("a is negative");
        }

        // ==================== Question 2: String length ====================
        String str = "I love Java. I love coding";

        if (str.length() == 27) {
            System.out.println("str length = 27");
        } else if (str.length() < 27) {
            System.out.println("str length < 27");
        } else if (str.length() > 27) {
            System.out.println("str length > 27");
        }

        // ==================== Question 3: 多個 primitives + String ====================
        int score = 85;
        char grade = 'B';

        // 根據 score 判斷等級
        if (score >= 90) {
            System.out.println("Excellent! You got A");
        } else if (score >= 75 && score < 90) {
            System.out.println("Good! You got B");
        } else if (score >=60 && score <75) {
            System.out.println("Pass! You got C");
        } else {
            System.out.println("Fail... You need to study harder");
        }

        // ==================== Question 4: String equals ====================
        String language = "Java";

        if (language.equals("Java")) //other way to write if("Java".equals(language)
            {
            System.out.println("We are learning the best programming language!");
        } else if (language.equals("Python")) {
            System.out.println("Python is also very popular.");
        } else {
            System.out.println("Other programming language.");
        }

    }
}
