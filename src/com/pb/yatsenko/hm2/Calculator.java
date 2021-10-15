
package com.pb.yatsenko.hm2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        String sign;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        operand1 = scan.nextInt();
        System.out.println("Введите знак для действия");
        System.out.println("Введите + для сложения");
        System.out.println("Введите - для вычитания");
        System.out.println("Введите * для умножения");
        System.out.println("Введите / для деления");
        sign = scan.next();
        System.out.println("Введите второе целое число");
        operand2 = scan.nextInt();

        switch (sign){
            case "+" :
                System.out.println(operand1 + operand2);
                break;

            case "-" :
                System.out.println(operand1 - operand2 );
                break;

            case "*" :
                System.out.println(operand1 * operand2);
                break;


            case "/" :
                if (operand2 ==0){
                System.out.println("Ошибка. На ноль делить нельзя." );
                } else {
                    System.out.print(operand1 / operand2);
                }
                break;


    }

}}