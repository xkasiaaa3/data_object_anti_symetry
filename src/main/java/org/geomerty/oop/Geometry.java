package org.geomerty.oop;

import org.geomerty.oop.shapes.Circle;
import org.geomerty.oop.shapes.Rectangle;
import org.geomerty.oop.shapes.Square;
import org.geomerty.oop.shapes.Triangle;

public class Geometry {

    public static void main(String[] args) {
        // TODO Implement calculation of square area using oop code. Top left: x = 2.5, y = 4.5; side = 3.0
        Square square = new Square(new Point(2.5,4.5), 3.0);
        System.out.println("Area of square is " + square.area());
        System.out.println("Perimeter of square is " + square.perimeter());
        // TODO Implement calculation of rectangle area using oop code. Top left: x = 10.0, y = 5.0; height = 4.0, width = 5.0;
        Rectangle rectangle = new Rectangle(new Point(10.0, 5.0),4.0, 5.0);
        System.out.println("Area of rectangle is " + rectangle.area());
        System.out.println("Perimeter of rectangle is " + rectangle.perimeter());
        // TODO Implement calculation of circle area using oop code. Center: x = 8.7, y = 4.0; radius = 6.3;
        Circle circle = new Circle(new Point(8.7, 4.0), 6.3);
        System.out.println("Area of circle is " + circle.area());
        System.out.println("Perimeter of circle is " + circle.perimeter());
        // TODO Triangle
        Triangle triangle = new Triangle(new Point(4.6, 4.0), 3.0, 6.0,7.0);
        System.out.println("Area of triangle is " + triangle.area());
        System.out.println("Perimeter of triangle is " + triangle.perimeter());

    }
}
