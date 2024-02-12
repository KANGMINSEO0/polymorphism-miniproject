package com.ohgiraffers.polymorphism.vo;

import java.util.Scanner;

public class Line extends Point{

    private double length;

    public Line() {}

    public Line(int x, int y, double length) {
        super(x, y);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }

    public double lineLength(double[][] arr) {
        length  = Math.sqrt((Math.pow((arr[0][0] - arr[1][0]), 2) + (Math.pow((arr[0][1] - arr[1][1]), 2))));
        return length;
    }


    @Override
    public void printOutput() {
        Scanner sc = new Scanner(System.in);
        Line line = new Line();
        int n = 2;
        double[][] arrLine = new double[n][2];
        for (int i = 0; i < n; i++) {
            int k = i+1;
            System.out.print("p" + k + " x : ");
            arrLine[i][0] = sc.nextInt();
            System.out.print("p" + k + " y : ");
            arrLine[i][1] = sc.nextInt();
            System.out.println();
        }

        System.out.println("입력하신 좌표는 p1 : " + arrLine[0][0] + ", " + arrLine[0][1] + " 과(와) p2 : " + arrLine[1][0] + ", " + arrLine[1][1] + " 입니다. ");
        System.out.println("길이 : " + line.lineLength(arrLine));
    }
}
