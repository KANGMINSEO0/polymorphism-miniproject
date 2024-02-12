package com.ohgiraffers.polymorphism.view;

import com.ohgiraffers.polymorphism.vo.*;

import java.util.Scanner;

public class Menu {

    Point point1 = new Point();
    Point point2 = new Line();
    Point point3 = new Triangle();
    Point point4 = new Circle();
    Point point5 = new Rectangle();


    public void mainMenu() {
        while (true) {
            Menu menu = new Menu();
            Scanner sc = new Scanner(System.in);
            System.out.println("===== 프로그램 메뉴 =====");
            System.out.println("1. 점");
            System.out.println("2. 선");
            System.out.println("3. 면");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int num = sc.nextInt();
            switch (num) {

                case 1:
                    point1.printOutput();
                    break;
                case 2:
                    point2.printOutput();
                    break;
                case 3:
                    menu.surfaceMenu();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("잘 못 입력하셨습니다. ");
                    break;
            }
            if (num == 9) {
                System.out.println("프로그램을 종료합니다.");
                break;

            }
        }
    }

    public void surfaceMenu() {

        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        System.out.println("===== 면 메뉴 =====");
        System.out.println("1. 삼각형");
        System.out.println("2. 사각형");
        System.out.println("3. 원");
        System.out.println("4. 메인 메뉴로 돌아가기");
        System.out.print("면 메뉴 선택 : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                menu.triangleMenu();
                break;
            case 2:
                menu.rectangleMenu();
                break;
            case 3:
                menu.circleMenu();
                break;
            case 4:
                menu.mainMenu();
                break;
            default:
                System.out.println("잘 못 입력하셨습니다. 메인메뉴로 돌아갑니다. ");
                break;
        }


    }

    public void triangleMenu() {
        System.out.println("===== 삼각형 =====");
        point3.printOutput();
    }

    public void rectangleMenu() {
        System.out.println("===== 사각형 =====");
        point5.printOutput();

    }

    public void circleMenu() {
        System.out.println("====== 원 ======");
        point4.printOutput();
    }


}
