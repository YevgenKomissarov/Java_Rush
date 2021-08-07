package JavaSyntaxZero.Level2;

public class Task0614 {

        public static final double pi = 3.14;
        public static double radius = 2.5;
        public static double diameter = 5;

        public static void main(String[] args) {
            System.out.println("Плошадь круга равна: " + pi * radius * radius);
            System.out.println("Периметр круга равен: " + pi * diameter);
        }
    }

/*
Посмотри, что делает программа. Расставь модификатор final общепринятым константам (переменным с неизменными значениями).
Требования:

    •
    Модификатор final должен быть установлен всем константам.

    package com.javarush.task.pro.task06.task0614;

// Вспоминаем геометрию

public class Solution {
    public static double pi = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("Плошадь круга равна: " + pi * radius * radius);
        System.out.println("Периметр круга равен: " + pi * diameter);
    }
}




 */