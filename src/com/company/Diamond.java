package com.company;

public class Diamond {

    public void printIsoscelesTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printDiamond(int n) {
        int flag = 0;
        for (int i = 1; i > 0 && i <= n; i += ((flag == 0) ? 1 : -1)) {
            if (i == n) {
                flag = 1;
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printDiamondWithName(int n) {
        int flag = 0;
        for (int i = 1; i > 0 && i <= n; i += ((flag == 0) ? 1 : -1)) {
            if (i == n) {
                flag = 1;
                System.out.print("Neelarghya");
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
