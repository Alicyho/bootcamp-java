import java.util.Comparator;

public class SortByAgeDesc implements Comparator<Person> {
  // Compare p1 and p2
  // -1 -> return p1
  // 1 -> return p2
  @Override
  public int compare(Person p1, Person p2) {
    if (p1.getAge() > p2.getAge()) {
      return -1;
    } else {
      return 1;
    }
  }
}