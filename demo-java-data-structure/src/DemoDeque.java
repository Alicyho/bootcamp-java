import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {

  public static void main(String[] args) {
    
 Deque<String> dq = new ArrayDeque<>(); // ! LinkedList or ArrayDeque (how to do)
    // Queue vs Deque
    // 1. Queue (add Last and poll first)
    // 2. Deque (add Last/First and poll First/Last)
    dq.addLast("Leo");
    dq.addFirst("Peter");
    System.out.println(dq.pollLast()); // Leo
    dq.addLast("Ellen");
    dq.addFirst("Steve");
    System.out.println(dq.pollFirst()); // Steve

    System.out.println(dq.contains("Peter")); // true
    System.out.println(dq.peekFirst()); // Peter
    System.out.println(dq.peekLast()); // Ellen


    // removeFirst, removeLast -> error
    while (dq.size() >= 2) {
      System.out.println(dq.pollFirst());
      System.out.println(dq.pollLast());
    }

    //removeFirst, removeLast
    
    //Queue: add + poll
    //Deque: add + poll or pop + push

    // another usage -pop + push (杯)
    dq.push("Kelly");
    dq.push ("Oscar");
    dq.push ("Jenny");
    System.out.println(dq);
    System.out.println(dq.pop()); // Jenny (first round, generate)
    System.out.println(dq.pop()); // Oscar (second round)
    System.out.println(dq.pop()); // Jenny (third round)
    
    // Queue -- 一個方向的水流
    //！LinkeList （Queue vs Deque)
   Queue<Integer> queue1 = new LinkedList<>();
    queue1.add(10);
    queue1.poll();
    // queue1.pop();
    // queue1.push(200);

// DEQUE -- 有齊所有功能
    Deque<Integer> queue2 = new LinkedList<>();
    queue2.addFirst(10);
    queue2.addLast(20);
    queue2.pollLast();
    queue2.pollFirst();

    queue2.push(100);
    queue2.pop();
  }
  
}
