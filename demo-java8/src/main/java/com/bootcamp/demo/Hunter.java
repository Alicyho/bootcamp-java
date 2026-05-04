package com.bootcamp.demo;

//! Every Hunter has gun
public class Hunter {
  private Gun gun;
  private boolean isAlive;

  // All args constructor
  // Dependency Injection (設定HUNTER 就要有槍)
  public Hunter (Gun gun){
    if (gun == null)
      throw new IllegalArgumentException("Gun must be ready.");
    this.gun = gun;
    this.isAlive = true;
  } 

  public boolean isAlive(){
    return this.isAlive;
  }
  
  public void Dead(){
   this. isAlive = false; 
  }

  // no add / remove gun

  //無槍子，捕捉的句子
  public void shoot (Hunter hunter){
    try{
      this.gun.shoot();
    } catch (RuntimeException e){
      return;
    }
  }

  public boolean addBullet(){
    return this.gun.addBullet();
  }
  public static void main(String[] args) {
    Hunter h1 = new Hunter (new Gun());
    Hunter h2 = new Hunter (new Gun ());

    h1.addBullet();
    h1.shoot(h2);

    System.out.println(h1.isAlive());//false
    System.out.println(h1);
    
  }
}
