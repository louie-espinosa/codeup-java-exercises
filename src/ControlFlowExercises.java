import java.util.Scanner;
import javax.swing.*;
import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //ex 1.
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        //ex 2.a, b, c refactored for a, b, and c.
//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000 && i != 0); //without setting i != 0, system infinitely prints 0.

        //refactoring the last two exercises with "for" loops
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//        for (int i = 2; i <= 1000000 & i != 0; i *= i) {
//            System.out.println(i);
//        }


//        Write a program that prints the numbers from 1 to 100.
//        for (int i = 1; i <= 100; i++) {
//            System.out.print(i + " ");
//        }
//        For multiples of three: print “Fizz” instead of the number.
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) { //booleans look for ==, or ===
//                System.out.println("FizzBuzz"); //refactored so that it checks for FizzBuzz first. otherwise                                fizz will be prioritized and printed instead of fizzbuzz
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//
//        }
String userInterest;
        //Prompt the user to enter an integer.
do {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick a humble number up to 5: ");
        int numInput = sc.nextInt(); //using nextInt NOT nextLine because it's an integer.

        //make table headings
        String numberHeader = "number |";
        String squaredHeader = "squared |";
        String cubedHeader = "cubed";

        //not using browser, but using console, so shouldn't look to use html tags.
        //building a super basic table made of dashes and pipes to sort data
        //storing the dashes and pipes in variables
        System.out.println("Here is your data: \n");

        System.out.println(numberHeader + squaredHeader + cubedHeader);
        String col = "------ |";
        String col2 = "------ |";
        String col3 = "------";
        //printing the column separators
        System.out.println(col + col2 + col3);
//building a loop to iterate through the input number and apply square and cube to it.

        for (int i = 1; i < numInput; i++) {
                int iSquared = i * i;
                int iCubed = i * i * i;

                System.out.println(i + "      |" + iSquared + "      |" + iCubed);
        }
//building the outline for the iterated output inside the table
        int rowSquared = numInput * numInput;
        int rowCubed = numInput * numInput * numInput;
        System.out.println(numInput + "      |" + rowSquared + "      |" + rowCubed);
        //asking user if the like to continue
        System.out.println("Would you like to continue? [y/n] \n");
        sc.nextLine();//clearing the buffer (scanner)
        userInterest = sc.nextLine();



} while (userInterest.equalsIgnoreCase("y"));


//4. Convert given number grades into letter grades.

// Prompt the user for a numerical grade from 0 to 100.
     do {
         Scanner sc = new Scanner(System.in);
         System.out.print("What number grade do you think you deserve: ");
         int numGradeInput = sc.nextInt();
         System.out.println("You really think you earned? " + numGradeInput);


         if (numGradeInput >= 88) {
             System.out.println("You got an A!");
         } else if (numGradeInput >= 80) {
             System.out.println("You got a B!");
         } else if (numGradeInput >= 67) {
             System.out.println("Your grade is a C");
         } else if (numGradeInput >= 60) {
             System.out.println("Your grade is a D");
         } else {
             System.out.println("Your grade is an F");
         }
         System.out.println("Would you like to challeneg your grade? [y/n] \n");
         sc.nextLine();//clearing the buffer (scanner)
         userInterest = sc.nextLine();

     } while (userInterest.equalsIgnoreCase("y"));
            // Display the corresponding letter grade.
//using a switch statement to display a letter for a number range.
        //switch is limited to constants and suffers from greater than or less than conditions.
//        int selection = numGradeInput;
//
//          switch (selection >= 88) {
//            case 1:
//                System.out.println("A");
//                break;
//            case 2:
//                System.out.println("B");
//                break;
//            case 3:
//                System.out.println("C");
//                break;
//            case 4:
//                System.out.println("D");
//                break;
//            case 5:
//                System.out.println("F");
//                break;
//            default:
//                System.out.println("You skipped the quiz ");
//                break;
//        }


// Prompt the user to continue.

// Assume that the user will enter valid integers for the grades.

// The application should only continue if the user agrees to.
//
//  Grade Ranges:
//
//            A : 100 - 88
//            B : 87 - 80
//            C : 79 - 67
//            D : 66 - 60
//            F : 59 - 0






    }
}
