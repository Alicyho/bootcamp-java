package com.bootcamp.demo;

public class Gun {
  private int bullet;

  public Gun (){
    this.bullet = 0;
  }

  public boolean addBullet(){
    if(this.bullet >=6)
      return false;
    this.bullet++;
      return true;
  }

  public void shoot (){
    if(this.bullet <= 0)
      throw new RuntimeException("bullet <= 0.")
    this.bullet--;
  }

  public int getBullet(){
    return this.bullet;
  }
}
