package Shapes;

import static java.lang.Math.PI;

public class Rectangle {

    protected int length; //field
    protected int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //perimeter = 2 x length + 2 x width
    //area = length x width
    public int getPerimeter() {
        //declare and assign
        int perimeter = (2*length) + (2*width);
        return perimeter;
    }
    public int getArea() {
        int area = length * width;
        return area;
    }

}
