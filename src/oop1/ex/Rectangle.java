package oop1.ex;

public class Rectangle {
    int width ;
    int height;

    int caculateArea() {
        return width * height;
    }

    int caculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
