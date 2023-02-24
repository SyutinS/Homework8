public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int month = 0;
        int contribution = 15000;
        int total = 0;
        while (total <= 2_459_000) {
            total = total + contribution;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int countryY = 12_000_000;
        int birtRateYear = 17;
        int mortalityYear = 8;
        int year = 0;
        birtRateYear = countryY * birtRateYear / 1000;
        mortalityYear = countryY * mortalityYear / 1000;
        System.out.println("Рождаемость в год " + birtRateYear);
        System.out.println("Сметность в год " + mortalityYear);
        while (year < 10) {
            year = year + 1;
            countryY = countryY + birtRateYear - mortalityYear;
            System.out.println("Год " + year + ", численность населения составляет " + countryY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int initialPayment = 15000;
        int totalSavings = 0;
        int month = 0;
        totalSavings = totalSavings + initialPayment;
        while (totalSavings <= 12_000_000) {
            totalSavings = totalSavings + initialPayment * 7 / 100;
            month = month + 1;
            System.out.println("месяц " + month + " накоплено " + totalSavings + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int initialPayment = 15000;
        int totalSavings = 0;
        int month = 0;
        totalSavings = totalSavings + initialPayment;
        while (totalSavings <= 12_000_000) {
            totalSavings = totalSavings + initialPayment * 7 / 100;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("месяц " + month + " накоплено " + totalSavings + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int initialPayment = 15000;
        int totalSavings = 0;
        int month = 0;
        int year = 0;
        totalSavings = totalSavings + initialPayment;
        while (year < 9) {
            totalSavings = totalSavings + initialPayment * 7 / 100;
            month = month + 1;
            if (month % 12 == 0)
                year = year + 1;
            if (month % 6 == 0)
                System.out.println("месяц " + month + " накоплено " + totalSavings + " рублей");
        }
        System.out.println("Василий за " + year + " лет накопит " + totalSavings + " рублей");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 1;
        int date = 0;
        for (; date < 31; date++) {
            if (date == firstFriday) {
                firstFriday = firstFriday + 7;
                System.out.println("Сегодня пятница " + date + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int yearNow = 2023;
        int yearEarlier = 200;
        int yearLater = 100;
        int cometFlight = 79;
        int yearBilling = 0;
        int startYear = yearNow - yearEarlier;
        int endYear = yearNow + yearLater;
        for (int cometArrival = startYear; cometArrival <= endYear; cometArrival++) {
            yearBilling = yearBilling + 1;
            if (cometArrival % cometFlight == 0)
                System.out.println(cometArrival);
        }
    }
}