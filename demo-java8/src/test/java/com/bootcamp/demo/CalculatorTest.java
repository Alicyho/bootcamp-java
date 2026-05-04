package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Maven (Java) + Gradle (Java, React)

// ! Write Test Case before main code (TDD - Test Driven Design)
public class CalculatorTest {
  @Test
  void testCalculator() {
    Calculator c1 = new Calculator(7, 8);
    Assertions.assertEquals(15, c1.sum()); // 8+ 7
    c1.setX(-5);
    Assertions.assertEquals(3, c1.sum()); // -5 + 8
    c1.setY(100);
    Assertions.assertEquals(95, c1.sum()); // -5 + 100
  }
}