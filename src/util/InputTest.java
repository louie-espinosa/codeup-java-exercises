package util;

public class InputTest {

    public static void main(String[] args) {
        Input gave = new Input();
        System.out.print("Who is your fave FF Summon/Esper/Eidolon/GF/Aeon/Primal/Avatar? ");
        //Their input
        gave.getString();
        System.out.println("Do you like video games? ");
        System.out.println("Maury says: " + gave.yesNo(""));

        System.out.print("Enter an int: ");
        System.out.println("Bingo, " + gave.getInt(2, 8, "") + " was in the range");//an empty string as placeholder to satisfy the three parameters
        System.out.println("Give me some PI: ");
        System.out.println(gave.getDouble(3.1, 3.142));

    }
}
