package com.company;

public class FizzBuzz {
    public FizzBuzz() {

    }

    public void runFizzBuzz(){
        for (int i = 1 ; i <= 100 ; i++){
            if (i % 3 == 0){
                System.out.print("Fizz");
            }
            if (i % 5 == 0){
                System.out.print("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
