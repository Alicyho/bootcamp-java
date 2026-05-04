package com.bootcamp.demo;

import java.util.Objects;

// ! Code Pattern (Builder Pattern)
// Advantage: No longer use constructor to create object
public class Person {
  private String name;
  private int age;

  // ! Builder Object call Person Constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static Builder builder() {
    return new Builder();
  }

  // set get
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  // equals
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Person))
      return false;
    Person person = (Person) o;
    return Objects.equals(person.getName(), this.name)
        && Objects.equals(person.getAge(), this.age);
  }

  // hashCode
  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }

  // toString
  @Override
  public String toString() {
    return "Person(" //
        + "name=" + this.name //
        + "age=" + this.age //
        + ")";
  }

  public static class Builder {
    private String name;
    private int age;

    // setter
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Person build() {
      return new Person(this.name, this.age);
    }
  }

  public static void main(String[] args) {
    Person p1 = new Person("John", 20);

    Person p2 = Person.builder() // return Builder Object
      .name("John") // return Builder Object
      .age(20) // return Builder Object
      .build(); // create Person Object
    
    System.out.println(p2.getName()); // John
    System.out.println(p2.getAge()); // 20
  }
}