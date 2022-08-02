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
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) { //booleans look for ==, or ===
                System.out.println("FizzBuzz"); //refactored so that it checks for FizzBuzz first. otherwise                                fizz will be prioritized and printed instead of fizzbuzz
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
//        For the multiples of five: print “Buzz”.

//        For numbers which are multiples of both three and five: print “FizzBuzz”.


        }
    }
}
