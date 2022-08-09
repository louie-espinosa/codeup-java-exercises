package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in); //Setting up the scanner in the field

    public String getString() {
        System.out.println("Who is your fave FF Summon/Esper/Eidolon/GF/Aeon/Primal/Avatar? ");
        String nameInput = scanner.nextLine();
        return nameInput;
    }
    public boolean yesNo() {
        System.out.println("Do you like video games? ");
        String confirm = scanner.nextLine();
        System.out.println(confirm);//return
        return confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes") || confirm.equalsIgnoreCase("sure") || confirm.equalsIgnoreCase("absolutely");
    }
    int getInt(int min, int max) {

        System.out.print("Enter number between 1 and 10: ");
        int userInput = scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("You're out of range, try again: ");

        } else {
            return userInput;
        }
        return getInt(min, max);
    }
      int getInt() {
          System.out.println("Enter another number:  ");
          int numInput = scanner.nextInt();
          return numInput;
    }
    double getDouble(double min, double max) {

        System.out.print("Enter a number : ");
        double doubleInput = scanner.nextDouble();

        if (doubleInput < min || doubleInput > max) {
            System.out.println("You're out of range, my man ");
            doubleInput = getDouble(min, max);
        }
        return doubleInput;
    }
    public double getDouble() {
        System.out.println("Enter number here: ");
        double dubInput = scanner.nextInt();
        return dubInput;

    }



}
