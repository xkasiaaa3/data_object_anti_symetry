package org.geomerty.oop.shapes;

import org.geomerty.oop.Point;

public class Square implements Shape{

    Point leftUp;
    Double side;

    public Square(Point leftUp, Double side) {
        this.leftUp = leftUp;
        this.side = side;
    }

    @Override
    public Double area() {
        return side*side;
    }

    @Override
    public Double perimeter() {
        return side *4;
    }
}
