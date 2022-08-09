package util;

public class InputTest {

    public static void main(String[] args) {
        Input gave = new Input();

        gave.getString();
        System.out.println(gave.yesNo());
        System.out.println("Bingo " + gave.getInt(2, 8) + " was in the range");
        gave.getInt();
        System.out.println(gave.getDouble(3.1, 3.142));
    }
}
