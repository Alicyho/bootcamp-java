package src;
public class JavaExercise7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Sum up all odd number between 0 - 50

    // System.out.println("The sum is " + sum);

    int sum =0;

        for (int i = 1; i <= 50; i++) {
          if(i%2==0){
            continue;
          }
        sum+=i;
         System.out.println(sum);
  }
}
}
