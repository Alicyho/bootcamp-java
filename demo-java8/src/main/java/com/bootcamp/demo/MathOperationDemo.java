package com.bootcamp.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MathOperationDemo {
    
    // 定义各种运算常量
    public static final MathOperation<Integer, Integer, Integer> ADD = (a, b) -> a + b;
    public static final MathOperation<Integer, Integer, Integer> SUBTRACT = (a, b) -> a - b;
    public static final MathOperation<Integer, Integer, Integer> MULTIPLY = (a, b) -> a * b;
    public static final MathOperation<Double, Double, Double> DIVIDE = (a, b) -> a / b;
    
    // 通用计算方法
    public static <T extends Number, U extends Number, R extends Number> 
    R calculate(T a, U b, MathOperation<T, U, R> operation) {
        return operation.compute(a, b);
    }
    
    public static void main(String[] args) {
        
        System.out.println("========== 1. 基本加减乘除示例 ==========");
        
        // 直接使用运算常量
        System.out.println("10 + 5 = " + ADD.compute(10, 5));           // 15
        System.out.println("10 - 5 = " + SUBTRACT.compute(10, 5));     // 5
        System.out.println("10 * 5 = " + MULTIPLY.compute(10, 5));     // 50
        System.out.println("10 / 3 = " + DIVIDE.compute(10.0, 3.0));   // 3.333...
        
        System.out.println("\n========== 2. Lambda 不同写法示例 ==========");
        
        // 写法1：完整 lambda
        MathOperation<Integer, Integer, Integer> add1 = (Integer a, Integer b) -> {
            return a + b;
        };
        
        // 写法2：简化 lambda (类型推断)
        MathOperation<Integer, Integer, Integer> add2 = (a, b) -> {
            return a + b;
        };
        
        // 写法3：最简化 lambda (省略 return 和花括号)
        MathOperation<Integer, Integer, Integer> add3 = (a, b) -> a + b;
        
        // 写法4：方法引用
        MathOperation<Integer, Integer, Integer> add4 = Integer::sum;
        
        System.out.println("add1: 5 + 3 = " + add1.compute(5, 3));
        System.out.println("add2: 5 + 3 = " + add2.compute(5, 3));
        System.out.println("add3: 5 + 3 = " + add3.compute(5, 3));
        System.out.println("add4: 5 + 3 = " + add4.compute(5, 3));
        
        System.out.println("\n========== 3. 使用 calculate 方法示例 ==========");
        
        System.out.println("15 + 7 = " + calculate(15, 7, ADD));
        System.out.println("15 - 7 = " + calculate(15, 7, SUBTRACT));
        System.out.println("15 * 7 = " + calculate(15, 7, MULTIPLY));
        System.out.println("15 / 4 = " + calculate(15.0, 4.0, DIVIDE));
        
        System.out.println("\n========== 4. Stream 批量计算示例 ==========");
        
        // 批量加法计算
        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> nums2 = Arrays.asList(10, 20, 30, 40, 50);
        
        List<Integer> addResults = IntStream.range(0, nums1.size())
            .mapToObj(i -> ADD.compute(nums1.get(i), nums2.get(i)))
            .collect(Collectors.toList());
        
        System.out.println("批量加法: " + nums1 + " + " + nums2);
        System.out.println("结果: " + addResults); // [11, 22, 33, 44, 55]
        
        // 批量乘法计算
        List<Integer> multiplyResults = IntStream.range(0, nums1.size())
            .mapToObj(i -> MULTIPLY.compute(nums1.get(i), nums2.get(i)))
            .collect(Collectors.toList());
        
        System.out.println("\n批量乘法: " + nums1 + " × " + nums2);
        System.out.println("结果: " + multiplyResults); // [10, 40, 90, 160, 250]
        
        System.out.println("\n========== 5. 动态选择运算示例 ==========");
        
        // 根据条件选择不同的运算
        String operator = "*";

        MathOperation<Integer, Integer, Integer> operation;
        
        switch (operator) {
            case "+":
                operation = ADD;
                break;
            case "-":
                operation = SUBTRACT;
                break;
            case "*":
                operation = MULTIPLY;
                break;
            default:
                throw new IllegalArgumentException("不支持的运算符: " + operator);
        }
        
        System.out.println("动态运算: 20 " + operator + " 5 = " + operation.compute(20, 5));
        
        System.out.println("\n========== 6. 自定義運算示例 ==========");
        
        // 自定义运算：a² + b²
        MathOperation<Integer, Integer, Integer> sumOfSquares = (a, b) -> (a * a) + (b * b);
        System.out.println("3² + 4² = " + sumOfSquares.compute(3, 4)); // 9 + 16 = 25
        
        // 自定义运算：平均值
        MathOperation<Double, Double, Double> average = (a, b) -> (a + b) / 2;
        System.out.println("(10 + 20) / 2 = " + average.compute(10.0, 20.0)); // 15.0
        
        // 自定义运算：最大值
        MathOperation<Integer, Integer, Integer> max = (a, b) -> a > b ? a : b;
        System.out.println("max(25, 18) = " + max.compute(25, 18)); // 25
        
        // 自定义运算：次方
        MathOperation<Double, Integer, Double> power = (a, b) -> Math.pow(a, b);
        System.out.println("2³ = " + power.compute(2.0, 3)); // 8.0
    }
}