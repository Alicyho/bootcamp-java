package com.bootcamp.demo;

//Java 16
//1. All args constructor (No empty Constructor)
//2. Attributes
//3. getter (No Setter)
//4. toString
//5. equals and hashCode

public class DemoRecord{

public static void main(String[] args) {
        Transaction t1 = new Transaction("FUND_TRAN", 100);
        
        System.out.println(t1.type());    // 输出: FUND_TRAN
        System.out.println(t1.amount());  // 输出: 100
        
        Transaction t2 = new Transaction("FUND_TRAN", 100);
  
  System.out.println(t1.equals(t2));//true
  System.out.println(t2.hashCode()==t2.hashCode());
  System.out.println(t1);
  
  }
}

