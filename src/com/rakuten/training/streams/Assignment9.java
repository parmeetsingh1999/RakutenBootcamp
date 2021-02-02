package com.rakuten.training.streams;

public class Assignment9
{
	public static void main(String[] args)
	{
		int[] 
	}
}


//package solutions.streams.part2;
//
//import java.util.*;
//
//
//
//public class StreamExamples {
//  public static void main(String[] args) {
//    List<String> words = 
//        Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
//    System.out.printf("Original words: %s.%n", words);
//    //  Stream<String> wordStream = words.stream();  NO!! Why not?
//    
//    String upperCaseWords = 
//        words.stream().reduce("", (s1, s2) -> s1.toUpperCase() 
//                                              + s2.toUpperCase());
//    System.out.printf("Single uppercase String: %s.%n", 
//                      upperCaseWords);
//    
//    String upperCaseWords2 = 
//        words.stream().map(String::toUpperCase)     // Or .map (s -> s.toUpperCase())
//                      .reduce("", String::concat);  // Or .reduce("", (s1,s2) -> s1+s2)
//    System.out.printf("Single uppercase String: %s.%n", 
//                      upperCaseWords2);
//    
//    String wordsWithCommas = 
//        words.stream().reduce((s1, s2) -> s1 + "," + s2)
//                      .orElse("need at least two strings");
//    System.out.printf("Comma-separated String: %s.%n", 
//                      wordsWithCommas);
//    
//    int numberOfChars =
//        words.stream().mapToInt(String::length)
//                      .sum();
//    System.out.printf("Total number of characters: %s.%n", 
//                      numberOfChars);
//    
//    long numberOfWordsWithH =
//        words.stream().filter(s -> s.contains("h"))
//                      .count();
//    System.out.printf("Number of words containing 'h': %s.%n", 
//                      numberOfWordsWithH);
//  }
//}
//
//
//package solutions.streams.part3;
//
//import java.util.*;
//import java.util.stream.*;
//
//public class MathUtils {
//  public static double[] randomArray(int size) {
//    return(new Random().doubles(size).toArray());
//  }
//  
//  /** Return the sum of the square roots of entries in the array. 
//   */
//  public static double sqrtSum(double[] nums) {
//    return(DoubleStream.of(nums).map(Math::sqrt).sum());
//  }
//  
//  public static double sqrtSumParallel(double[] nums) {
//    return(DoubleStream.of(nums).parallel().map(Math::sqrt).sum());
//  }
//
//  // Or, use DoubleStream.generate, which produces DoubleStream
//  // instead of Stream<Double>
//  public static Stream<Double> randomNums(double maxValue) {
//    return(Stream.generate(() -> Math.random() * maxValue));
//  }
//}
//
//
//package solutions.streams.part3;
//
//import java.util.*;
//import java.util.stream.*;
//
//
//
//public class StreamExamples {
//  public static void main(String[] args) {
//    //double[] nums = { 1, 4, 9 };
//    double[] nums = MathUtils.randomArray(100_000_000);
//    System.out.println("Summing sequentially:");
//   
//      double sum = MathUtils.sqrtSum(nums);
//      System.out.printf("  Sum is %,.8f.%n", sum);
//  
//    System.out.println("Summing in parallel:");
//   
//      sum = MathUtils.sqrtSumParallel(nums);
//      System.out.printf("  Sum is %,.8f.%n", sum);
//   
//    
//    System.out.println("Random nums:");
//    MathUtils.randomNums(10).limit(5).forEach(System.out::println);
//    List<Double> randomNums1 = 
//      MathUtils.randomNums(10).limit(10).collect(Collectors.toList());
//    System.out.println("List of random nums: " + randomNums1);
//    Double[] randomNums2 =
//      MathUtils.randomNums(10).limit(20).toArray(Double[]::new);
//    System.out.println("Array of random nums: " + Arrays.asList(randomNums2));
//  }
//}
