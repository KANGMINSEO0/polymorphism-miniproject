package com.ohgiraffers.polymorphism.vo;

public class Line extends Point{

    private float length;

    public Line() {}

    public Line(float x, float y, float length) {
        super(x, y);
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }
}
