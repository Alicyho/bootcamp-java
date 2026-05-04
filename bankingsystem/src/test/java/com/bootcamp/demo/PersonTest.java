package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; 


public class PersonTest {

  @Test
  void testPerson(){

         Person p1 = new Person("John", "Chan", 123145);
        
        Assertions.assertEquals("John", p1.getFirstName());
        Assertions.assertEquals("Chan", p1.getLastName());
        Assertions.assertEquals(123145, p1.getIdNumber());

  }
}