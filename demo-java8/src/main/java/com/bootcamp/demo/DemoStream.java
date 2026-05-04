package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import com.bootcamp.demo.DemoStream.Person.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;

public class DemoStream {

// 只有LIST才可以STREAM


  public static void main(String[] args) {
    // Loop
    // 1. for-loop
    List<String> names = new ArrayList<>(List.of("John", "Peter"));
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

  
  // 2. for-each loop (Common)
    for (String name : names) {
      System.out.println(name);
    }

 //3. while loop

   int idx = 0;
    while (idx < names.size()) {
      System.out.println(names.get(idx));
      idx++;



   // ! 4. stream (Java 8)
    names.stream() // Stream<String>
        .forEach(name -> System.out.println(name));

    // ! for loop + if (有IF的意思)
    // filter -> if
    names.stream() //
        .filter(name -> name.length() >= 5) //
        .forEach(name -> System.out.println(name)); // send sms

    //collect
    List<String> newNames = names.stream() //
        .filter(name -> name.startsWith("P") && name.length() >= 5) //
        .collect(Collectors.toList());
    System.out.println(newNames); // [Peter]

    //map (換轉型態 時候用 MAP)
    List<Cat> cats = names.stream() //
        .filter(name -> name.startsWith("J")) // Stream<String>
        .map(name -> new Cat(name)) // Stream<Cat>
        .collect(Collectors.toList()); // List<Cat>

      System.out.println(cats);

   //normal to While Loop

    List<Cat> newCats = new ArrayList<>();
    for (String name : names) {
      if (name.startsWith("J")) {
        newCats.add(new Cat(name));
      }
     }
    System.out.println(newCats);

// dogs = 4 Dog Objects
    List<Dog> dogs = new LinkedList<>(List.of(new Dog(10, "Steve"),
        new Dog(4, "Sally"), new Dog(20, "Tommy"), new Dog(8, "Mary"), new Dog(20, "Tommy") ));

    List<Integer> dogAges = dogs.stream() //
        .map(dog -> dog.getAge()) // Stream<Integer>
        .collect(Collectors.toList()); // List<Integer>
    System.out.println(dogAges); // [10, 4, 20, 8, 20]
  }

    //sorting
    //descending order of age
    List<Dog> sortedDogs = dogs.stream() //
        .sorted((d1, d2) -> d1.getAge() > d2.getAge() ? -1 : 1) //
        .collect(Collectors.toList());
    System.out.println(sortedDogs);
    // [Dog(age=20, name=Tommy), Dog(age=20, name=Tommy), Dog(age=10, name=Steve), Dog(age=8, name=Mary), Dog(age=4, name=Sally)]


  List<Dog> sortedDogAge = dogs.stream() //
        // .map(dog -> dog.getAge())
        .sorted() // ! compareTo
        .collect(Collectors.toList());
    System.out.println(sortedDogAge);
    // [Dog(age=4, name=Sally), Dog(age=8, name=Mary), Dog(age=10, name=Steve), Dog(age=20, name=Tommy), Dog(age=20, name=Tommy)]

    // distinct (unique)
    // distinct dogs

         //distinct(unique)
      //distinct dogs 不會改變形態
    List<String> uniqueDogNames = dogs.stream() //
        .filter(dog -> dog.getAge() >= 10) //
        .distinct() //
        .sorted() //
        .map(dog -> dog.getName()) //
        .collect(Collectors.toList());

    System.out.println(uniqueDogNames); // [Steve, Tommy]

    //Flatmap -- 作用 EG多數人的ADDRESS ，如不同人有多個地址，一次過取得
    //所有的ADDRESS 抽起，合併
    //



  // flatmap
    List<Address> addresses = new ArrayList<>(List.of(new Address("address 1"),
        new Address("address 2"), new Address("address 3")));
    Person p1 = new Person(addresses);

    List<Address> addresses2 = new ArrayList<>(
        List.of(new Address("address 4"), new Address("address 5")));
    Person p2 = new Person(addresses2);

    List<Person> persons = new ArrayList<>(List.of(p1, p2));
    List<String> allAddressLines = persons.stream() //
        .flatMap(p -> p.getAddresses().stream()) // Stream<Address>
        .map(a -> a.getLine()) // Stream<String>
        .collect(Collectors.toList());
    System.out.println(allAddressLines);
    // [address 1, address 2, address 3, address 4, address 5]
  }

    // Stream<String>
    Stream<String> names2 = Stream.Of("John", "Peter");
    
    Stream<String> names2AfterFiltered = name2.filter(e -> e.length() >= 5);

    List<String> finalNames = name2AfterFiltered.collect(Colle tors.toList());
    System.out.println(finalNames);

    @AllArgsConstructor
    @Getter
    @ToString
    public static class Person {
    private List<Address> addresses;

    @AllArgsConstructor
    @Getter
    @ToString
    public static class Address {
      private String line;
    }
  }
}