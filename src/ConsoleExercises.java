
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        //Write some code to output: The value of pi is approximately 3.14.

        System.out.printf("The Value of pi is Approximately %.2f%n", pi);
        //1.Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        //What happens if you input something that is not an integer?
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your fave number: ");
        int numInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + numInput + "\" <--" );//'Input mismatch exception' occurs when an input other than an integer, or number is used.

        //Prompt user for three words and store in variables and then print them out using scanner
        System.out.print("Enter three words: ");
        String wordOneInput = scanner.next();//storing input
        System.out.println("You entered: --> \"" + wordOneInput + "\" <--");
        String wordTwoInput = scanner.next();
        System.out.println("You entered: --> \"" + wordTwoInput + "\" <--");
        String wordThreeInput = scanner.next();
        System.out.println("You entered: --> \"" + wordThreeInput + "\" <--" );

        System.out.print("Enter a sentence: ");
        //String userSentenceInput = scanner.next(); //this call only captures and prints the first word and stops at the whitespace.

        scanner.nextLine();// clearing the buffer to allow input from scanner
        String userSentenceInput = scanner.nextLine(); //but using nextLine doesn't allow input
        System.out.println("You entered: --> \"" + userSentenceInput + "\" <--");

        //Calculate the perimeter and area of Codeup's classroom and use parseInt to turn string into numbers.
        System.out.println("Enter the length of the classroom: ");
        String lengthInput = scanner.nextLine();
        int length = parseInt(lengthInput);
        System.out.println("Enter the width of the classroom: ");
        String widthInput = scanner.nextLine();
        int width = parseInt(widthInput);
        System.out.println("The width is: " + widthInput + "ft");
        System.out.println("The length is: " + lengthInput + "ft");

        //We have the data stored in variables, so lets math it out for the perimeter and area

        int perimeter = width*2 + length*2;
        System.out.println("The perimeter is " + perimeter + "ft");

        int area = length*width;
        System.out.println("The area is " + area + " square ft");


    }
}
        //Parse the resulting strings to a numeric type.
        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.

        //2. Display the area and perimeter of that classroom.
        //The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

