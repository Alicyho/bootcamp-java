package A_Heroproject;
// ! final -- cannot be assigned after constructor, 出了FINAL，不可以修改。封裝不能改。
public class Sword extends Weapon {
  private final Type type;
  private int level;

  //Constructor
  private Sword(Type type) {
    this.type = type;
  }

  public static Sword ofDORAN(){ // 5
    return new Sword (Type.DORAN); //此NEW為CREATOR 新增 (由於FINAL已封裝，而不能給予別人參與。
  }

  public static Sword ofHEXDRINKER(){//10
    return new Sword (Type.DORAN); //此NEW為CREATOR 新增 (由於FINAL已封裝，而不能給予別人參與。
  }

  // Method
  public Sword.Type getType() {
    return this.type;
  }

  public int getPa() {
    return this.type.getPa();
  }

  // Inner Class
  public static enum Type {
    DORAN(5), HEXDRINKER(10),;

    private int pa;

    private Type(int pa) {
      this.pa = pa;
    }

    public int getPa() {
      return this.pa;
    }
  }
}