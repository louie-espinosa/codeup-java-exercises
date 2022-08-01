import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class HelloWorld {
    //Attempting to change from main to other named method will break it and it wont run
    public static void main(String[] args) {
    //  System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.print("World!"); //no new line here, rather, without "ln" (line) it will concatenate
        int myFavoriteNumber = 21;
        System.out.println("\n" + myFavoriteNumber);
        String myString = "I'm acting like it's all copacetic it's so pathetic, so juvenile";
        //String myString = 'A'; //When using a char as the value rather than a string it does not meet 'Required type: String'
        //String myString = 3.15159;//when assigning 3.14 I get an error for wrong data type. Requires String, but it got double.
        System.out.println(myString);
        //long myNumber; //System.out.println(myNumber); //'var myNumber not initialized'
        //long myNumber = 3.14;//'required long, but provided double'
        //long myNumber = 123L;
        //System.out.println(myNumber);
        //myNumber = 123;
        //System.out.println(myNumber);
        //float myNumber = 3.14;//Requires float but got double.
        float myNumber = (float) 3.14;
        System.out.println(myNumber);

        //int x = 5;
        //System.out.println(x++); prints 5
        //System.out.println(x);  prints 6 (post increment)
        //int x = 5;
        //System.out.println(++x); //prints 6 (pre increment)
        //System.out.println(x);  //prints 6

        //String class = "This is busted";//not a statement
        //String theNumberThree = "three";
        //Object o = theNumberThree;
        //int three = (int) o;
        //System.out.println(three);//ClassCastException: String cannot be cast to class Integer
        //int three = (int) "three"; //Incompatible types: String can't be converted to int.
//        int x = 4;
//        //x = x + 5;
//        x += 5;
        //System.out.println(x);//prints 9

//        int x = 3;
//        int y = 4;
//        //y = y * x;
//        y *= x;
//        System.out.println(y);//prints 12

        int x = 10;
        int y = 2;
        //x = x / y;
        x /= y;
        //y = y - x;
        y -= x;
        System.out.println(x);//prints 5
        System.out.println(y);//prints -3

        //byte testNum = 1000; //value is too large for declared data type. I provided a value for int, but declared with data type byte. Possible lossy conversion from int to byte

        byte limit = 127;
        System.out.println(++limit);//I incremented past the memory limit of the data type, and it returned to its extreme other end: byte -128 to 127.

    }
}
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//Answer here:

//        9.Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//1. We can cast to float
//2. We can
