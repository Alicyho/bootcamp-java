package com.bootcamp.demo;

public class DemoSwitchExpression {
  public static enum Color {
    RED, BLUE, BLACK
  }

  public static void main(String[] args) {
    //Java 14 (Lambda -> Switch)

    Color color = Color.Blue;

    // switch. 
    switch (color){
      case RED:
      System.out.println("It is red");
      break;
    case BLUE:
      System.out.println("It is blue");
      break;
    case BLACK:
      System.out.println("It is black");
      break;
    default
      System.out.println("Default");
      break;
    }

    // Switch Expression
    switch (color){
      
      case RED -> System.out.println("It is red");
      case BLUE -> System.out.println("It is blue");
      case BLACK -> System.out.println("It is black");
    }
  }
  // with return version
  // 如果遺漏，佢會提供指示 （如紅線）
  // 只適合單ELSE，
  // 數量有例
  // 只有OR 的意味，但沒有AND的意味
  //can check all possible values in enum has been written down, otherwise it may iccur syntax error)
  }


