package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {

    public static void main(String[] args) {
        Student joey = new Student("Joey");//plugging in the argument (required per the parameter)

        System.out.println("the student's name is: " + joey.getName());//using the method getName on the variable
        // defining an array list for grades

        //adding some grades
        joey.addGrade(65);
        joey.addGrade(100);
        joey.addGrade(75);
        System.out.println("joey's grades so far are:  " + joey.getGrades());
        System.out.println("joey's grade average so far is: " + joey.getGradeAverage());


        //System.out.println("joey's grade is: " + joey.addGrade());



    }
    //defining a hash map
//    HashMap<String, Integer> grades = new HashMap<>();
//    //adding the data
//    grades.put("Abel", 65);
//    grades.put("Johnny", 70);
//    grades.put("Greg", 88);
//    grades.put("Frank", 100);
//        System.out.println("grades = " + grades);
}
