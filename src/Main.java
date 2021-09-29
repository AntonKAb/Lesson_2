package com.company;

import java.util.ArrayList;
import java.awt.*;

public class Main {
    public static void main(String[] args){



        Circle circle = new Circle(4);
          System.out.println(circle.area());
          System.out.println(circle.perimeter());
          circle.info();

        Circle square = new Square(4);
          System.out.println(square.area());
          System.out.println(square.perimeter());
          square.info();

        Circle rectangle = new Rectangle(4,5);
          System.out.println(rectangle.area());
          System.out.println(rectangle.perimeter());
          rectangle.info();

        ArrayList<Circle> figures = new ArrayList<com.company.Circle>();
        figures.add(circle);
        figures.add(square);
        figures.add(rectangle);
        for (Circle figure : figures) {
            System.out.println(figure.area());
            System.out.println(figure.perimeter());
            figure.info();
        }
    }
}
