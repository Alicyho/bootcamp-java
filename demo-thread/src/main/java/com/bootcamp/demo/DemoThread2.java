package com.bootcamp.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread2 {
  private int x;
  private AtomicInteger y;

  public DemoThread2() {
    this.y = new AtomicInteger(0);
  }

  public void add(int times) {
    for (int i = 0; i < times; i++) {
      // !
      // this.x++; // 2 actions (read + write), non-atomic
      // this.addOne(); // ! Solution 1
      this.y.getAndIncrement(); // ! Solution 2
    }
  }

  // ! lock the method
  public synchronized void addOne() {
    this.x++;
  }

  public int getX() {
    // return this.x;
    return this.y.get(); // ! Solution 2
  }

  public static void main(String[] args) {
    DemoThread2 d = new DemoThread2();

    // Class implement Interface
    // Another Approach

    // ! one-off usage
    Runnable add100Task = new Runnable() {
      @Override
      public void run() {
        d.add(200000);
      }
    };

    // ! Thread -> 
    // 1. main thread wait for child threads

    Thread thread1 = new Thread(add100Task); // x++
    thread1.start();
    
    Thread thread2 = new Thread(add100Task); // y++
    thread2.start();

    // ! thread1.join() -> main thread stay here and wait for thread1 come back
    // ! thread2.join() -> main thread stay here and wait for thread2 come back
    try {
      thread1.join(); // throw checked exception
      thread2.join(); // throw checked exception
    } catch (InterruptedException e) {

    }
    // main Thread
    System.out.println(d.getX()); // ~225736 (but not 400_000)
  }
}