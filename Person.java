package com.javarush.test;

import java.util.Scanner;

import static java.util.Scanner.*;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value;
        do{
            System.out.println("Нет такого имени");
            value = scanner.nextLine();
        } while(!value.equals("Вячеслав"));

        System.out.println("Привет, "+ value);
    }
}






