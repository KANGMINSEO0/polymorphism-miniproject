package com.ohgiraffers.polymorphism.vo;

import java.util.Scanner;

public class Triangle extends Point{

    private float perimeter;
    private int area;
    private int[][] arr;

    public Triangle() {}

    public Triangle(int x, int y, int perimeter, int area, int[][] arr) {
        super(x, y);
        this.perimeter = perimeter;
        this.area = area;
        this.arr = arr;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
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
        return "Triangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    public float trianglePerimeter(int[][] arr) {
        this.arr = arr;
        float length1 = (float) Math.sqrt((arr[0][0] - arr[1][0])^2 + (arr[0][1] - arr[1][1])^2);
        float length2 = (float) Math.sqrt((arr[1][0] - arr[2][0])^2 + (arr[1][1] - arr[2][1])^2);
        float length3 = (float) Math.sqrt((arr[2][0] - arr[0][0])^2 + (arr[2][1] - arr[0][1])^2);
        float perimeter = length1 + length2 + length3;

        return perimeter;
    }

    public int triangleArea(int[][] arr) {
        int firstLine = arr[0][0]*arr[1][1] + arr[1][0]*arr[2][1] + arr[2][0]*arr[0][1];
        int secondLine = arr[0][1]*arr[1][0] + arr[1][1]*arr[2][0] + arr[2][1]*arr[0][0];
        int area = Math.abs((firstLine - secondLine)/2);
        return area;
    }

    @Override
    public void printOutput() {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] arrLine = new int[n][2];
        int[][] arrLineInt = new int[n][2];
        for (int i = 0; i < n; i++) {
            int k = i+1;
            System.out.print("p" + k + " x : ");
            arrLine[i][0] = sc.nextInt();
            System.out.println();
            System.out.print("p" + k + " y : ");
            arrLine[i][1] = sc.nextInt();
//            arrLineInt[i][0] = Integer.parseInt(arrLine[i][0]);
//            arrLineInt[i][1] = Integer.parseInt(arrLine[i][1]);
            System.out.println();
        }

        System.out.println("입력하신 좌표는 p1 : " + arrLine[0][0]+ ", " + arrLine[0][1]
                + " , p2 : " + arrLine[1][0] + ", " + arrLine[1][1]
                + " , p3 : " + arrLine[2][0] + ", " + arrLine[2][1] +" 입니다. ");
        System.out.println("둘레 : " + triangle.trianglePerimeter(arrLineInt));
        System.out.println("넓이 : " + triangle.triangleArea(arrLineInt));

    }
}
