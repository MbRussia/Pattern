package com.company.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList();
        List<Shape> cloneShapes = new ArrayList();
        for (int i = 0; i < 10; i++) {

            Rectangle r = new Rectangle();
            Circle c = new Circle();

            c.setX(i + 5);
            c.setY(i + 7);
            c.setColor("red");
            c.setR(i + 10);

            shapes.add(c);

            r.setX(i + 5);
            r.setY(i + 7);
            r.setColor("red");
            r.setH(i + 100);
            r.setW(i + 200);

            shapes.add(r);

        }
        for (int i = 0; i <shapes.size(); i++) {
            cloneShapes.add(shapes.get(i).clone());

        }
        for (int i = 0; i <shapes.size() ; i++) {
            System.out.println(shapes.get(i));
            System.out.println(cloneShapes.get(i));
        }
        //System.out.println(shapes.toString()+"\n");

    }
}
