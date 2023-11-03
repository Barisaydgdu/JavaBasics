package com.barisaydgdu.javalearning;

public class Loops {
    public static void main(String[] args) {



        // for loop


        int[] muNumbers = {12,15,18,21,24};


       // System.out.println(x);

        for (int z = 0 ; z < muNumbers.length;z++){
            int x  = muNumbers[z] / 3 * 5;
            System.out.println(x);

        }
        System.out.println("--------------");

        for (int number : muNumbers){
            int y = number *3 ;
            System.out.println(y);
        }
        System.out.println("--------------");
        for (int a = 0 ; a<5;a++){
            int b = a * 5;
            System.out.println(b);
        }
        System.out.println("--------------");


        // while


        int j = 0;
        while (j<3){
            int m = j * 5;
            System.out.println(m);
            j++;
        }
        System.out.println("--------------");
    }
}
