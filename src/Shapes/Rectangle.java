package Shapes;

import static java.lang.Math.PI;

//5. Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
//
//        IntelliJ can automatically create the skeleton of all the methods that need to be implemented.
//
public class Rectangle extends Quadrilateral {
    public Rectangle(int length, int width) {
        super(length, width);
    }
    //field is inherited?

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        int perimeter = (length*2) + (length*2);
        return perimeter;
    }

    @Override
    public double getArea() {
        int area = length * width;
        return area;
    }
}
