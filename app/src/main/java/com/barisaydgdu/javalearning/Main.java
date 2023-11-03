package com.barisaydgdu.javalearning;

public class Main {

    public static void Variables(String[] args) {

        // Variables

        int age = 20;

        System.out.println("Yaşın 10 katı = " + 10 * age);

        System.out.println("Yaşın 5 e bölümü = " + age / 5);

        int x = 5;
        int y = 10;

        System.out.println(y / x);


        // Double - Float

        double z = 5.0;
        double a = 11.0;

        System.out.println(a / z);


        double pi = 3.14;
        int r = 5;

        System.out.println(2 * r * pi);


        String name = "james";
        String surname = "Hetfield";

        String fullname = name + " " + surname;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);


        // Boolean


        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);


        // Final

        final int myInt = 5;

        System.out.println("myInteger is " + myInt);
        //myInt =4;

        System.out.println("myInteger is " + myInt);


    }
}
