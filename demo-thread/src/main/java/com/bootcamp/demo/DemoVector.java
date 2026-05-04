package com.bootcamp.demo;

import java.util.List;
import java.util.Vector;

public class DemoVector {
      // !Java provide native data structure for array list (synchronized)
    // !Thread-safe (VECTOR, 因為VECTOR 設定上鎖，每次只給予一個進入, Stack HashTable)
    // !Non Thread-safe (ArrayList, LinkedList, HashMap, HashSet, etc)
  // ! Java provide native data structure for array list (synchronized)
  // ! Thread-safe (Vector, Stack (pop + push), HashTable)
  // ! Non Thread-safe (ArrayList, LinkedList, HashMap, HashSet, etc)
  private List<String> values; // add()

  public DemoVector() {
    this.values = new Vector<>();
  }

  public void add(int times) {
    for (int i = 0; i < times; i++) {
      this.values.add("abc"); // ! native synchronized
    }
  }

  public int size() {
    return this.values.size();
  }

  public static void main(String[] args) {
    DemoVector d = new DemoVector();
    // Vector -> synchronized version of ArrayList
    
    Runnable addStrings = new Runnable() {
      @Override
      public void run() {
        d.add(1000);
      }
    };
    // 2 Threads
    Thread thread1 = new Thread(addStrings); // x++
    thread1.start();

    Thread thread2 = new Thread(addStrings); // y++
    thread2.start();

    // ! thread1.join() -> main thread stay here and wait for thread1 come back
    // ! thread2.join() -> main thread stay here and wait for thread2 come back
    try {
      thread1.join(); // throw checked exception
      thread2.join(); // throw checked exception
    } catch (InterruptedException e) {

    }
    System.out.println(d.size()); // 2000
  }
}