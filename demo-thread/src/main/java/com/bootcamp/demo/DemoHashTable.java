package com.bootcamp.demo;

import java.util.Hashtable;
import java.util.Map;

// HashMap 一齊做THREAD 會同時入去，變左ENTRY AND SIZE會亂，所以無法GEN 出正常數據
// ! Thread-safe version of HashMap
public class DemoHashTable {
  private Map<String, String> map;// 改成 Integer 类型


   public DemoHashTable() {
    // this.map = new HashMap<>(); // ! NON Thread-safe
    this.map = new Hashtable<>(); // ! Thread-safe
  }

  public void put(int times, String value) {
    for (int i = 0 ; i < times; i++) {
      this.map.put(String.valueOf(i), value);
    }
  }

  public void put(String key, String value) {
    this.map.put(value, value);
  }

  public int size() {
    return this.map.size();
  }

  public Map<String, String> getmap() {
    return this.map;
  }

  public static void main(String[] args) {
    DemoHashTable d = new DemoHashTable();

    Runnable put100ABC = new Runnable() {
      @Override
      public void run() {
        d.put(100, "ABC");
      }
    };

    Runnable put100DEF = new Runnable() {
      @Override
      public void run() {
        d.put(100, "DEF");
      }
    };

    // ! Thread ->
    // 1. main thread wait for child threads

    Thread thread1 = new Thread(put100ABC);
    thread1.start();

    Thread thread2 = new Thread(put100DEF);
    thread2.start();

    // ! thread1.join() -> main thread stay here and wait for thread1 come back
    // ! thread2.join() -> main thread stay here and wait for thread2 come back
    try {
      thread1.join(); // throw checked exception
      thread2.join(); // throw checked exception
    } catch (InterruptedException e) {

    }
    System.out.println(d.size()); // 1xx

    for (Map.Entry<String, String> entry : d.getmap().entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}