package com.example.generics.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

    public static void drawAll(List<? extends Shape> shapes) {
        for(Shape shape : shapes) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
    List<Rectangle> rectangles = new ArrayList<>();
    rectangles.add(new Rectangle());
    drawAll(rectangles);
    }
}