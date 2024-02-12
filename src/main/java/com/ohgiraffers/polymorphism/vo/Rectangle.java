package com.ohgiraffers.polymorphism.vo;

import java.util.Arrays;
import java.util.Scanner;

public class Rectangle extends Point{

    private int perimeter;
    private int area;
    private int[][] arr;


    public Rectangle() {}

    public Rectangle(int x, int y, int perimeter, int area, int[][] arr) {
        super(x, y);
        this.perimeter = perimeter;
        this.area = area;
        this.arr = arr;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public void printOutput()  {
        Scanner sc = new Scanner(System.in);
        int n = 4;
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

        System.out.println("입력하신 좌표는 p1 : " + arrLine[0][0]+ ", " + arrLine[0][1]
                + " , p2 : " + arrLine[1][0] + ", " + arrLine[1][1]
                + " , p3 : " + arrLine[2][0] + ", " + arrLine[2][1]
                + " , p4 : " + arrLine[3][0] + ", " + arrLine[3][1] +" 입니다. ");
        System.out.println("둘레 : ");
        System.out.println("넓이 : ");

    }
}
