package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Calculator {
  private int x;
  private int y;

  
  public int sum(){
    return -1; // placeholder
  }
  public int subtract(){
  return this.x + y;
  
  }
}
