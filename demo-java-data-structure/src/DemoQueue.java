import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
//EG 排隊理念，入既時候（即等既時候，開始到你的時候，就在最頭 {

  public static void main(String[] args) {
    // ! With Ordering
    Queue<String> queue = new LinkedList <>(); // !LinkedList or ArrayDeque (How to do)
    queue.add ("Leo");
    queue.add ("Mary");
    queue.add ("Alex");
    System.out.println(queue.peek()); // Leo, look up the head
    System.out.println(queue.remove()); // remove head

    // ! Queue -> while loop -> retrieve data
    System.out.println(queue.size()); // 2

    while (!queue.isEmpty()) {
      String head = queue.poll(); // Remove and get head
      System.out.println(head);
    }

    System.out.println(queue.size()); // 0

    // queue.remove(); // java.util.NoSuchElementException
    queue.poll(); // nothing happen

    List<String> strings = new ArrayList<>();
    List<String> strings2 = new LinkedList<>();
    
   }
}