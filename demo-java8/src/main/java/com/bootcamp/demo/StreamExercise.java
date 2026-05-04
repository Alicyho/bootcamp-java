package com.bootcamp.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.swing.event.SwingPropertyChangeSupport;

public class StreamExercise {
  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16, 4]

    List<Integer> q1 = numbers.stream()
      .filter(n -> n % 2 == 0)//
      .map(n -> n * n)//
      .sorted((i1, i2) -> i1 > i2 ? -1 : 1)  
      .collect(Collectors.toList());
    System.out.println(q1);



    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    
      
       // Output: [Alice, Annie, Alex]

   
  List<String> names = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    List<String> filteredNames = names.stream()
      .filter(name -> name.startsWith("A"))//
      .map(name -> new String(name))
      .collect(Collectors.toList());

      System.out.println(filteredNames);


    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    // Output: Max: 30
    // Output: Min: 5
    
      List<Integer> sortedNumbers2 = numbers2.stream()
        .sorted((e1, e2) -> e1 > e2 ? -1 : 1) // descending order
        .collect(Collectors.toList());

      System.out.println("Sorted: " + sortedNumbers2);
      System.out.println("Min: " + sortedNumbers2.get(0));
      System.out.println("Max: " + sortedNumbers2.get(sortedNumbers2.size() - 1));



    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)

    List<Integer> lengths = words.stream()
        .map(String::length)  // or .map(word -> word.length())
        .collect(Collectors.toList());

      System.out.println(lengths);


    //记忆技巧：
    // :: 就像是一个"做"字
    // String::length = "字符串做 length 方法"
    // Math::abs = "Math 做 abs 方法"
    // System.out::println = "System.out 做 println 方法"



    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    // List<String> words = Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4


    List<String> words3 = Arrays.asList("hi", "hello", "world", "java", "stream");
      List<Integer> lengths = words3.stream()
       Long count = words3.stream()// 
        .filter(w -> w.length()>3 )//
        .count();
        //Output

    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // Output: [15, 20]

    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)

    // Output: {Alice=85, Bob=75}

    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)

    // Output: [John, Jane]

    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)

    // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)

    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)

    // Output: {false=[Alice], true=[Bob, Charlie]} (Map)


    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    // Output: [30, 40, 60]

    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

    // List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    // int defaultAge = 30;
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]

    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    // List<String> words = Arrays.asList("hello", "world", "java");
    // Output: [HELLO, WORLD, JAVA] (Deque)

    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    // List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    // Output: [1, 4, 9, 16]

    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)

    // Output: 22

    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}

    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Output: 55


    //! **18. FlatMap !Important**
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

      List<List<Integer>> listOfIntegers = Arrays.asList( //
          Arrays.asList(1, 2, 3), //
          Arrays.asList(4, 5, 6), //
          Arrays.asList(7, 8, 9) //
      );
      // Output: [6, 7, 8, 9]

 // 方法1：flatMap 展平 + filter 过滤 + collect 收集
      List<Integer> result = listOfIntegers.stream()//Stream<list<integer>>
        .flatMap(list -> list.stream()) //Stream <Integer>
        .filter(num -> num > 5) // Stream<Integer>
        .collect(Collectors.toList());//List<Integer>
      System.out.println(result);//6, 7, 8, 9
    }
  

    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits = 
       Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
       
    // Output: [apple, banana, grape, orange]
      fruits.stream()//
        .distinct()// String.equals
        .sorted() //
        .collect(Collectors.toList());


    // 20. Partitioning By
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and failing
    // groups (pass if score >= 50).
    // Create Student first.
    
    // Create Children Class
    // new Children("Alice", 45)
    // new Children("Bob", 55)
    // new Children("Charlie", 40)
    // new Children("David", 70)
    
    // Output: {false=[Alice, Charlie], true=[Bob, David]}

    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.
    
    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    // Output: "Java, Python, Rust, R, Go"

    //! 22. Find First and Any (important) --> Optional
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);
    
    // Output: 9
    Optional<Integer> firstResult = ages.stream()//
      .filter (a-> a % 3 == 0)//
      .findFirst();

    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.
    
    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [4, 5, 6, 7, 8]
    List<Integer> q23 = elements.stream()//
     .skip (element -> element.getElement () = i = 4: 9)

    

    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.
    
    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]

   

    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.
    
    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
    // Output: Optional[tiger]

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional.empty

    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates
    
    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    // Output: [1, 2, 3, 4, 5, 6] (Set)

    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.
    
    List<String> keywords = Arrays.asList("stream", "filter", "map", "sorted", "collect");
    // Output: 28
  
   // 寫法1：先 concat 再 length (你原來的寫法)
      int concatStringLength = keywords.stream()
        .reduce("", (s1, s2) -> s1.concat(s2))
        .length();
System.out.println("concat 再 length: " + concatStringLength); // 5+6+4 = 15

      // 寫法2：map 成 length 再 reduce 相加 (你想要的寫法)
      int concatStringLength2 = keywords.stream()
        .map(k -> k.length())           // 將每個字串轉成長度 [5, 6, 4]
        .reduce(0, (sum, length) -> sum + length);  // 累加：0+5+6+4 = 15
System.out.println("map + reduce: " + concatStringLength2); // 15
  }
}