// 如果只寫一個T字，T可以是任何TYPE
// ! T can be any type.
// !Generate 的用處
//寫少左CLASS - Less Class (Box <T>) to achieve same purpose.
//Runtime --> Define Generc Type (Strong Type)
  

public class Box<T> {
  private T x;

  public Box() {

  }

  public Box(T x) {
    this.x = x;
  }

  public T getX() {
    return this.x;
  }

  public void setX(T x) {
    this.x = x;
  }

  // ! Generic
  // 1. Less Class (Box<T>) to achieve same purpose (IntegerBox, StringBox)
  // 2. Runtime -> Define Generic Type (Strong Type)

public static void main(String[] args) {
    // ! Runtime
    Box<String> stringBox = new Box<>("hello");
    Box<Integer> integerBox = new Box<>(10);
    Box<Cat> catBox = new Box<>(new Cat("John"));

  }
}

