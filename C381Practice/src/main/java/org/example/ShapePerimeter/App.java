package org.example.ShapePerimeter;

public class App {
    public static void main(String[] args) {
        //test points
        Point p10 = new Point(0,0);
        Point p11 = new Point(0,2);
        Point p12 = new Point(2,2);
        Point p13 = new Point(2,0);

        double distance = 0.0;
        distance = CalcPerim(p10,p11);
        distance += CalcPerim(p11,p12);
        distance += CalcPerim(p12,p13);
        distance += CalcPerim(p13,p10);

        System.out.println("The perimeter of the shape is: " + String.format("%.2f", distance));

        Point p1 = new Point(1,1);
        Point p2 = new Point(2,4);
        Point p3 = new Point(4,4);
        Point p4 = new Point(3,4);
        Point p5 = new Point(4,1);
        Point p6 = new Point(3,0);


        distance = 0.0;
        distance = CalcPerim(p1, p2);
        distance += CalcPerim(p2, p3);
        distance += CalcPerim(p3, p4);
        distance += CalcPerim(p4, p5);
        distance += CalcPerim(p5, p6);
        distance += CalcPerim(p6, p1);

        System.out.println("The perimeter of the shape is: " + String.format("%.2f", distance));

    }

    public static double CalcPerim(Point p1, Point p2) {
        double distance = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()),2));
        System.out.println(distance);
        return distance;
    }
}
