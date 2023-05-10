package javabasics.javaadvanced._3;

import java.sql.SQLOutput;
import java.util.*;

import static java.util.stream.Collectors.toSet;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


     /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
      *
      *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));
        Set<String> list1 = new HashSet<>();
        for (String element : list) {
            list1.add(element);
        }
        list = new ArrayList<>(list1);

        // Your code here
        Arrays.sort(new List[]{list});
        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }



    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
         toSet(list);
         toSet(set);

    }
    public static Collection<String> toSet(Collection<String> parameter){
        return parameter;

    }



    // Write your method for exercise 2 here


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here
        for (String word:words) {
            Integer i =1;
            i++;
            wordCount.put(word,i);
        }
        System.out.println(wordCount);
    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *
     *    "ho risposto nel modo in cui procederei io, sono consapevole del fatto che le risposte sarebbero potute
     *    essere diverse a seconda che si intenda qualcosa come variabile o come oggetto nel mio caso ho inteso tutto come variabile"
     *
     *    Answer:LinkedHashSet;
     *    because store in arrival order and have better performance of an Array.
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer:HashMaps;
     *    because with a Maps we can sort student like key and grades like values for example.
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer:TreeSet
     *    because with TreeSet we can chose sort method.
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer:HashMap
     *    because with a Maps we can sort product like key and prices like values for example.
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer:LinkedHashSet
     *    because store in added order and have better performance of an Array.
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer:HashMap
     *    because with a Maps we can sort state like key and populations like values for example.
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer:HashMap
     *    because with a Maps we can sort book like key and authors and publication dates like values for example.
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer:HashMap
     *    because with a Maps we can sort courses like keys and professors like values for example.
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer:HashMap
     *    because with a Maps we can sort movies like keys and ratings and release dates like values for example.
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer:HashMap
     *    because with a Maps we can sort flights available like keys and destinations and departure times like values for example.
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer:HashMap
     *    because with a Maps we can sort articles like keys and titles and publication dates like values for example.
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer:HashMap
     *    because with a Maps we can sort songs like keys and artists and album names like values for example.
     */

}
