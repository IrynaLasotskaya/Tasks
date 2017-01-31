package com.epam.cdp.java_testng.iryna_lasotskaya.task2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        String theLongest;
        String theShortest;
        Integer maxLength;
        Integer minLength;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1 строку: ");
        String a = in.nextLine();
        System.out.print("Введите 2 строку: ");
        String b = in.nextLine();
        maxLength = Integer.valueOf(a.length());
        theLongest = a;
        maxLength = Integer.valueOf(b.length());
        theLongest = b;
        minLength = Integer.valueOf(a.length());
        theShortest = a;
        minLength = Integer.valueOf(b.length());
        theShortest = b;
        if (a.length() > b.length()) {
            maxLength = Integer.valueOf(a.length());
            theLongest = a;

        }

        if (a.length() < b.length()) {
            minLength = Integer.valueOf(a.length());
            theShortest = a;
        }

        System.out.println("Длинная строка: " + theLongest + "\nДлина равна: " + theLongest.length() + "\nКороткая строка: " + theShortest + "\nДлина равна: " + theShortest.length());
        in.close();
    }

}



