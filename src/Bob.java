import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        String userInterest; //declaring a variable
do {
    Scanner bob = new Scanner(System.in);
    System.out.println("Converse with Bob, IOW, Type sumthin here(or below)-->: ");
    String userInput = bob.nextLine();

    if (userInput.endsWith("?")) {
        System.out.println("Sure, why not. \n");
    } else if (userInput.endsWith("!")) {
        System.out.println("Whoa, calm your vibe, man \n");
    } else if (userInput.endsWith(" ") || userInput.isBlank()) {
        System.out.println("Fine. Be that way! \n");
    } else {
        System.out.println("Dont make me carry this conversation. \n");
    }

    System.out.println("Done talking to Bob? [y/n] \n");
    bob.nextLine();
    userInterest = bob.nextLine(); //storing the user input into the variable.

} while(userInterest.equalsIgnoreCase("n"));

    }
}
