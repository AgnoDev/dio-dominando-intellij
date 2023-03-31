package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Primeiro nº");
        a = scanner.nextInt();
        System.out.println("Segundo nº");
        b = scanner.nextInt();

        int soma = soma(a, b);
        int sub = sub(a, b);
        int multi = mult(a, b);
        double div = div(a, b);

        System.out.println("soma " + soma);
        System.out.println("sub " + sub);
        System.out.println("mult " + multi);
        System.out.println("div " + div);

    }
    public static int soma(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mult(int a, int b){
        return a*b;
    }
    public static double div(double a, double b){
        return a/b;
    }
}
