package A_Heroproject;

public class Heros {
  // ! 3 Role/ 5 Level -> pa/pd/ma/md/maxHp/maxMp
  private static int[][] maxHpArr = new int[][] { //
      {100, 200, 300, 400, 500}, // warrior
      {100, 200, 300, 400, 500}, // archor
      {100, 200, 300, 400, 500}, // mage
  };
  // maxHpArr[1]

  private static int[][] ccArr = new int[][] { //
      {5, 10, 15, 20, 25}, // warrior
      {0, 0, 0, 0, 0}, // archor
      {5, 10, 15, 20, 25}, // mage
  };

  private static int[][] paArr = new int[][] { //
      {20, 30, 40, 50, 60}, // warrior
      {20, 30, 40, 50, 60}, // archor
      {20, 30, 40, 50, 60}, // mage
  };

  private static int[][] cdArr = new int[][] { //
      {30, 40, 50, 60, 70}, // warrior
      {30, 40, 50, 60, 70}, // archor
      {30, 40, 50, 60, 70}, // mage
  };

  public static int getCd(Role role, int level) {
    switch (role) {
      case WARRIOR:
        return cdArr[0][level - 1];
      case ARCHER:
        return cdArr[1][level - 1];
      case MAGE:
        return cdArr[2][level - 1];
      default:
        return 0;
    }
  }

  public static int getPa(Role role, int level) {
    switch (role) {
      case WARRIOR:
        return paArr[0][level - 1];
      case ARCHER:
        return paArr[1][level - 1];
      case MAGE:
        return paArr[2][level - 1];
      default:
        return 0;
    }
  }

  public static int getCc(Role role, int level) {
    switch (role) {
      case WARRIOR:
        return ccArr[0][level - 1];
      case ARCHER:
        return ccArr[1][level - 1];
      case MAGE:
        return ccArr[2][level - 1];
      default:
        return 0;
    }
  }

  public static int getMaxHp(Role role, int level) {
    switch (role) {
      case WARRIOR:
        return maxHpArr[0][level - 1];
      case ARCHER:
        return maxHpArr[1][level - 1];
      case MAGE:
        return maxHpArr[2][level - 1];
      default:
        return 0;
    }
  }


}