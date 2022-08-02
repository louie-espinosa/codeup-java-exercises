public class ControlFlowExercises {
    public static void main(String[] args) {
        //ex 1.
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        //ex 2.a, b, c refactored for a, b, and c.
        int i = 2;
        do {
            System.out.println(i);
            i *= i;
        } while (i <= 1000000 && i != 0); //without setting i != 0, system infinitely prints 0.


        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:


    }
}
