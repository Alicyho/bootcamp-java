package demo-java-data-structure.src;

public class BusinessException extends RuntimeException{
  //寫一個架構給別人EXTEND，EG SYSTEM ERROR LIST-- TIMEOUT PROBLEM，LogIn Overtime
  private int code;

  private BusinessException (String message) {
    super(message);
  }
  public static BusinessEception of (SysError sysError){
    return new BusinessException(sysError.getCode(), sysError.getMessage);
  }

  public int getCode () {
    return this.code;
  }

  }



