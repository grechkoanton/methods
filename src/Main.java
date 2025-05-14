import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printTask(1);
        int year = 2025;
        checkYear(year);

        printTask(2);
        int clientOS = 1;
        int currentYear = LocalDate.now().getYear(); //int clientDeviceYear = 2025;
        checkOS(clientOS, currentYear);

        printTask(3);
        int deliveryDistance = 95;
        checkTheDistanceFromTheOfficeToDeliveryAddress(deliveryDistance);
        int days = checkTheDistanceFromTheOfficeToDeliveryAddress(deliveryDistance);
        System.out.println("Потребуется дней на доставку: " + days);
    }

    public static void printTask(int number) {
        System.out.println("Task " + number);
    }

    // Task 1
    public static void checkYear(int variableYear) {
        if (variableYear % 400 == 0 || variableYear % 4 == 0 && variableYear % 100 != 0) {
            System.out.println(variableYear + " год является високосным.");
        } else {
            System.out.println(variableYear + " год не является високосным.");
        }
    }

    //Task 2
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

    // Task 3
    public static int checkTheDistanceFromTheOfficeToDeliveryAddress(int distance) {
        int daysDeliveryInterval1 = 0; //нужна ли тут переменная? или лучше без нее
        if (distance < 20) {
            return daysDeliveryInterval1 + 1; //return 1
        } else if (distance >= 20 && distance < 60) {
            return 2; //daysDeliveryInterval1 + 2;
        } else if (distance >= 60 && distance < 100) {
            return 3; // daysDeliveryInterval1 + 3;
        } else {
            return 0;
        }


    }
}

