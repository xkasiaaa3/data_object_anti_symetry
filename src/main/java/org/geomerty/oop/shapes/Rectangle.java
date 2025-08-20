package org.geomerty.oop.shapes;

import org.geomerty.oop.Point;

public class Rectangle implements Shape{

    Point leftUp;
    Double width;
    Double height;

    public Rectangle(Point leftUp, Double width, Double height) {
        this.leftUp = leftUp;
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }

    @Override
    public Double perimeter() {
        return width *2 + height *2;
    }
}
