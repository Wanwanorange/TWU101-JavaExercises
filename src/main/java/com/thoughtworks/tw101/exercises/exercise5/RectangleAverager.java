package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int numberOfRects = rectangles.length;
        int sumArea = 0;

        for (int i = 0; i < numberOfRects; i++) {
            sumArea += rectangles[i].area();
        }

        return sumArea/numberOfRects;
    }
}
