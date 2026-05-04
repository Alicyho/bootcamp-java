package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder // ! Builder Pattern
public class Person2 {
  private String name;
  private int age;

  public static void main(String[] args) {
    Person p1 = Person.builder() //
        .name("John") //
        .age(20) //
        .build();
    System.out.println(p1.getAge());
    System.out.println(p1.getName());
  }
}
  
  


