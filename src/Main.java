public class Main {
    public static void main(String[] args) {

        // Задание1
        System.out.println("Задание 1");

        byte clientOS = 1;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else
            System.out.println("Установите версию приложения для Android по ссылке");


        // Задание 2
        System.out.println("Задание 2");

        short clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        if (clientDeviceYear >= 2015 && clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");

        if (clientDeviceYear < 2015 && clientOS == 0)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        if (clientDeviceYear < 2015 && clientOS == 1)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        // Задание 3
        System.out.println("Задание 3");

        int year = 2021;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println( year +" год является високосным");
        else  System.out.println( year +" год не является високосным");

        // Задание 4
        System.out.println("Задание 4");

        int deliveryDistance = 95;
        int deliveryPeriod = 1;
        if (deliveryDistance < 20)
            System.out.println("Потребуется дней: " + deliveryPeriod + " день.");
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryPeriod = deliveryPeriod + 1;
            System.out.println("Потребуется дней: " + deliveryPeriod + " дня.");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryPeriod = deliveryPeriod + 2;
            System.out.println("Потребуется дней: " + deliveryPeriod + " дня.");
        }
        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + " месяц (он же январь) принадлежит к сезону зима");
                break;
            case 2:
                System.out.println(monthNumber + " месяц (он же февраль) принадлежит к сезону зима");
                break;
            case 3:
                System.out.println(monthNumber + " месяц (он же март) принадлежит к сезону весна");
                break;
            case 4:
                System.out.println(monthNumber + " месяц (он же апрель) принадлежит к сезону весна");
                break;
            case 5:
                System.out.println(monthNumber + " месяц (он же май) принадлежит к сезону весна");
                break;
            case 6:
                System.out.println(monthNumber + " месяц (он же июнь) принадлежит к сезону лето");
                break;
            case 7:
                System.out.println(monthNumber + " месяц (он же июль) принадлежит к сезону лето");
                break;
            case 8:
                System.out.println(monthNumber + " месяц (он же август) принадлежит к сезону лето");
                break;
            case 9:
                System.out.println(monthNumber + " месяц (он же сентябрь) принадлежит к сезону осень");
                break;
            case 10:
                System.out.println(monthNumber + " месяц (он же октябрь) принадлежит к сезону осень");
                break;
            case 11:
                System.out.println(monthNumber + " месяц (он же ноябрь) принадлежит к сезону осень");
                break;
            case 12:
                System.out.println(monthNumber + " месяц (он же декабрь) принадлежит к сезону зима");
                break;
            default:
                System.out.println("Данного номера месяца не существует: " + monthNumber);
        }

    }
}