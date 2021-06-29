package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingre un factor");
        Integer input1 = scanner.nextInt();
        ex3(input1);
    }

    private static void ex1(Integer input){
        int count = 0;
        while(count < input){
            count+=2;
            System.out.print(count + ", ");
        }
    }

    private static void ex2(Integer factor, Integer n){
        int count = 0;
        int multiplos = 0;
        if(factor != 0){
            while (multiplos < n){
                count++;
                if(count%factor==0){
                    System.out.print(count + ", ");
                    multiplos++;
                }
            }

        }
    }

    private static void ex3(Integer n){
        int count = 2;
        boolean esPrimo = true;
        while(esPrimo && count!=n){
            if(n%count == 0){
                esPrimo=true;
                count++;
            }
        }
        System.out.println("primo");
    }
}
