public class String1 {
  private char[] chs; // "hello" -> chs

  // ...
  public String1() {
    this.chs = new char[0];
  }

  public String1(String value) {
    this.chs = new char[value.length()];
    int idx = 0;
    for (int i = 0; i < value.length(); i++) {
      this.chs[idx] = value.charAt(i);
      idx++;
    }
  }

  public int length() {
    return this.chs.length;
  }

  public char charAt(int index) {
    return this.chs[index];
  }

  // ! create and return new object
  public String replace2(char from, char to) {
    String afterReplace = "";
    for (int i = 0; i < this.chs.length; i++) {
      if (chs[i] != from) {
        afterReplace += chs[i];
      } else {
        afterReplace += to;
      }
    }
    // char array -> String (for loop)
    // return String.valueOf(this.chs);
    return afterReplace;
  }

  // ! Revise original object itself
  public String replace1(char from, char to) {
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] == from) {
        this.chs[i] = to;
      }
    }
    // char array -> String (for loop)
    return String.valueOf(this.chs);
  }

  public int indexOf(char target) {
    int idx = -1;
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] == target) {
        idx = i;
        break;
      }
    }
    return idx;
  }

  public String toString() {
    return String.valueOf(this.chs);
  }

  public static void main(String[] args) {
    String1 str = new String1("hello");

    System.out.println(str.length()); // 5
    System.out.println(str.charAt(0)); // h

    // replace('l', 'x')
    System.out.println(str.replace2('l', 'x')); // hexxo
    System.out.println(str); // hello

    // indexOf('l')
    System.out.println(str.indexOf('o')); // 4

    String s = "hello";
    System.out.println(s.replace('l', 'x')); // hexxo
    System.err.println(s); // hello


    String1 s1 = new String1();
    System.out.println(s1.length()); // 0

    // contains("ll")
    // startsWith('h')
  }
}