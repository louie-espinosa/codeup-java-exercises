package Shapes;

public class Square extends Rectangle {

    protected int side;//creating a field for side

    public Square(int side) {// inherited constructor
        super(side, side);
        this.side = side;
    }
    @Override
    public int getPerimeter() {
        return this.side * 4;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
