package org.geomerty.oop.shapes;

import org.geomerty.oop.Point;

public class Triangle implements Shape{

    Point vertexA;
    Double ab;
    Double bc;
    Double ca;

    public Triangle(Point vertexA, Double ab, Double bc, Double ca) {
        this.vertexA = vertexA;
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
    }

    @Override
    public Double area() {
        Double s = (ab +bc +ca)/2;
        return Math.sqrt(s*(s-ab)*(s-bc)*(s-ca));
    }

    @Override
    public Double perimeter() {
        return ab + bc + ca;
    }
}
