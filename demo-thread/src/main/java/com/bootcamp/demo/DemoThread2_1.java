package com.bootcamp.demo;

import java.util.concurrent.atomic.AtomicInteger;

// 教 AtomicInteger用法

public class DemoThread2_1 {
  private int x;
  private AtomicInteger y;

  public DemoThread2_1(){
    this.y = new AtomicInteger(0);
  }
  
  public void add (int times){
    for (int i = 0; i<times; i++){
      //!
      //this.x++; // 2 action (read + write), non-atomic
      //this.addOne(); //！Solution1
      this.y.getAndIncrement(); //Solution2
    }
  }
  
  //!lock the method
  public synchronized void addOne (){
    this.x++;
  }

  public int getX(){
      return this.y.get();
      
    }
  public static void main(String[] args) {
    DemoThread2 d = new DemoThread2();

    // Class implement Interface
    // Another Approach

    //one-off 
    Runnable add100Task = new Runnable() { 
      @Override
      public void run(){
        d.add(20000);
      }

    };
//！Thread->
//1.main thread wait for child threads


    Thread thread1 = new Thread (add100Task);
    thread1.start();
    Thread thread2 = new Thread (add100Task);
    thread2.start();    

    //!thread1.join() ->main thread wait from thread1 come back
    //!thread2.join() ->main thread wait from thread2 come back
    try{
    thread1.join(); // throw checked exception
    thread2.join();

    }catch (InterruptedException e){
      
    }

  System.out.println(d.getX());
}

}
