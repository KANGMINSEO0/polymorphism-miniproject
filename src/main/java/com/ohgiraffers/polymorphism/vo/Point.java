package com.ohgiraffers.polymorphism.vo;

import java.util.Scanner;

public class Point {

    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void printOutput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("x :  ");
        x = sc.nextInt();
        System.out.print("y :  ");
        y = sc.nextInt();
        System.out.println("입력하신 좌표는 (" + x + ", " + y + ") 입니다.");
    }
}
