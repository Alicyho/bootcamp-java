package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
  @Test
  void testCalculator(){
    Account a2 = new Account ();
    Assertions.assertEquals(100.9, a2.sum());
    c1.setX(-5);
    Assertions.assertEquals(3, c1.sum());
    c1.setX(100);
    Assertions.assertEquals(95, c1.sum());
  }

  
}
