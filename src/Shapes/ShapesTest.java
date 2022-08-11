package Shapes;

public class ShapesTest {

    public static void main(String[] args) {
        //create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
    Rectangle box1 = new Rectangle(5, 4);
    Rectangle box2 = new Square(5);
  // |type|  |variable| new |instance of class|

        System.out.println("Perimeter is: " + box1.getPerimeter());
        System.out.println("Area is: " + box1.getArea());
        System.out.println("Perimeter is: " + box2.getPerimeter());
        System.out.println("Area is: " + box2.getArea());
    }
}
