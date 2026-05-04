package com.bootcamp.demo;

import java.sql.SQLException;

public class DemoOOP {
  public static void main(String[] args) {
    StudentHelper sh = new StudentHelper(Database.MYSQL, "bootcamp_2603", "root", "admin1234");
    // StudentHelper sh = new StudentHelper(Database.POSTGRESQL, "bootcamp_2603", "postgres", "admin1234");
    try {
      sh.insert("Alice", "alice@gmail.com");
      sh.insert("Peter", "peter@gmail.com");  
    } catch (SQLException e) {
      System.out.println("insert error: " + e.getMessage());
    }
  }
}