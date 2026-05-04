package com.bootcamp.demo;

import java.util.Stack;

public class DemoStack {
  // Homework: Stack (synchronized, simliar to Deque + LinkedList pop/push)
  public static void main(String[] args) {
    // Deque + LinkedList

    Stack<String> values = new Stack<>();
    values.push("John"); // synchronized
    values.push("Mary"); // synchronized
    values.push("Peter"); // synchronized

    System.out.println(values.pop()); // Peter
    System.out.println(values.pop()); // Mary
    System.out.println(values.pop()); // John

    // LinkedList/ ArrayDeque (Queue / Deque) -> non Thread-Safe
    // ! (Queue/ Deque) -> Thread-Safe -> ???
    // Self Learning: BlockDeque, ConcurrentHashMap
  }
}