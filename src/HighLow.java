import java.util.*;

public class HighLow {


    public static void main(String[] args) {

                // create an ArrayList which contains
                // emails for a group of people
                ArrayList<String> list = new ArrayList<String>();

                // Add emails to list
                list.add("abc@geeksforgeeks.org");
                list.add("user@geeksforgeeks.org");
                list.add("pqr@geeksforgeeks.org");
                list.add("random@geeksforgeeks.org");
                list.add("randomuser@geeksforgeeks.org");

                // create Spliterator of ArrayList
                // using spliterator() method
                Spliterator<String> emails = list.spliterator();

                // print result from Spliterator
                System.out.println("list of Emails:");

                // forEachRemaining method of Spliterator
                emails.forEachRemaining((n) -> System.out.println(n));






    } //ex 5.
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
    //Math
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"
//
//    Hints
//
//    Use the random method of the java.lang.Math class to generate a random number.

}
