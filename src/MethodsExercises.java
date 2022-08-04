import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println(add(1, 2));
//        System.out.println(subtract(1, 2));
//        System.out.println(multiply(1, 2));
//        System.out.println(divide(0, 2));
//        System.out.println(modulus(1, 2));

        getInteger(3, 7);//calling the bastard
    }
//ex 1. Basic Arithmetic
    //a. Create four separate methods. each will perform arithmetic operations.
    //b. needs two params.
    //c. test and verify output
    //d. add a modulus method

    public static int add (int a, int b) {
return a + b;
    }
    public static int subtract (int c, int d) {
        return c - d;
    }
    public static int multiply (int e, int f) {
        return e * f;
    }
    public static float divide (float g, float h) {
       //Would like to make divisor of 0 return "undefined"
        if(g == 0 || h == 0){
            System.out.println("Bruh, give 0 a break");
        }
        return g / h;//float to return decimals if solution is less than 1.
        }
    public static int modulus (int i, int j) {
        return i % j;
    }
//ex 2.Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range.
// If not, prompt the user to input their number again until the input is within range.







        public static int getInteger ( int min, int max)
        { //with void which does NOT use a return it will run only once, but returning the function causes it to run regardless
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: ");
            int userInput = sc.nextInt();
            if (userInput <= min || userInput >= max) {
                System.out.println("Your number is out of range, please try again: ");
            } else {
                System.out.println("Great! you chose " + userInput + " which is within the range.");
                sc.next();
            }
            return getInteger(min, max);
        }
    }

//3.Calculate the factorial of a number.



//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//
//    Factorials are denoted by the exclamation point (n!). Ex:





    // using the return value
    //int three = add(6, 3) / subtract(4, 1);




