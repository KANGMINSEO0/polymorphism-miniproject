package com.ohgiraffers.polymorphism.vo;

import java.awt.geom.Area;
import java.util.Scanner;

public class Circle extends Point{

    private int radius;
    private float area;
    private float circum;

    public Circle() {}

    public Circle(int x, int y, int radius, float area, float circum) {
        super(x, y);
        this.radius = radius;
        this.area = area;
        this.circum = circum;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getCircum() {
        return circum;
    }

    public void setCircum(float circum) {
        this.circum = circum;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", circum=" + circum +
                '}';
    }

    public float circum(int radius) {
        circum = (float) (2 * Math.PI *radius);
        return circum;
    }

    public float circleArea(int radius) {
        area = (float) (Math.PI*((radius)^2));
        return area;
    }

    @Override
    public void printOutput() {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print(" 중심의 x 좌표 : ");
        int x = sc.nextInt();
        System.out.print(" 중심의 y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("반지름 : ");
        radius = sc.nextInt();
        System.out.println("입력하신 원의 중심의 좌표는 " + x + ", " + y + "이고 반지름은 " + radius + " 입니다." );
        System.out.println("둘레 : " + circle.circum(radius));
        System.out.println("넓이 : " + circle.circleArea(radius));

    }

}
