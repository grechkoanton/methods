import java.time.LocalDate;

public class Main {
    public static void task1() {
        System.out.println("Task 1");
    }
    public static void checkLeapYear(int a, int b) {
        if (a <= b) {
            System.out.println(a + " год не является високосным.");
        } else if (a % 400 == 0) {
            System.out.println(a + " год является високосным.");
        } else if (a % 100 == 0) {
            System.out.println(a + " год не является високосным.");
        } else if (a % 4 == 0) {
            System.out.println(a + " год является високосным.");
        } else {
            System.out.println(a + " год не является високосным.");
        }
    }

    public static void task2() {
        System.out.println("Task 2");
    }
    public static void checkOS(int c, int d) {
        if (c == 0 && d < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (c == 0 && d >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (c == 1 && d < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (c == 1 && d >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Task 3");
    }
    public static int homeDeliveryCard(int f, int g) {
        if (f <= 20) {
            System.out.println("Потребуется дней на доставку: " + g + " день.");
        } else if (f > 20 && f <= 60) {
            System.out.println("Потребуется дней на доставку: " + (g + 1) + " дня.");
        } else if (f > 60 && f <= 100) {
            System.out.println("Потребуется дней на доставку: " + (g + 1 + 1) + " дня.");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        return (g);
    }

    public static void main(String[] args) {
        task1();
        int year = 2025;
        int leapYearIntroduced = 1584;
        checkLeapYear(year, leapYearIntroduced);

        task2();
        int clientOS = 1;
        int currentYear = LocalDate.now().getYear(); //int clientDeviceYear = 2025;
        checkOS(clientOS, currentYear);

        task3();
        int deliveryDistance = 95;
        int dayIn20Km = 1;
        homeDeliveryCard(deliveryDistance, dayIn20Km);
    }
}