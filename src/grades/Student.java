package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    //creating the fields for name, and grades using ArrayList for grades
    private String name;
    private ArrayList<Integer> grades;

    //The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>(); //Already instantiated here so dont have to instantiate in main
    }


    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);//ArrayList method to add to the array when called in argument (this will happen in main)

    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        //setting the average to 0
        int total = grades.size();
        int average = 0;
        //iterate through grades to count them
        for (double grade : grades)
            average += grade;//This adds all the grade integers(arithmetic) together
        return average/ total;//returning the total value that was added together, divided by the number of grades.
    }

    @Override
    public String toString() {
        return  name + " " + grades;
    }
}
