package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; 

public class CompanyTest {
  
  @Test
	void testCompany(){

    Company c1 = new Company ("ABC Company", 123456);


    Assertions.assertEquals("ABC Company", c1.getCompanyName());
    Assertions.assertEquals(1231456, c1.getTaxId());

  }
}