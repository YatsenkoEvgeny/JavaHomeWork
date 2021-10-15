package com.pb.yatsenko.hm2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        x = sc.nextInt();
        if (x > -1 && x < 15) {
            System.out.println("Промежуток [0-14]");}
        if (x>14 && x<36) {
            System.out.println("Промежуток [15-35]");
        }
        if (x>35 && x<51) {
            System.out.println("Промежуток [36-50]");}
        if (x>50 && x<101) {
            System.out.println("Промежуток [51-100]");}
        if (x>100 || x<0) {
            System.out.println("Мимо! Введенное число не попадает ни в один из имеющихся промежутков");
        }



        }
    }


