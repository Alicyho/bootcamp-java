package com.bootcamp.demo;

import java.beans.Transient;
import org.junit.jupiter.api.Test;

public class HunterTest {
  @Test
  void testCreateHunter(){
    Hunter h1 = new Hunter(new Gun());
    Assertions.assertEquals(true, h1.isAlive());
  }


  @Test
  void addBullet (){
    //! what are we testing here?
    //1. gun.addBullet () return true, then return true
    //2. gun.lessBullet () return false, the return false
    //Scenario 1. gun.addBullet( )return true, then return true
    Mockito.when(this.gun.addBullet()).thenReturn(true);
    Hunter h1 = new Hunter(this.gun);

    // Test
    Assertions.assertEquals(true, h1.addBullet());

    //Scenario 2. gun.addBullet() return false, then return false
    Mockito.when(this.gun.addBullet()).thenReturn(false);
    Hunter h2 = new Hunter(this.gun);
    Assertions.assertEquals(false, h2.addBullet());
  }

  @Test
  void shoot (){
    Hunter h1 = new Hunter (this.gun);
    Hunter h2 = new Hunter (this.gun2);

    // Scenario 1: No Exception Thrown
    h1.shoot(h2);
    Assertions.assertEquals(false,h2.isAlive());
    Assertions.assertEquals(true,h2.isAlive());

    // Scenario 2: Throw
    Mockito.doThrow(new RuntimeException()).when(this.gun).shoot();
    Hunter h3 = new Hunter(this.gun);
    Hunter h4 = new Hunter (this.gun2); //

    Assertions.assertDoesNotThrows(() -> h3.shoot(h4));
    Assertion.assertTrue(h4.isAlive());

   


  }
}

 //Assertions.assertEquals() 就是 JUnit 用来验证“实际结果是否等于预期结果”的工具。如果不等，测试就会失败，告诉你代码有问题。
 //RuntimeException 是运行时异常，是 Java 中所有不需要在编译时强制处理的异常的父类。