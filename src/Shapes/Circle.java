package Shapes;

import static java.lang.Math.PI;

public class Circle {

    private double radius; //field


        public Circle(double radius) {//constructor
            this.radius = radius;

    }

   public double getArea() {
       double area = PI * (radius * radius);
       return area;
   }


    public double getCircumference() {
 //declare and assign
        //imported java.lang.Math.PI
       double circumference = 2 * PI * radius;
       return circumference;
    }


}
