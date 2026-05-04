package com.bootcamp.demo;

import java.lang.module.ModuleDescriptor.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter


public class DemoNestedClass {
  private static final String NAME = "Jenny";

  //Inner Class, static nested Class
private int x;

// !Inner Class
@AllArgsConstructor
@Getter
  public class Ball {
    private int z;

    public int getValue(){
      return this.z + x; // inner class CAN acces the outer class data.
    }
  }


  //! Static nested Class
  @AllArgsConstructor
  @Getter
  public static class NestedClass {
  
    private int y;

    public int getVlaue (){
      //return this.y + x; //! Static nested class CANNOT access the outer class data.
      System.out.println(DemoNestedClass.NAME);
      return this.y;
    }
    
  }
  

   public static void main(String[] args) {
    NestedClass nc = new NestedClass(10);
 
  // ! Create inner class object
  Ball b1 = new DemoNestedClass(20).new Ball(10);
  System.out.println(b1.getValue());

  DemoNestedClass nc2 = new DemoNestedClass (30);
  Ball b2 = nc2.new Ball(100);
}
  
}
