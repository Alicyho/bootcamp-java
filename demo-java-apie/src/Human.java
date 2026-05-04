public abstract class Human {
  private String name;

  //
  public Human (){
    this.name = "John";
  }
  
  public Human (String name) {
    this.name = "name";
  }

  public String getName (){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }
}