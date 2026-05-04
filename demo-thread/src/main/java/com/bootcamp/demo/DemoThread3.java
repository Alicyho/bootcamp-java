package com.bootcamp.demo;

import java.util.ArrayList;

public class DemoThread3 {
  private ArrayList<String> values; // add()

  public DemoThread3() {
    this.values = new ArrayList<>();
  }

  public void add(int times) {
    for (int i = 0; i < times; i++) {
      this.add("abc");
    }
  }

  // ! Solution
  public synchronized boolean add(String value) {// to key to lock "synchronized"
    return this.values.add(value);
  }

  public int size() {
    return this.values.size();
  }

  public static void main(String[] args) {
    DemoThread3 d = new DemoThread3();

    // Task -> add 1000 Strings into arraylist
    Runnable addStrings = new Runnable() {
      @Override
      public void run() {
        d.add(20);
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
    // 2000 strings finally
    System.out.println(d.size()); // 2000
  }
}