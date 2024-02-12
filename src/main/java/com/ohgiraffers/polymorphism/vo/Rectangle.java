package com.ohgiraffers.polymorphism.vo;

import java.util.Arrays;
import java.util.Scanner;

public class Rectangle extends Point{

    private double perimeter;
    private double area;
    private double[][] arr;


    public Rectangle() {}

    public Rectangle(int x, int y, double perimeter, double area, double[][] arr) {
        super(x, y);
        this.perimeter = perimeter;
        this.area = area;
        this.arr = arr;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
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
        return "Rectangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
    public double rectPerimeter(int height, double[][] arr) {
        Line line = new Line();
        double width  = line.lineLength(arr);
        perimeter = 2*(width + height);
        return perimeter;
    }
    public double rectArea(int height, double[][] arr) {
        Line line = new Line();
        double width  = line.lineLength(arr);
        System.out.println("width = " + width);
        area = width * height;
        System.out.println("height = " + height);
        return area;
    }

    @Override
    public void printOutput()  {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        /* 사각형의 경우 좌표 2개와 높이 */
        int n = 2;
        double[][] arrLine = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("p" + i + 1 + " x : ");
            arrLine[i][0] = sc.nextInt();
            System.out.print("p" + i + 1 + " y : ");
            arrLine[i][1] = sc.nextInt();
            System.out.println();
        }
        System.out.print("높이 : ");
        int height = sc.nextInt();

        System.out.println("입력하신 좌표는 p1 : " + arrLine[0][0]+ ", " + arrLine[0][1]
                + " , p2 : " + arrLine[1][0] + ", " + arrLine[1][1] + "이고 높이는 " + height + " 입니다. ");
        System.out.println("둘레 : " + rectangle.rectPerimeter(height, arrLine));
        System.out.println("넓이 : " + rectangle.rectArea(height, arrLine));

    }
}
