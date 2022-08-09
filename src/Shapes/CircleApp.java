package Shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        //prompt user for a radius, but our Input will call the prompt from getDouble as well.
       System.out.println("Enter a radius for your circle");
        //Import the Input class methods that includes a nifty scanner to get the radius and use it to calculate the circumference
        // and area of a circle
        Input radiusInput = new Input();

        //Import getDouble method which prompts for a number input and stores in variables.
        double radiusGot = radiusInput.getDouble();


        //create a circle object using the Circle class
        Circle yourCircle = new Circle(radiusGot);

        //call method to calc circum of circle and print result
        System.out.println("your circumference is " + yourCircle.getCircumference());

        //call method to calc area of circle and print result
        System.out.println("Your area is " + yourCircle.getArea());

    }

}
