import java.util.PriorityQueue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    // formula (age >= 70) -> Sorting
    PriorityQueue<Person> persons = new PriorityQueue<>();

    // Sorting -> when happen? add() or poll()

    persons.add(new Person(50));
    persons.add(new Person(25));
    persons.add(new Person(15));
    persons.add(new Person(30));
    for (Person p : persons) {
      System.out.println("Age=" + p.getAge());
    }

    System.out.println(persons.poll().getAge()); // 50
    persons.add(new Person(70));
    System.out.println(persons.poll().getAge()); // 70
    persons.add(new Person(65));
    System.out.println(persons.poll().getAge()); // 65

    System.out.println(persons.size()); // 3
    System.out.println(persons.poll().getAge()); // 30
    
    // ! Comparator
    PriorityQueue<Person> dq2 = new PriorityQueue<>(new SortByAgeDesc());
    dq2.add(new Person(70));
    dq2.add(new Person(90));
    dq2.add(new Person(30));
    dq2.add(new Person(80));
    System.out.println(dq2.poll().getAge()); // 90
    System.out.println(dq2.poll().getAge()); // 80
    System.out.println(dq2.poll().getAge()); // 70
    System.out.println(dq2.poll().getAge()); // 30

    
  }
}