package com.company;

public class Triangle {

    int n;

    public Triangle(int n) {
        this.n = n;
    }

    public void printAstrix(){
        System.out.println("*");
    }

    public void printHorizontalLine(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printVerticalLine(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public void printRightTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
