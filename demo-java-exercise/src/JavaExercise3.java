package src;
public class JavaExercise3 {
  public static void main(String[] args) {

    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase)
    // 2. Consonant (anothor 21 letters)
    // 3. Not an alphabet

    

    char ch = 'i';
    if ((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
          || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        System.out.println(ch + " " + "is a Vowel");
      } else {
        System.out.println(ch + " " + "is a Consonant");
      }
    } else {
      System.out.println(ch + " " + "is not a alphabet");
    }

    // Take salary and years of experience, then calculate and print bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus

    int exp = 12;
    int salary = 110_000;
    double bonus = 0.0;

    if (exp >= 10) {
      bonus = salary * 0.2;
      System.out.println(bonus);
    } else if (exp >= 5 && exp <= 9) {
      bonus = salary * 0.1;
      System.out.println(bonus);
    } else if (exp < 5) {
      bonus = salary * 0.05;
      System.out.println(bonus);
    }
  }
}
