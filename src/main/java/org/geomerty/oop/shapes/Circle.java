package org.geomerty.oop.shapes;

import org.geomerty.oop.Point;

import static java.lang.Math.PI;

public class Circle implements Shape{

    Point center;
    Double radius;

    public Circle(Point center, Double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public Double area() {
        return  PI * radius * radius;
    }
}
