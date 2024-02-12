package com.ohgiraffers.polymorphism.vo;

import java.util.Scanner;

public class Triangle extends Point{

    private double perimeter;
    private double area;
    private double[][] arr;

    public Triangle() {}

    public Triangle(int x, int y, double perimeter, double area, double[][] arr) {
        super(x, y);
        this.perimeter = perimeter;
        this.area = area;
        this.arr = arr;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double[][] getArr() {
        return arr;
    }

    public void setArr(double[][] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    public double trianglePerimeter(double[][] arr) {
        double length1 = Math.sqrt((Math.pow((arr[0][0] - arr[1][0]), 2) + (Math.pow((arr[0][1] - arr[1][1]), 2))));
        double length2 = Math.sqrt((Math.pow((arr[1][0] - arr[2][0]), 2) + (Math.pow((arr[1][1] - arr[2][1]), 2))));
        double length3 = Math.sqrt((Math.pow((arr[2][0] - arr[0][0]), 2) + (Math.pow((arr[2][1] - arr[0][1]), 2))));
        perimeter = length1 + length2 + length3;

        return perimeter;
    }

    public double triangleArea(double[][] arr) {
        /* 헤론공식을 이용하여 삼각형 넓이 계산*/
        double firstLine = arr[0][0]*arr[1][1] + arr[1][0]*arr[2][1] + arr[2][0]*arr[0][1];
        double secondLine = arr[0][1]*arr[1][0] + arr[1][1]*arr[2][0] + arr[2][1]*arr[0][0];
        double sum;
        if ((firstLine - secondLine) < 0) {
            sum = (firstLine - secondLine) * (-1);
        } else {
            sum = firstLine - secondLine;
        }
        area = sum/2;
        return area;
    }

    @Override
    public void printOutput() {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        int n = 3;
        double[][] arrLine = new double[n][2];
        for (int i = 0; i < n; i++) {
            int k = i+1;
            System.out.print("p" + k + " x : ");
            arrLine[i][0] = sc.nextInt();
            System.out.print("p" + k + " y : ");
            arrLine[i][1] = sc.nextInt();
            System.out.println();
        }

        System.out.println("입력하신 좌표는 p1 : " + arrLine[0][0]+ ", " + arrLine[0][1]
                + " , p2 : " + arrLine[1][0] + ", " + arrLine[1][1]
                + " , p3 : " + arrLine[2][0] + ", " + arrLine[2][1] +" 입니다. ");
        System.out.println("둘레 : " + triangle.trianglePerimeter(arrLine));
        System.out.println("넓이 : " + triangle.triangleArea(arrLine));

    }
}
