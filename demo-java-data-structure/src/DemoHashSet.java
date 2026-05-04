import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("Sally");
    strings.add("Leo");
    System.out.println(strings.add("Jason")); // true
    strings.add("Alex");
    System.out.println(strings); // [Alex, Sally, Leo, Jason]

    System.out.println(strings.add("Jason")); // false
    System.out.println(strings); // [Alex, Sally, Leo, Jason]

    System.out.println(strings.contains("Alex")); // true

    // equals
    HashSet<Cat> cats = new HashSet<>();
    cats.add(new Cat("Cathy"));
    cats.add(new Cat("Oscar"));
    cats.add(new Cat("Ben"));
    
    // No Ordering
    for (Cat cat : cats) {
      System.out.println(cat.getName());
    }

    // ! equals + hashCode
    System.out.println(cats.contains(new Cat("Oscar"))); // true

    cats.remove(new Cat("Cathy"));
    System.out.println(cats.size()); // 2
    // HashSet cannot remove by index

    // ! ArrayList vs HashSet
    // 1. HashSet has NO ordering
    // 2. Avoid Duplicated
    // 3. HashSet use equals() + hashCode()

  }
}