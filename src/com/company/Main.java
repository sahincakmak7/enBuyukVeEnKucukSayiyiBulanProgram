package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quan, min = 0, max = 0, k = 1;

        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int piece = input.nextInt();

        while (piece >= k) {
            if (piece > 1) {
                System.out.print(k + ". sayıyı giriniz :");
                int n = input.nextInt();
                if (n > min && n > max) {
                    max = n;
                    if (min == 0) {
                        min = n;
                    }
                }
                if (n < min && n < max) {
                    min = n;
                    if (max == 0) {
                        max = n;
                    }
                }
            }
            k++;
        }
        System.out.print("En büyük sayı: " + max + "\nEn küçük sayı: " + min);
    }
}