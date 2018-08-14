package com.company;

public class astrix {
    public static void main(String Args[]){
        printAstrix();
        System.out.println();

        printLine(8);
        System.out.println();

        printTriangle(3);
        System.out.println();

        printIsoscelesTriangle(3);
        System.out.println();

        printDiamond(3);
        System.out.println();

        printDiamondWithName(5);
        System.out.println();


    }

    public static void printAstrix(){
        System.out.println("*");
    }

    public static void printLine(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i*2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDiamond(int n){
        int flag = 0;
        for (int i = 1; i > 0 && i <= n; i += ((flag == 0)? 1 : -1)) {
            if (i == n){
                flag = 1;
            }

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i*2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDiamondWithName(int n){
        int flag = 0;
        for (int i = 1; i > 0 && i <= n; i += ((flag == 0)? 1 : -1)) {
            if (i == n){
                flag = 1;
                System.out.println("Neelarghya");
            } else {

                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k < i * 2; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }



}
