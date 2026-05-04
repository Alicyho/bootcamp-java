public class Tiger {
  private Color color;

  // Constructor
  public Tiger (Color color) {
    this.color = color;
  }
  // get set
  public Color getColor() {
    return this.color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public static void main(String[] args) {
    Tiger t1 = new Tiger(Color.RED);

    if (t1.getColor() == Color.RED) {

    }

    // new Color()

  }
}