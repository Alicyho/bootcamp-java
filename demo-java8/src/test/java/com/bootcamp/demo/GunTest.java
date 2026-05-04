package com.bootcamp.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class GunTest {
  
  @Test
  void testCreateGun(){
    Gun g1 = new Gun ();
    Assertion.assertEqual(0, g1.getBullet());
  }
    
  @Test




  
  void test AddBullet(){
    Gun g1 = new Gun ();
    Assertions.assertTrue(g1.addBullet());
    Assertions.assertEqual(1,g1.getBullet());

    Gun g2 = new Gun ();
    Assertions.assertTrue(g2.addBullet());
    Assertions.assertTrue(g2.addBullet());
    Assertions.assertTrue(g2.addBullet());
    Assertions.assertTrue(g2.addBullet());
    Assertions.assertTrue(g2.addBullet());
    Assertions.assertTrue(g2.addBullet());
    Assertions.assertFalse(g2.addBullet());
    Assertions.assertTrue(6, g2.addBullet());

  }

  @Test
      void testShoot(){
        Gun g1 = new Gun();
        Assertions.assertThrows(RuntimeException.class)

        Gun g2 = new Gun ();
        g2.addBullet();
        g2.shoot();
        Assertions.assertEquals(0,g1.getBullet());
  }


}
