package ru.skypro;

import java.time.LocalDate;

public class Main {
    public static void calculationLeapYear(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }
    public static void calculationAppVersion(int OS, int phoneYear){
        int currentYear = LocalDate.now().getYear();
        if (OS == 0) {
            if (phoneYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите приложение для iOS по ссылке");
            }
        } else {
            if (phoneYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }

    public static int deliveryTimeCalculation (int distance) {
        int deliveryTimeInDays = 0;
        if (distance > 0) {
            deliveryTimeInDays++;
            if (distance > 20 ) {
                deliveryTimeInDays++;
                if (distance > 60) {
                    deliveryTimeInDays++;
                }
            }
        }
        return deliveryTimeInDays;
    }


    public static void main(String[] args) {
        System.out.println("\n" + "tusk 1" + "\n");
        java.util.Random random = new java.util.Random();
        int year = random.nextInt(2200);
        calculationLeapYear(year);

        System.out.println("\n" + "tusk 2" + "\n");
        int phoneOS = 0;
        int phoneYear = 2022;
        calculationAppVersion(phoneOS,phoneYear);

        System.out.println("\n" + "tusk 3" + "\n");
        int deliveryDistance = 99;
        System.out.println("Потребуется дней: " + deliveryTimeCalculation(deliveryDistance));

    }



}

