package javabasics.OOP._1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    String courseName = "java back-end";
    int    maxStudent = 100;
    int   qualityRatingOutOf10 = 20;

    List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
    List<Integer> studentAges = Arrays.asList(23, 31, 38);
    List<Student> students = new ArrayList<>();


}

