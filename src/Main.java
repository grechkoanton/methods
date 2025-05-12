import java.time.LocalDate;

public class Main {
    public static void task1() {
        System.out.println("Task 1");
    }
    public static void checkYear(int variableYear) {
        if (variableYear % 400 == 0) {
            System.out.println(variableYear + " год является високосным.");
        } else if (variableYear % 100 == 0) {
            System.out.println(variableYear + " год не является високосным.");
        } else if (variableYear % 4 == 0) {
            System.out.println(variableYear + " год является високосным.");
        } else {
            System.out.println(variableYear + " год не является високосным.");
        }
    }

    public static void task2() {
        System.out.println("Task 2");
    }
    public static void checkOS(int operatingSystem, int year) {
        if (operatingSystem == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operatingSystem == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (operatingSystem == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (operatingSystem == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такая версия приложения не предусмотрена в программе");
        }
    }

    public static void task3() {
        System.out.println("Task 3");
    }

    public static int checkTheDistanceFromTheOfficeToDeliveryAddress(int distance) {
        int daysDeliveryInterval = 1;
        if (distance < 20) {
            System.out.println("Потребуется дней на доставку: " + daysDeliveryInterval + " день.");
        } else if (distance >= 20 && distance < 60) {
            System.out.println("Потребуется дней на доставку: " + (daysDeliveryInterval + 1) + " дня.");
        } else if (distance >= 60 && distance < 100) {
            System.out.println("Потребуется дней на доставку: " + (daysDeliveryInterval + 1 + 1) + " дня.");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        return (daysDeliveryInterval);
    }

    public static void main(String[] args) {
        task1();
        int year = 2024;
        checkYear(year);

        task2();
        int clientOS = 1;
        int currentYear = LocalDate.now().getYear(); //int clientDeviceYear = 2025;
        checkOS(clientOS, currentYear);

        task3();
        int deliveryDistance = 30;
        checkTheDistanceFromTheOfficeToDeliveryAddress(deliveryDistance);
    }
}

