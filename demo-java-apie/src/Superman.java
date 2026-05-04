//一、類別與繼承
//public class Superman extends Human
//→ Superman 繼承 Human，擁有 Human 的屬性或方法（雖然此處 Human 未實作，但語意上表示「超人也是人類」）


//二、實作多個介面（Multiple Interfaces）
//implements Flyable, Swimable
//→ 表示 Superman 實作飛翔與游泳的能力
//*Java 類別只能繼承一個父類別，但可以實作多個介面 - // ! Polymorphism 多態性
//* 介面中的方法必須在類別中實作（除非類別為抽象

// interface
// ! A Class may have multiple interfaces
public class Superman extends Human implements Flyable, Swimable { // ! Polymorphism

  // private static int attackValue = 5; // a look up value



  // ! Attributes (三、屬性（Attributes）)
  // hp：生命值，初始 100
  // attackValue：攻擊力，初始 5
  // 使用 private 封裝，避免外部直接修改
  private int hp; // 100
  private int attackValue;
  private String name;

  public Superman() { //set 第一個超人
    this.hp = 100;
    this.attackValue = 5;
    
  }

  public Superman (String name){ //set 第二個超人
    super(name); // 呼叫父類別無參數建構子
    this.hp=100;
    this.attackValue = 5;
  }

  // ! Instance Method (Skill -> Contract) 五、實作介面方法（Override）
  // @Override 檢查是否正確覆寫介面方法
  //這是 多型（Polymorphism） 的基礎：將 Superman 當作 Flyable 或 Swimable 使用
  
  @Override
  public void fly() {
    System.out.println(super.getName() + " Superman is flying ...");
  }

  @Override // check if the interface contains method
  public void swim() {
    System.out.println("Superman is swimming ...");
  }


  //六、自定義方法 （Instance Method）
  public void sleep() {
    System.out.println("I am Sleeping...");
  }

  
  public int sum(int x, int y) {
    return x + y;
  }

  public double sum(double x, double y) {
    return x + y;
  }
  
  //七、生命值管理（狀態改變）
  //狀態改變的重點：物件自己的 HP 由自己的方法修改（封裝）不該由外部直接 s2.hp = ...
  public boolean isAlive() {
    return this.hp > 0;
  }

  // setter (flexible)
  // public void setHp(int hp) {
  // this.hp = hp;
  // }

  // ! setHp() -> deductHp()
  //八、攻擊邏輯（物件互動）
  //this：攻擊者，superman：被攻擊者
  //✅ 重點觀念：攻擊者呼叫被攻擊者的方法來改變對方狀態，不是攻擊者直接改對方 HP（不符合封裝）

  public void deductHp(int toBeDeducted) {
    if (this.hp >= toBeDeducted) {
      this.hp = this.hp - toBeDeducted;
    } else {
      this.hp = 0;
    }
  }

  public int getHp() {
    return this.hp;
  }

  public void attack(Superman superman) {
    // s1 attack value
    // s2 status change
    // s1 (this), s2 (superman)
    if (this.isAlive()) {
      superman.deductHp(this.attackValue);
    } else {
      System.out.println("You die already. Cannot Attack.");
    }
  }

  public static void main(String[] args) {
    //2. Calling a Method （呼叫方法） ( 不需要 new)
    // To call sleep(), you use the existing object s1. You do not write new again because the object already exists
    // 要呼叫 sleep()，你使用已經存在的物件 s1。你不需要再寫一次 new，因為物件已經存在了。
    //new is for creation. Method calls (like .sleep()) are for action.
    //new 是為了創造。方法呼叫（例如 .sleep()）是為了動作。
    //If there is no object yet, write new. If the object already exists, just use its name.
    //如果還沒有物件，就寫 new。如果物件已經存在，直接使用它的名字即可。
    Superman s1 = new Superman();
    s1.sleep();
    s1.fly();

    // Developer = Coding + Testing (Test Case)
    System.out.println(s1.isAlive()); // true
    s1.deductHp(80);
    System.out.println(s1.getHp()); // 20
    System.out.println(s1.isAlive()); // false

    Superman s2 = new Superman();
    
    s1.attack(s2); // 
    System.out.println(s1.getHp()); // 20
    System.out.println(s2.getHp()); // 95

      // object s1 this and s2 superman
      // s1 attack value
      // s2 how to change its status
      // s1 (this), s2 (superman)
        // Superman attack Superman
  //thinking  how to write -> 狀態改變 --> eg HP deduct --> 被改變方
  // S1 attack S2 --> S2 改變HP
  //製造一個方法去改變.. 
  // Status Change (s2) -> s2 has method to change status (deduct)

    Superman s3 = new Superman("John");
    System.out.println(s3.getName()); // John
    s3.setName("Peter");
    System.out.println(s3.getName()); // Peter

    //! Polymorphism (多態)
    Superman s4 = new Superman ();
    //Parent Class can be the Object Reference Type
    Human h1 = new Superman ();
    // ! Compile time, h1 can call Parent Class Method ONLY
    // ! Object Reference Type decide what you can call.
    //Human h1 = new Superman (); 
    //h1.fly();
    //h1.swim();
    System.out.println(h1.getName());
    h1.setName("John");

    // !Runtime, h1 will know it points to Superman object
    // Superman s5 = new Human (); // but cannot reverse
  
    //*Two Types of Polymorphism */
    //*Static Polymorphism */
    // call 什麼METHOD，以參數來決定。
    //CALL methodName 
    // Example (int x, int y), methodName (double x, double y)
    String.valueOf(true); // "ture" 
    String.valueOf(new char[] {'a', 'b'}); // "ab"

    //*Dynamic Polymorphism -- runtime - 指針有機會指向不同OBJECT，EG： getName, getAge;
    //(Runtime decide method content) */

    // h1 -> Superman Object (getName) or Student Object (getName)
    
    //*Polymorphism: interface */。收窄範圍
    Flyable f = new Superman("Leo");
    f.fly(); // runtime -> fly ()method content. (這個不能CALL SWIM)
    // Superman is flying ...
    // f.swim ();

    Swimable s = new Superman ("Jason"); //這個不能CALL FLY
    s.swim();
    // Superman is swimming ...
    // s.fly();

    
    Flyable []  flys = new Flyable [] {new Bird (), new Superman ("Susan"), new Superman ("Hugo")}; 
    //雖然BIRD不在這個WORKSHEET，但POLYMORPHISM 可以將SUPERMAN 以外，即是BIRD 加入來。
    for (int i = 0; i < flys.length; i++){
      flys[i].fly();
    }
  }
}
