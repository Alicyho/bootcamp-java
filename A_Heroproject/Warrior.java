package A_Heroproject;
public class Warrior extends Hero {
  
  public Warrior(String name) {
    super(name);
    int maxHp = Heros.getMaxHp(Role.WARRIOR, super.getLevel());
    super.setHp(maxHp);
  }

  // attack() -> 
  @Override
  public void attack(Hero target) {
    int toBeDeducted = this.getPa();
    target.deductHp(toBeDeducted);
    // if target hp <= 0, exp + 5
    if (!target.isAlive()) {
      super.addExp(5);
      if (super.getExp() >= 10) {
        this.levelUp();
      }
    }
  }

  // deductHp
  @Override
  public void deductHp(int toBeDeducted) {
    if (toBeDeducted > super.getHp()) {
      super.setHp(0);
    } else {
      super.setHp(super.getHp() - toBeDeducted);
    }
  }

  @Override
  public int getPa() {
    double cc = Heros.getCc(Role.WARRIOR, super.getLevel()) / 100.0;
    boolean isCD = Math.random() < cc; // 0 - 1
    // new Random().nextInt(49); // 0-48
    int basePa = Heros.getPa(Role.WARRIOR, super.getLevel());
    boolean isWithWeapon = super.getWeapon() != null;
    int cd = 0;
    if (isCD) {
      cd = Heros.getCd(Role.WARRIOR, super.getLevel());
    }
    int weaponPa = 0;
    if (isWithWeapon) {
      // weaponPa = Weapons.getPa(Role.WARRIOR, super.getLevel());
      weaponPa = this.getWeapon().getPa();
    }
    return basePa + weaponPa + cd;
  }

  // ! Role/Level -> cc, cd
  // @Override
  public void levelUp() {
    super.levelUp();
    int maxHp = Heros.getMaxHp(Role.WARRIOR, super.getLevel());
    super.setHp(maxHp);
  }

}