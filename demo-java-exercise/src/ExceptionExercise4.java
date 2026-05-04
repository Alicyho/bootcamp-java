package src;

import java.util.Scanner;



  class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(errorMessage); 

      }
}

  // Follow the instructions below to complete the User Registration Process.
public class ExceptionExercise4 {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    scanner.close();
    
    // code here ...
    // call method registerUser(), handle the exception to print "User Registeration is Fail."
    // or "User Registeration is Success."
    
    // try, catch
   try {
            registerUser(username, password, email);
            System.out.println("User Registration is Success.");
        } catch (InvalidInputException e) {
            System.out.println("User Registration is Fail.");
            System.out.println("Reason: " + e.getMessage());
        }
    }

   public static class UserRegistrationException extends RuntimeException {
        public UserRegistrationException(String message) {
            super(message);
        }
    }
    // code here ...
  

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
    public static void registerUser(String username, String password, String email) {
        try {
            validateUsername(username);
            validatePassword(password);
            validateEmail(email);
        } catch (IllegalArgumentException e) {
            throw new UserRegistrationException(e.getMessage()); //這行會"e.getMessage, 會解釋e 出現的問題。
        }
        System.out.println("User registered successfully: " + username);
    }


  

  // Throw IllegalArgumentException if String username is null or empty string
     private static void validateUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
    }
  
    
  

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
    private static void validatePassword(String password) {
        if (password == null || password.length()<8) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        boolean isValidLength = password == null || password.length () < 8;
        boolean isWithSpecialChar = password.indexOf('!') != -1 
        || password.indexOf('@') != -1 || password.indexOf ('$') != -1 
        || password.indexOf('&') != -1 || password.indexOf('_') != -1; 
    if (!isValidLength || !isWithSpecialChar){
            throw new IllegalArgumentException();
          }
    }
        

  // Throw IllegalArgumentException if String email is null or it does not contain character @
  private static void validateEmail(String email) {

  if (email == null || !email.contains("@")){
    throw new IllegalArgumentException 
  }