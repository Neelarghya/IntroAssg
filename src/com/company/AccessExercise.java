package com.company;

import java.util.Scanner;

public class AccessExercise {
    private Triangle triangle;
    private Diamond diamond;
    private FizzBuzz fizzBuzz;
    private PrimeFactors primeFactors;

    public AccessExercise() {
        triangle = new Triangle();
        diamond = new Diamond();
        fizzBuzz = new FizzBuzz();
        primeFactors = new PrimeFactors();
    }

    public void chooseExercise(){
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nEnter the exercise you would like to view:\n1 for Triangle\n2 for Diamond\n3 for FizzBuzz\n4 for Prime Factors\n0 to Exit");
            choice = in.nextInt();
            int n;
            switch(choice){
                case 1:
                    System.out.println("Astrix:");
                    triangle.printAstrix();

                    System.out.println("\nHorizontal Line:\nEnter n: ");
                    n = in.nextInt();
                    triangle.printHorizontalLine(n);

                    System.out.println("\nVertical Line:\nEnter n: ");
                    n = in.nextInt();
                    triangle.printVerticalLine(n);

                    System.out.println("\nRight Triangle:\nEnter n: ");
                    n = in.nextInt();
                    triangle.printRightTriangle(n);
                    break;

                case 2:
                    System.out.println("\nIsosceles Triangle:\nEnter n: ");
                    n = in.nextInt();
                    diamond.printIsoscelesTriangle(n);

                    System.out.println("\nDiamond:\nEnter n: ");
                    n = in.nextInt();
                    diamond.printDiamond(n);

                    System.out.println("\nDiamond with Name:\nEnter n: ");
                    n = in.nextInt();
                    diamond.printDiamondWithName(n);
                    break;

                case 3:
                    System.out.println("\nFizz Buzz Exercise:\n");
                    fizzBuzz.runFizzBuzz();
                    break;

                case 4:
                    System.out.println("Enter the number whose Prime factors you want to generate: ");
                    n = in.nextInt();
                    primeFactors.printPrimeFactors(n);
                    break;

                case 0:
                    System.out.println("Bye...");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again");
                    break;
            }
        }while(choice != 0);
    }
}
