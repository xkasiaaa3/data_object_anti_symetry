package org.geomerty.oop;

public class Point {
    private Double x;
    private Double y;

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double distance(Point p1){
        return Math.sqrt(Math.pow(p1.x - this.x, 2) + Math.pow(p1.y - this.y,2));
    }
}
