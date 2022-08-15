package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {
        // Ex 2. (Java Collections) Inside the main method, create a HashMap named students
        HashMap<String, String> students = new HashMap<>();//arguments are github usernames, and values of student objects

        Student brian = new Student("Brian");
        brian.addGrade(100);
        brian.addGrade(100);
        brian.addGrade(100);
        Student louie = new Student("Louie");
        louie.addGrade(96);
        louie.addGrade(79);
        louie.addGrade(100);
        Student calvin = new Student("Calvin");
        calvin.addGrade(75);
        calvin.addGrade(85);
        calvin.addGrade(92);
        Student jody = new Student("Jody");
        jody.addGrade(88);
        jody.addGrade(100);
        jody.addGrade(90);

        students.put("brian", "codebuff");
        students.put("Louie", "Greenmac");
        students.put("Calvin", "Kilo");
        students.put("Shiva", "icegoddess");
        //System.out.println("students: " + students);

        //Ex 3.(Java Collections)
        //Lets use the Input class (to use our scanner)
        //Input studentInterest;
        Input
        System.out.println("Hey, which student would you like to see more about? " + students);
        String userInterest = nsa.nextLine();
    }

}
