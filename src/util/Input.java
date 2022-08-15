package util;

import java.util.Scanner;

public class Input {

    private Scanner nsa = new Scanner(System.in); //Setting up the scanner in the field

    public String getString() {
        String nameInput = nsa.nextLine();
        return nameInput;
    }
    public boolean yesNo(String prompt) {
        //prompt is asked in the psvm
        String confirm = nsa.nextLine();
        System.out.println(confirm);//return
        return confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes") || confirm.equalsIgnoreCase("sure") || confirm.equalsIgnoreCase("absolutely");
    }
    public int getInt() {
        return nsa.nextInt();
    }

    public int getInt(int min, int max, String prompt) {
        //print prompt every time this method is called
        System.out.println(prompt);
        //get int from user
        int userInput = getInt();

        if (userInput < min || userInput > max) {
            System.out.println("You're number is not between " + min + " and " + max);
            userInput = getInt(min, max, prompt);
        }
        //else return the int
        return userInput;
    }
    public double getDouble() {
        //using this as a scanner
        return nsa.nextDouble();

    }

    public double getDouble(double min, double max) {
        //my prompts are best situated in the inputTest psvm, so that these functions can be reused without polluting w./ addiotinal prompts
        double doubleInput = getDouble();

        if (doubleInput < min || doubleInput > max) {
            System.out.println("You're out of range, my man ");
            doubleInput = getDouble(min, max);
        }
        //else return the double
        return doubleInput;
    }




}
