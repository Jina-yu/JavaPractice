package oop1.ex;

import org.w3c.dom.css.Rect;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;
        int area = rectangle.caculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.caculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);


    }
}
