import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
  public static void main(String[] args) {
    // Background: Array
    String[] arr = new String[3];
    arr[0] = "abc";
    arr[1] = "def";
    arr[2] = "ijk";

    // what if i need one more space to store "qwe"
    String[] arr2 = new String[4];
    for (int i = 0; i < arr.length; i++) {
      arr2[i] = arr[i];
    }
    arr2[arr2.length - 1] = "qwe";
    arr = arr2;
    System.out.println(Arrays.toString(arr)); // [abc, def, ijk, qwe]

    // Solution (Java 1.5):
    // ArrayList -> Functionality
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("abc");
    strings.add("def");
    strings.add("ijk");
    strings.add("qwe");
    System.out.println(strings.size()); // 4
    System.out.println(strings.contains("def")); // true (loop)

    strings.set(1, "leo"); // String[] arr, arr[1] = "leo"
    System.out.println(strings); // [abc, leo, ijk, qwe]

    System.out.println(strings.getFirst()); // abc
    System.out.println(strings.getLast()); // qwe
    System.out.println(strings.isEmpty()); // false (length <= 0)
    
    // equals
    ArrayList<Integer> integers1 = new ArrayList<>();
    integers1.add(100);
    integers1.add(99);

    ArrayList<Integer> integers2 = new ArrayList<>();
    integers2.add(100);
    integers2.add(99);

    // ArrayList @Override equals
    System.out.println(integers1.equals(integers2)); // true
    System.out.println(integers1 == integers2); // false

    System.out.println(integers1.hashCode()); // 4160
    System.out.println(integers2.hashCode()); // 4160

    Integer removedItem = integers1.remove(1); // remove the 2nd item
    System.out.println(removedItem); // 99

    boolean isRemoved = strings.remove("ijk");
    System.out.println(isRemoved); // true

    System.out.println(strings.remove("java")); // false
    
    ArrayList<String> languages = new ArrayList<>();
    languages.add("java");
    languages.add("python");

    strings.addAll(languages); // 
    System.out.println(strings); // [abc, leo, qwe, java, python]

    System.out.println(strings.get(3)); // java

    // Cat, Dog, Animal
    ArrayList<Cat> cats = new ArrayList<>();
    Cat john = new Cat("John");
    cats.add(john);
    cats.add(new Cat("Mary"));
    System.out.println(cats.size()); // 2
    
    // John
    // ! contains -> loop -> cat.equals(cat) -> Object.equals
    System.out.println(cats.contains(new Cat("John"))); // true

    System.out.println(cats.size()); // 2
    cats.remove(new Cat("John"));
    System.out.println(cats.size()); // 1

    // char[]
    ArrayList<Character> chs = new ArrayList<>();
    chs.add('a');
    chs.add('t');
    System.out.println(chs.contains(new Character('a'))); // true

    // for-loop (array, algorithm)
    // for-each
    for (Character ch : chs) {
      System.out.println(ch);
    }

    // loop cats -> print name
    for (Cat a : cats) {
      System.out.println(a.getName());

   
    //HashSet cannot remove by index （因為HASHSET不是ARRAY構成）

    // ! ArrayList -> Encapsulate Array
    // ArrayList vs Array
    // 1. Array is fixed length, ArrayList is dynamic length
    // 2. ArrayList & Array: get by index
    // 3. ArrayList (dynamic add item), Array (have a new array)
    // 4. Primitive (Array), Class (ArrayList, Array)
    //5. 一定要寫HASHCODE。- HashSet use equals () + HashCode ()
  }
}
}