public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(add(1, 2));
        System.out.println(subtract(1, 2));
        System.out.println(multiply(1, 2));
        System.out.println(divide(0, 2));
        System.out.println(modulus(1, 2));

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
       //Would like to make a number divided by 0 "undefined"
        if(g == 0 || h == 0){
            System.out.println("Bruh don't use 0");
        }
        return g / h;//also doesnt give us decimals for numbers less than one
        }
    public static int modulus (int i, int j) {
        return i % j;
    }



}
