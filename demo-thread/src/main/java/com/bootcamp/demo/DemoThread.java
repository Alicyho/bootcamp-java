package com.bootcamp.demo;

public class DemoThread {
    //relate to file - PrintHellowwordTenTimes.java file

  // ! Single Thread -> main Thread (One Worker)

  // ! Multi Thread -> main Thread -> Many Workers, but work on the same memory space


  public static void main(String[] args) {
    int x = 3;
    x++;
    System.out.println(x); // 4


    // Thread ~= Worker
    // Every thread has its own task

    // A Task
    Runnable task = new PrintHelloworldTenTimes();
    
    Thread worker1 = new Thread(task);

    // ! main Thread -> Start the second thread
    worker1.start(); // task.run() 
    
    Thread worker2 = new Thread(task);

    // ! main Thread -> Start the third thread
    worker2.start(); // task.run()

    // We don't know when worker1 and worker2 come back
    // Worker1 behavior does not depend worker2

    
    // ! main Thread keep going without waiting they come back
    System.out.println("Goodbye"); // main Thread will release the memory in main method
  }
}

    


