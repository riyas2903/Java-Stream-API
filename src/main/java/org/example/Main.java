package org.example;

import java.util.*;
import java.util.stream.*;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //1. Sum of elements using stream
/*        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
          int sum = list.stream().mapToInt(Integer::intValue).sum();
          System.out.println("Sum is: "+sum);*/


        //2.Given a list of integers, write a program to find and print the maximum element using Java Stream API
        /*List<Integer> list1 = Arrays.asList(12, 2, 36, 490, 51);
        int maxValue = list1.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println("Max value is: "+maxValue);*/

        //3. Write a program to filter out all the even numbers from a list using Java Stream API
        /*List<Integer> list2 = Arrays.asList(12, 2, 36, 490, 51);
        List<Integer> evenList = list2.stream().filter(n->n%2==0).toList();
        System.out.println("Even list: "+evenList);*/

        //4. Given a list of strings, write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
/*
        List<String> strList = Arrays.asList("Riya", "Shruati", "Vidhi");
        char ch='a';
        long c = strList.stream().filter(str -> str.contains(String.valueOf(ch)))
                .count();
        System.out.println("Count of strings with char "+ch+" is: "+c);
*/
        ///5. Filter no greater than 5
//        List<Integer> l = Arrays.asList(6,90,23,67,2);
//        l.stream().filter(x -> x>5).toList();
//        List<Integer> l2 = l.stream().filter(x -> x>5).collect(Collectors.toList());
//        System.out.println("Greater than 5 elements: "+l2);
//
    //6. Transform string to uppercase.
    //7. Remove duplicates from a list of integers.
    //8. sort in alphabetical and reverse order.
    //9. fetch 3 elements only.
    //10. Skip the 4 elements
    //11. print each element with a prefix item:
    //12. Collect to set and no duplicates and no order.
    //13. reduce: comute the product of no.
    //14. find max and min using streams
    //15.

    //1. Convert list of strings to uppercase, sort and print
    //List<String> list = Arrays.asList("riya","rita","romeo");
    //list.stream().map(s ->s.toUpperCase()).sorted().forEach(System.out::println);

    //2. Get the length of string greater than 5 and the count also
//   List<String> list = Arrays.asList("travel", "capture", "roam", "dance", "love");
//    int count = (int) list.stream()
//            .filter(s -> s.length()>5)
//           .count();
//            System.out.println(count);

    //3. Remove duplicates from list | Get distinct elements
//        List<Integer> list = Arrays.asList(1,2,1,4);
//        list.stream().distinct().forEach(System.out::println);

//    4. Get the list of string having a particular word
//        List<String> list = Arrays.asList("travel", "capture", "roam", "lovers", "love");
//        list.stream().filter(s ->s.contains("lov"))
//                .forEach(System.out::println);

//    5. Remove a string that start with a word from stream
//        List<String> list = Arrays.asList("travel", "tram", "roam", "lovers", "love");
//        list.stream().filter(s -> !s.startsWith("tr"))
//                .forEach(System.out::println);
//
    //6. Find a first element in a list that starts with a particular letter.
        //List<String> list = Arrays.asList("tramms", "travels", "roams", "lovers", "love");
//        Optional<String> op = list.stream().filter(s ->s.startsWith("t"))
//                .findFirst();
//        op.ifPresent(System.out::println);

    //7.   Get the length of each name in list
//        List<String> list = Arrays.asList("tram", "travel", "roam", "lovers", "love");
//        list.stream().map(s -> s.length()).forEach(System.out::println);

//  8) Sort the given list of decimals in reverse order
//        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
//        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//  9)  Separate odd & even nos.
//        List<Integer> list1 = Arrays.asList(2, 3, 4, 6, 9, 8);
//        Map<Boolean, List<Integer>> partition=list1.stream().collect(Collectors.partitioningBy(i->i%2==0));
//        List<Integer> evenNo= partition.get(true);
//        List<Integer> oddNo= partition.get(false);
//        System.out.println("even no: "+evenNo);
//        System.out.println("odd no: "+oddNo);

//Intermediate - Level
//1. Sort the list of string based on their length in asc order
//        List<String> list = Arrays.asList("trams", "travel", "roam", "explore", "aim");
//        list.stream().
//                sorted(Comparator.comparing(String::length))
//                .forEach(System.out::println);

//2. Sort the list of string based on their length in desc order
//        list.stream()
//                .sorted(Comparator.comparing(String::length).reversed())
//                .forEach(System.out::println);

//3. Find the longest word in the list
//        String s = list.stream()
//                .max(Comparator.comparing(String::length))
//                .get();
//        System.out.println(s);

//4. Find the smallest word in the list
//        String s = list.stream()
//                .min(Comparator.comparing(String::length))
//                .get();
//        System.out.println(s);

//5. get list of strings having vowels
//        list.stream()
//                .filter(s -> s.matches(".*[aeiou].*"))
//                .forEach(System.out::println);

//6. Convert a list of strings into a single string, separated by commas.
//         List<String> list1 = Arrays.asList("trams", "trams", "roam", "explore", "men");
//         String d = list1.stream().collect(Collectors.joining(","));
//         System.out.println(d);

//7. Create a new list, where each string is reversed from original list
//        List<String> list1 = list.stream().map(str -> new StringBuilder(str).reverse().toString())
//            .collect(Collectors.toList());
//        System.out.println(list1);

//8. Remove all string from list that are empty or null using streams
//        List<String> list = Arrays.asList("trams", null, "roam", "", "men");
//        list.stream().filter(s -> s!=null && !s.isEmpty()).forEach(System.out::println);

//9. Sum of elements in list using streams
          //List<Integer> list = Arrays.asList(1,2,3,4,5);
//        IntStream s = list.stream().mapToInt(Integer::intValue);
//        int sum = s.sum();
//        System.out.println(sum);

 //10. Sum of elements in array using streams
        //int arr[] = {45,67,89,34,22};
//        int sum = Arrays.stream(arr).sum();
//        System.out.println(sum);

 //11. Max of elements in a list
//        OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
//        int maxElement = max.getAsInt();
//        System.out.println(maxElement);

 //12. Max of elements in an array
       //int max = Arrays.stream(arr).max().getAsInt();
//        System.out.println(max);

 //13. Second highest element in an list of integers
//        List<Integer> list1= Arrays.asList(45,23,67,34,12,89);
//        int l = list1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(()-> new RuntimeException("Element not found"));
//        System.out.println("Second highest element is: "+l);


        //18. Flatmap a list
        //Collections.joining
        //Collectors.groupingBy(String::length)
        //Collectors.groupingBy(String::length, Collectors.counting())
//        List<List<String>> data = Arrays.asList(
// Arrays.asList("a", "b"),
// Arrays.asList("c", "d"));
//        String list1 = data.stream().flatMap(Collection::stream).collect(Collectors.joining(":"));
//        System.out.println(list1);

        //19- Collectors.groupingBy(String::length)
//        List<String> names = Arrays.asList("apple", "bat", "cat", "banana");
//
//        Map<Integer, List<String>> groupedByLength = names.stream()
//                .collect(Collectors.groupingBy(String::length));
//
//        System.out.println(groupedByLength);

        //20 - Collectors.groupingBy(String::length, Collectors.counting()
//        List<String> names = Arrays.asList("apple", "bat", "cat", "banana", "cat");
//
//        Map<Integer, Long> countByLength = names.stream()
//                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
//
//        System.out.println(countByLength);

    //21 - 10. Collecting and Joining
        //Join strings with delimiter.
//        List<String> words = Arrays.asList("Java", "Streams");
//        String joined = words.stream()
//                .collect(Collectors.joining(", "));
//        System.out.println(joined);

        //22. Generate an infinte stream
        //Stream<Double> stream = Stream.generate(Math::random);

        //23. Group tje strings in the length and count the number
        //List<String> str = Arrays.asList("ram", "ro","rajeev", "raman", "sia");
        //Map<Integer, Long> map = str.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        //System.out.println("The count of string in group of length: "+map);

        //24. Sorted the list of strings in order of their length - asc order
        //str.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        //25. Sorted the list of strings in order of their length - desc order
        //str.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
    }
}