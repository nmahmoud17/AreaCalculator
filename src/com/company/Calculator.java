package com.company;

public class Calculator {

    private int width;
    private int height;

    public void setWidth (int recWidth) {
        width = recWidth;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int recHeight) {
        height = recHeight;
    }

    public int getHeight() {
        return height;
    }

    public  int calculateArea(int height, int width) {
        int area = height * width;
        return area;
    }


}
