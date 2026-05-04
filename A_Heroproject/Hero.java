package A_Heroproject;

public abstract class Hero {

  private static int idCounter = 0;
  private int id;
  private String name;
  private int level;
  private int exp;
  private int hp;
  private int mp;
  private Weapon weapon;

  // ???
  public Hero (String name){// id, level, exp 在這樣不能更改，
  // 而寫STRING NAME意思，可以給予更改其NAME
    this.id = ++idCounter;
    this.level = 1;
    this.exp = 0;
  }

  public Weapon getWeapon() {
    return this.weapon;
  }

  public void equip(Weapon weapon) {
    this.weapon = weapon;
  }

  public void removeWeapon() {
    this.weapon = null;
  }

  abstract int getPa();

  abstract void attack(Hero target);

  abstract void deductHp(int toBeDeducted);

  public boolean isAlive () {
    return this.hp >0;
  }

  public void addExp(int exp) {
    this.exp += exp;
  }

  public int getExp() {
    return this.exp;
  }

  public void levelUp(){
    this.level++;
    //refill hp, mp (max hp, max mp)

  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getLevel() {
    return this.level;
  }

  public int getHp() {
    return this.hp;
  }

  public static void main(String[] args) {
    Hero h1 = new Warrior("John");
    // attack() -> kill -> check EXP -> Full -> levelUp
    System.out.println(h1.getHp()); // 100
    h1.levelUp(); // ! Runtime -> Object's method
    System.out.println(h1.getHp()); // 200

    Hero h2 = new Warrior("Peter");
    h2.attack(h1);
    System.out.println(h1.getHp()); // 180 (basePA -20), 150 (+cc -50)
    System.out.println(h2.getHp()); // 100

    // Doran (多蘭之劍) & Hexdrinker (海克斯之劍)
    h2.equip(Sword.ofDORAN());
    System.out.println(h2.getPa()); // 25
    h2.removeWeapon();
    System.out.println(h2.getPa()); // 20
  } 

}
