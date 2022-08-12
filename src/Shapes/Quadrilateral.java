package Shapes;

public abstract class Quadrilateral implements Measurable {

    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract void setLength(int length);
       // this.length = length

    public abstract void setWidth(int width);
      //this.width = width;
}


//4. Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable. This class should have:
//
//        protected properties for length and width.
//        a constructor that accepts two numbers for the length and width and sets those properties.
//        methods for getting the length and width.
//        abstract methods for setting the length and width.


