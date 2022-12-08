package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int alfa = namber();
        int gamma = namber();

        int plus = plus(alfa,gamma);
        System.out.println(plus);

        int minus = minus(alfa,gamma);
        System.out.println(minus);

        int multipy = multipy(alfa,gamma);
        System.out.println(multipy);

        int divide = divide(alfa,gamma);
        System.out.println(divide);


    }
    public static int namber (){
        Scanner scanner = new Scanner(System.in);
        int namber = scanner.nextInt();
        return namber;
    }
    public static int plus(int a, int b){
        return a + b;
    }
    public static int minus (int a, int b){
        return a - b;
    }
    public static int multipy(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }


}