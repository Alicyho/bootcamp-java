  //!APIE: Inheritance
  // Animal is an abstract description of Cat/Dog
  //Object
  public abstract class Animal { //加上 "abstract" 
  // 將會鎖定 "Animal" 即是ANIMAL為最大OBJECT，
  //同時亦不可以NEW，即不能為OBJECT的意思
    //! Common Attributes
    private String name;
    private int age;

      public Animal (){
      }

      public Animal (String name, int age){
      this.name = name;
      this.age = age;
      }

      public int getAge(){
          return this.age;
      }

      public String getName(){
          return this.name;
      }

    public void setName (String name) {
      this.name = name;
    }

    public void setAge (int age){
      this.age = age;
    }
  }
