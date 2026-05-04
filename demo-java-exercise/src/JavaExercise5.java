package src;
public class JavaExercise5 {
  // Sum values of an array
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...

    boolean found = false;
    for (int i = 0; i<str.length();i++){
      char c = str.charAt(i);
      if (c == target){
        found = true;
        break;
      }
    }
  
  if (found) {
    System.err.println("Found.");
} else {
    System.err.println("Not Found.");
}
    }
}
