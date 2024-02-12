package com.ohgiraffers.polymorphism.vo;

public class Circle extends Point{

    private float radius;

    public Circle() {}

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
