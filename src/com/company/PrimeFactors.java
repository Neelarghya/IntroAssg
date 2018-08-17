package com.company;

import java.util.ArrayList;

public class PrimeFactors {
    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        if (n % 2 == 0) {
            primeFactors.add(2);
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        for (int i = 3; i < Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                n /= i;
                if (!primeFactors.contains(i)) {
                    primeFactors.add(i);
                }
            }
        }

        if (n > 2)
            primeFactors.add(n);

        return primeFactors;
    }

    public void printPrimeFactors(int n) {
        System.out.println(generate(n));
    }
}
