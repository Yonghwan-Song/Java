/**
 * Workshop 8.
 * 
 * Student Name: Yonghwan Song        Student ID: 135458198
 * Email: ysong115@myseneca.ca
 * Course: JAC444NDD
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap; 
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Optional;

public class StudentProcess {
    
    //for task 2
    private static final Comparator<Student> STUDENT_ORDER = (student1, student2)->
    (student1.getGrade()<student2.getGrade()? -1 : (student1.getGrade() == student2.getGrade()? 0:1));

    //for task 4
    private static final Comparator<Student> STUDENT_ORDER_ASCENDING = (student1, student2)->{
        int lastCmp = student1.getLastName().compareTo(student2.getLastName());
        int firstCmp = student1.getFirstName().compareTo(student2.getFirstName());
        return lastCmp != 0? lastCmp : firstCmp;
    };
    //for task 4
    private static final Comparator<Student> STUDENT_ORDER_DESCENDING = (student1, student2)->{
        int lastCmp = student2.getLastName().compareTo(student1.getLastName());
        int firstCmp = student2.getFirstName().compareTo(student1.getFirstName());
        return lastCmp != 0? lastCmp : firstCmp;
    };


    public static void main(String[] args) {
        Student[] students = {
            new Student("Jack", "Smith", 50.0, "IT"),
            new Student("Aaron", "Johnson", 76.0, "IT"),
            new Student("Maaria", "White", 35.8, "Business"),
            new Student("John", "White", 47.0, "Media"),
            new Student("Laney", "White", 62.0, "IT"),
            new Student("Jack", "Jones", 32.9, "Business"),
            new Student("Wesley", "Jones", 42.89, "Media")};

        List<Student> studentList = Arrays.asList(students);

        //#region Task 1.
        System.out.println("Task 1:\n");
        System.out.println("Complete Student list:");
        //Using the Iterable<E> interface's forEach method.
        //The Iterable<E> is the superinterface of collection<E> which is the superinterface of List<E>.
        studentList.forEach((student)->{
                System.out.println(student);
        });
        //#endregion

        //#region Task 2.
        System.out.println("\n\nTask 2:\n");
        System.out.println("Students who got 50.0-100.0 sorted by grade:");

        Stream<Student> studentStream = studentList.stream();
        
        studentStream.filter(student->student.getGrade()>=50)
                     .sorted(STUDENT_ORDER)
                     .forEach(student->{System.out.println(student);});
        //#endregion

        //#region Task 3.
        System.out.println("\n\nTask 3:\n");
        System.out.println("First Student who got 50.0-100.0:");

        //get the Optional<Student> object as the return value of findFirst stream method.
        Optional<Student> theFirstStudent = studentList.stream().filter(student->student.getGrade()>=50).findFirst();
        System.out.println(theFirstStudent != null? theFirstStudent.get() : "There is no student whose grade is between 50 and 100");
        //#endregion

        //#region Task 4.
        System.out.println("\n\nTask 4:\n");
        System.out.println("Students in ascending order by last name then first:");
        studentList.stream().sorted(STUDENT_ORDER_ASCENDING).forEach(student->{System.out.println(student);});

        System.out.println("\nStudents in descending order by last name then first:");
        studentList.stream().sorted(STUDENT_ORDER_DESCENDING).forEach(student->{System.out.println(student);});
        //#endregion

        //#region Task 5.
        System.out.println("\n\nTask 5:\n");
        System.out.println("Unique Student last names:");
        studentList.stream()
                   .map(student->student.getLastName()) // to Stream<String>.
                   .distinct()
                   .sorted()
                   .forEach(studentLastName->{System.out.println(studentLastName);});
        //#endregion
    }
}
