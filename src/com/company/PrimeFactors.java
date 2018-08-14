package com.company;

import java.util.ArrayList;

public class PrimeFactors {
    public PrimeFactors() {

    }

    private ArrayList<Integer> generate(int n){
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2 ; i <= Math.ceil(Math.sqrt(n)) ; i++){
            if (generate(i).size() == 1 && n % i == 0){
                primeFactors.add(i);
            }
        }

        return primeFactors;
    }


}
