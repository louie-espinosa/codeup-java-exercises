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

        System.out.print("Find the number between 1 and 10: ");
        int userInput = scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("You're out of range, son ");

        } else {
            return userInput;
        }
        return getInt(min, max);
    }
      int getInt() {
          System.out.println("How young are you? ");
          int numInput = scanner.nextInt();
          return numInput;
    }
    int getDouble(double min, double max) {

        System.out.print("Give me some Pi : ");
        int doubleInput = scanner.nextInt();

        if (doubleInput < min || doubleInput > max) {
            System.out.println("You're out of range, my man ");

        } else {
            return doubleInput;
        }
        return getDouble(min, max);
    }
//    double getDouble() {
//
//        return
//    }



}
