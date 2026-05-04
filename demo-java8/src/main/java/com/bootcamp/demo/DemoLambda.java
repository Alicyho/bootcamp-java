package com.bootcamp.demo;

package com.bootcamp.demo;

import java.math.BigDecimal;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


@FunctionalInterface
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}

@FunctionalInterface
interface MathOperation<T, U, R> {
    R compute(T t, U u);
}

// Flyable 接口（如果你还没定义）
@FunctionalInterface
interface Flyable {
    void fly();
}

// Severless
// AWS Lambda(upload jar) -> run Java Application
// Java Lambda
// 不用CLASS的方法
public class DemoLambda {
  public static void main(String[] args) {
    //Function (y=f(x))
    //One Input -> One Output

    //Integer method (String s)
    //this is Lambda writing structure, it is using for "One abstract method only", Functional Interface <- Lambda Pattern
    //! stringLengthFunction is local variable
    Function<String, Integer> stringLengthFunction = s -> s.length(); //意思return s.length. Similar to JavaScript
    //按照以上的資料 s -> 一個參數就寫上
    System.out.println(stringLengthFunction.apply ("hello")); //5
    System.out.println(stringLengthFunction.apply ("Java")); //4
  
    // 沒有Superman Clas，仍可以printout Superman
  Flyable superman = () -> System.out.println("Superman is flying...");
    superman.fly();

    //() 沒有參數（即沒有SUPERMEN參數），可以只寫（）





    /// BiFunction
    // 2 Input -> 1 output
    BiFunction<String, String, Integer> stringLengthFunction2 =
        (s1, s2) -> s1.length() + s2.length();
    System.out.println(stringLengthFunction2.apply("Python", "Java")); // 10
    //（s1, s2) 是兩個參數，所以一定要寫上參數

    //!Custom Functional Interface
     TriFunction<Integer, Integer, Integer, Integer> sumIntegerFormula =
        (i1, i2, i3) -> i1 + i2 + i3;
    System.out.println(sumIntegerFormula.apply(10, 20, 30)); // 60  ← 注意这里加了分号

    //Predicate. (做Testing 時候比較合適)
    //One input Boolean
   // Testing
    int age = 67;
    Predicate<Integer> isElderlyFunction = a -> a > 65;
    System.out.println(isElderlyFunction.test(age)); // true
    System.out.println(isElderlyFunction.test(64)); // false

  }

    // BiPredicate
    BiPredicate<String, String> equalsFunction =
        (s1, s2) -> s1 != null && s1.equals(s2);

    
    System.out.println(equalsFunction.test("Hello", "Hello")); // true
    System.out.println(equalsFunction.test("Hello", "hello")); // false
    System.out.println(equalsFunction.test(null, "hello")); // false

    //Supplier (no input -> one output)
   Supplier<Integer> randomMarksixFunction =
        () -> new Random().nextInt(49) + 1; // 1-49
    System.out.println(randomMarksixFunction.get());
    System.out.println(randomMarksixFunction.get());

    // Consumer (One input -> void)
    Consumer<String> printString = s -> System.out.println(s);
    printString.accept("hello");

        // ! Same as Function<String, String>
    UnaryOperator<String> upperString = s -> s.toUpperCase();
    System.out.println(upperString.apply("Hello")); // HELLO



    //More than 1 line ->{} 大概號使用，因為要解釋兩個情況，多於一句，（1）s1 等於null , (2) return s1 concat s2
    BinaryOperator<String> concatString = (s1, s2) -> {
      if (s1 == null)
        return null;
      return s1.concat(s2);
    };
    System.out.println(concatString.apply("hello", "apple")); // helloapple

 // MathOperation
    MathOperation<Integer, Integer, Integer> sumOperation = (i1, i2) -> i1 + i2;
    System.out.println(sumOperation.compute(7, 9)); // 16

    MathOperation<Integer, Integer, Integer> subtractOperation =
        (i1, i2) -> i1 - i2;
    System.out.println(subtractOperation.compute(7, 9)); // -2



       // MathOperation with Double (使用 BigDecimal 避免精度问题)
    MathOperation<Double, Double, Double> sumDoubleOperation =
        (d1, d2) -> BigDecimal.valueOf(d1) //
            .add(BigDecimal.valueOf(d2)) //
            .doubleValue(); // return Primitive -> autobox

    System.out.println(sumDoubleOperation.compute(0.1, 0.2)); // 0.3
  }

  // ! method -> reusable
  public static Integer getLength(String s) {
    return s.length();
  }

