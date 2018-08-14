package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        PrimeFactors primeFactors = new PrimeFactors();
        System.out.println("Enter n: ");
        int n = in .nextInt();
        System.out.println(primeFactors.generate(n));
    }
}
