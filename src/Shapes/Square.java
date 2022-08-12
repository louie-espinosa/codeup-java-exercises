package Shapes;

//6. Change your existing Square class to extend Quadrilateral.
public class Square extends Quadrilateral {


    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
    this.length = length;
    this.width = length;
    }

    @Override
    public void setWidth(int width) {
       this.width = width;
       this.length = width;
    }

    @Override
    public double getPerimeter() {
        int perimeterOfSquare = length * 4;
        return perimeterOfSquare;
    }

    @Override
    public double getArea() {
        int areaOfSquare = length * width;
        return areaOfSquare;
    }
}
