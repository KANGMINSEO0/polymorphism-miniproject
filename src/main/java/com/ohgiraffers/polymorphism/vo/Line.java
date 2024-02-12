package com.ohgiraffers.polymorphism.vo;

import java.util.Scanner;

public class Line extends Point{

    private float length;

    public Line() {}

    public Line(int x, int y, float length) {
        super(x, y);
        this.length = length;
    }

    public float getLength() {
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

    public float lineLength(int[][] arr) {

        length  = (float) Math.sqrt((arr[0][0] - arr[1][0])^2 + (arr[0][1] - arr[1][1])^2);
        return length;
    }


    @Override
    public void printOutput() {
        Scanner sc = new Scanner(System.in);
        Line line = new Line();
        int n = 2;
//        int a = 3;
//        int b = 2;
        String[][] arrLine = new String[n][2];
        int[][] arrLineInt = new int[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("p" + i + 1 + " x : ");
            arrLine[i][0] = sc.next();
            System.out.println();
            System.out.print("p" + i + 1 + " y : ");
            arrLine[i][1] = sc.next();
            arrLineInt[i][0] = Integer.parseInt(arrLine[i][0]);
            arrLineInt[i][1] = Integer.parseInt(arrLine[i][1]);
            System.out.println();
        }

        line.lineLength(arrLineInt);
        System.out.println("입력하신 좌표는 p1 : " + arrLine[0][0] + ", " + arrLine[0][1] + " 과(와) p2 : " + arrLine[1][0] + ", " + arrLine[1][1] + " 입니다. ");
        System.out.println("길이 : " + line.lineLength(arrLineInt));
    }
}
