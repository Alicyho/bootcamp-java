

public abstract class Person {
  private String name;
  private int age;

      public Person() {
    }


  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }



  public String getName(){
    return name;

  }

  public int getAge() {
    return age;
  }

    public void setName(String name) { 
       this.name = name;
    }
  
  public void setAge(int age) {  
        this.age = age;
    }



public void performDuty(){
  System.out.println();
}

public void introduce(){
  System.out.println("My name is " + name + ", I am " + age + " years old");
}
}

