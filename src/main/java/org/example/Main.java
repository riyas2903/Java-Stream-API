package org.example;

import java.util.*;
import java.util.stream.*;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//1. Convert a list of strings to uppercase, sort and print
//    List<String> list = Arrays.asList("riya","rita","romeo");
//    list.stream().map(String::toUpperCase).sorted().forEach(System.out::println);

//2. Get the length of string greater than 5 and print the total count
//   List<String> list = Arrays.asList("travel", "capture", "roam", "dance", "love");
//    int count = (int) list.stream().filter(s -> s.length()>5).count();
//    System.out.println(count);

//3. Remove duplicates from list | Get distinct elements
//        List<Integer> list = Arrays.asList(1,2,1,4);
//        list.stream().distinct().forEach(System.out::println);

//4. Get the list of string having a particular word
//        List<String> list = Arrays.asList("travel", "capture", "roam", "lovers", "love");
//        list.stream().filter(s ->s.contains("lov")).forEach(System.out::println);

//5. Remove a string that starts with a particular word
//        List<String> list = Arrays.asList("travel", "tram", "roam", "lovers", "love");
//        list.stream().filter(s -> !s.startsWith("tr")).forEach(System.out::println);

//6. Find a first element in a list that starts with a particular letter.
//        List<String> list = Arrays.asList("tramms", "travels", "roams", "lovers", "love");
//        Optional<String> op = list.stream().filter(s ->s.startsWith("t")).findFirst();
//        op.ifPresent(System.out::println);

//7.Get the length of each name in the list
//        List<String> list = Arrays.asList("tram", "travel", "roam", "lovers", "love");
//        list.stream().map(s -> s.length()).forEach(System.out::println);

//8) Sort the given list of decimals in asc & reverse order
        //List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        /// In Asc Order
        //decimalList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        // In Desc Order
        //decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//9)  Separate odd & even nos from the list
//        List<Integer> list1 = Arrays.asList(2, 3, 4, 6, 9, 8);
//        Map<Boolean, List<Integer>> partition=list1.stream().collect(Collectors.partitioningBy(i->i%2==0));
//        List<Integer> evenNo= partition.get(true);
//        List<Integer> oddNo= partition.get(false);
//        System.out.println("even no: "+evenNo);
//        System.out.println("odd no: "+oddNo);

//10. Sort the list of strings based on their length in asc order
//        List<String> list = Arrays.asList("trams", "travel", "roam", "explore", "aim");
//        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

//11. Sort the list of string based on their length in desc order
//        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

//12. Find the longest word in the list
//        List<String> list = Arrays.asList("trams", "travel", "roam", "explore", "aim");
//        System.out.println(list.stream().max(Comparator.comparing(String::length)).get());

//13. Find the smallest word in the list
//        List<String> list = Arrays.asList("trams", "travel", "roam", "explore", "aim");
//        System.out.println(list.stream().min(Comparator.comparing(String::length)).get());

//14. get list of strings having vowels
//        list.stream().filter(s -> s.matches(".*[aeiou].*")).forEach(System.out::println);

//15. Convert a list of strings into a single string, separated by commas.
//         List<String> list1 = Arrays.asList("trams", "trams", "roam", "explore", "men");
//         String d = list1.stream().collect(Collectors.joining(","));
//         System.out.println(d);

//16. Create a new list, where each string is reversed from original list
//        List<String> list1 = list.stream().map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.toList());
//        System.out.println(list1);

//17. Remove all string from list that are empty or null using streams
//        List<String> list = Arrays.asList("trams", null, "roam", "", "men");
//        list.stream().filter(s -> s!=null && !s.isEmpty()).forEach(System.out::println);

//18. Sum of elements in list using streams
        //List<Integer> list = Arrays.asList(1,2,3,4,5);
//        IntStream s = list.stream().mapToInt(Integer::intValue);
//        int sum = s.sum();
//        System.out.println(sum);

//19. Sum of elements in array using streams
        //int arr[] = {45,67,89,34,22};
//        int sum = Arrays.stream(arr).sum();
//        System.out.println(sum);

//20. Max of elements in a list
//        OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
//        int maxElement = max.getAsInt();
//        System.out.println(maxElement);

//21. Max of elements in an array
//        int max = Arrays.stream(arr).max().getAsInt();
//        System.out.println(max);

//22. Second highest element in a list of integers
//        List<Integer> list1= Arrays.asList(45,23,67,34,12,89);
//        int l = list1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(()-> new RuntimeException("Element not found"));
//        System.out.println("Second highest element is: "+l);

//23. Group the strings in the length and count their number
//      List<String> str = Arrays.asList("ram", "ro","rajeev", "raman", "sia");
//        Map<Integer, Long> map = str.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
//        System.out.println("The count of string in group of length: "+map);

//24. Group the strings with same length
//        List<String> names = Arrays.asList("apple", "bat", "cat", "banana");
//        Map<Integer, List<String>> groupedByLength = names.stream().collect(Collectors.groupingBy(String::length));
//        System.out.println(groupedByLength);

//25.  Print a list of elements greater than 5
//        List<Integer> l = Arrays.asList(6,90,23,67,2);
//        List<Integer> l2 = l.stream().filter(x -> x>5).collect(Collectors.toList());
//        System.out.println("Greater than 5 elements: "+l2);

//26. Write a program to filter out all the even numbers from a list using Java Stream API
//        List<Integer> list2 = Arrays.asList(12, 2, 36, 490, 51);
//        List<Integer> evenList = list2.stream().filter(n->n%2==0).toList();
//        System.out.println("Even list: "+evenList);

//27. Given a list of strings, write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
//        List<String> strList = Arrays.asList("Riya", "Shruati", "Vidhi");
//        char ch='y';
//        long c = strList.stream().filter(str -> str.contains(String.valueOf(ch))).count();
//        System.out.println("Count of strings with char "+ch+" is: "+c);
    }
}