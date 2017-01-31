package com.epam.cdp.java_testng.iryna_lasotskaya.task1;

/**
 * Created by Дима on 29.01.2017.
 */

public class Main {



    public static void main(String[] args) {

        int[] mas1 = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Исходный массив : ");
        for (int j = 0; j < mas1.length; j++) {

            System.out.print(mas1[j] + " ");

        }

        // System.out.println("первый элемент массива " + mas1[0]);
        // System.out.println("последний элемент массива " + mas1[20]);
        int MaxNegative;
        MaxNegative = mas1[0];
        int MinPositive = mas1[11];
        int mas3[] = mas1;
        System.out.print("Измененный массив : ");
        for (int h = 0; h < mas3.length; h++) {
            mas3[0] = MinPositive;
            mas3[11] = MaxNegative;
            System.out.print(mas3[h] + " ");
        }
    }
}


