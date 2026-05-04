// ! Immutable
public enum Direction {
  EAST(1, "East."), SOUTH(2, "South."), WEST(-1, "West."), NORTH(-2, "North."),;

  // attribute
  private int value;
  private String desc;

  // Private Constructor
  private Direction(int value, String desc) {
    this.value = value;
    this.desc = desc;
  }

  // ! 99.99% , we won't use set method in enum.
  public void setValue(int value) {
    this.value = value;
  }


    // Presentation
  // Direction.NORTH.oppsite() -> SOUTH
  public Direction oppsite() {
    for (Direction d : Direction.values()) {// 這方法只在ENUM出現
      if (this.value * -1 == d.getValue()) {
        return d;
      }
    }
    return null;
    }


  public int getValue() {
    return this.value;
  }

  public String getDesc() {
    return this.desc;
  }

  public static void main(String[] args) {
    Direction d1 = Direction.SOUTH;
    System.out.println(d1.getValue()); // 2

    System.out.println(Direction.SOUTH.getValue()); // 2
    System.out.println(Direction.SOUTH.getDesc()); // South.

    // ! For-each loop
    for (Direction d : Direction.values())  { //右邊RETURN DIRECTION的ARRAY，左邊SHOW 番每一個DIRECTION)
      System.out.println(d.getDesc());
    }

    System.out.println(Direction.NORTH.oppsite()); // SOUTH

    // ! Other examples (for-each)
    int[] arr = new int[] {4, 9, -5};
    for (int i = 0; i < arr.length; i++) { // flexible to control iteration
      System.out.println(arr[i]);
    }
    for (int x : arr) { // Loop through all elements
      System.out.println(x);
    }

    Direction.EAST.setValue(100);
    System.out.println(Direction.EAST.getValue()); // 100
    
  }
}

