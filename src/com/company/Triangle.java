package com.company;

public class Triangle {

    int n;

    public Triangle(int n) {
        this.n = n;
    }

    private void printAstrix(){
        System.out.println("*");
    }

    private void printHorizontalLine(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private void printVerticalLine(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    private void printRightTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
