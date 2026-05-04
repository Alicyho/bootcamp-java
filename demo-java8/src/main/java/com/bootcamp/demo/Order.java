package com.bootcamp.demo;

package demo

import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

public class Order {
  

  public cleass Order{
    private List <Item> items;

    public Order (){
      this.items = new LinkedList<>();
    }

    public boolean add(Item item){
      return this.items.add(item);
    }

    @Getter
    @AllArgsConstructor
    public static class Item{
      private double price;
      private int quantity;
    }
  }
}
