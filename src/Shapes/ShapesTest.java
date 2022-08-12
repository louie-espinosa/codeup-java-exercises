package Shapes;

public class ShapesTest {

    public static void main(String[] args) {


// exercises for  Interfaces and Abstract Classes
//7. Modify your ShapesTest class, use it to:
// Declare a variable of the type Measurable named myShape.
// Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.
        //for the rectangle
        Measurable myShape = new Rectangle(4, 5);
        System.out.println("Perimeter of rec is: " + myShape.getPerimeter());
        System.out.println("Area of rec is: " + myShape.getArea());

        //for the square
        myShape = new Square(5, 5);
        System.out.println("Perimeter of square is: " + myShape.getPerimeter());
        System.out.println("Area of square is: " + myShape.getArea());





        //create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//    Rectangle box1 = new Rectangle(5, 4);
//    Rectangle box2 = new Square(5);
//  // |type|  |variable| new |instance of class|
//
//        System.out.println("Perimeter is: " + box1.getPerimeter());
//        System.out.println("Area is: " + box1.getArea());
//        System.out.println("Perimeter is: " + box2.getPerimeter());
//        System.out.println("Area is: " + box2.getArea());
    }
}
