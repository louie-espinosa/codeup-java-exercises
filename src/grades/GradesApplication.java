package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    //MAIN
    public static void main(String[] args) {
        // Ex 2. (Java Collections) Inside the main method, create a HashMap named students
        HashMap<String, Student> students = new HashMap<>();//arguments are github usernames, and values of student objects

        Student brian = new Student(" Brian");
        brian.addGrade(100);
        brian.addGrade(100);
        brian.addGrade(100);
        Student louie = new Student(" Louie");
        louie.addGrade(96);
        louie.addGrade(79);
        louie.addGrade(100);
        Student calvin = new Student(" Calvin");
        calvin.addGrade(75);
        calvin.addGrade(85);
        calvin.addGrade(92);
        Student jody = new Student(" Jody");
        jody.addGrade(88);
        jody.addGrade(100);
        jody.addGrade(90);

        students.put("The_Singularity ", brian);
        students.put("Greenmac ", louie);
        students.put("Bot ", calvin);
        students.put("Ice_goddess ", jody);
        //System.out.println("students: " + students);

        //Ex 3.(Java Collections)
        //Lets use the Input class (to use our scanner)
        //Input studentInterest;
        //If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.
        Input input = new Input();

        //look to use method containsKey to check whether the input value matches the keys that we have

        //If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.

        //Printing all the usernames for the viewer to choose from

    while(true) {
            System.out.println("Hey, which student would you like to see more about? ");//viewing the keys
            System.out.printf("%nStudent's Github usernames: ");
//        print out usernames here
            for (String key : students.keySet()) {
                System.out.printf("|%s|" + " ", key);
            }
            String userInterest = input.getString();
            if (!students.keySet().equals(userInterest)) {//if user selection is wrong type or not on list
                System.out.println("Your selection was not on the list ");

            } else {
                //we show the user the students grades here amd then ask if they'd like to continue and show again
                String userSelected = input.getString();
                System.out.println(userSelected);
                return;
            }
        }
    }





}
