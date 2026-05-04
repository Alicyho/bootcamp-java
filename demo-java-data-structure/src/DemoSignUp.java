public class DemoSignUp {
  public static void main(String[] args) {
    String firstName = "John";
    String lastName = "Lau";

    try{
      signUp(firstName, lastName);
    } catch (SignUpException e){
      System.out.println("Sign Up Fail." + e.getMessage());
    }

  }

  public static boolean isValidName (String name){
    for (int i = 0; i<name.length(); i++){
      if(name.charAt(i) <65||name.charAt(i) >= 90 && name.charAt(i) <97 || name.charAt (i) >122){
        return false;
      }
    }
    return true;
  }
  
  public static void signUp(String firstName, String lastName) {
    if(!isValidName(firstName)){
      throw new SignUpException ("First Name is invalid.");
    }
    if (!isValidName(lastName)){
      throw new SignUpException ("Last Name is invalid.");
    }
  }
  public static class SignUpException extends RuntimeException {
    public SignUpException (String message) {
      super (message);
    }
  }
}