public enum SysError {
  
    TIMEOUT (10000, "Connection timeout."),;

  private int code;
  private String message;

  private SysError (int code, String message){
    this.code = code;
    this.message = message;
  }
  
  public int getCode (){
    return this.code;
  }

  public String getMessage (){
    return this.message;

  
  }
}
