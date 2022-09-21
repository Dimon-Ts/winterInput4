public class Main {
    public static void main(String[] args) {

        // Домашнее задание 4
        // Второй вариант решения
        // Задание 1
        System.out.println("Домашнее задание 4");
        System.out.println("Задание 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");
        short clientDeviceYear = 2014;
        byte clientOSAI = 1;
        if (clientDeviceYear < 2015 && clientOSAI == 0) {
            System.out.println("Установите облегчённую версию приложения для IOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOSAI == 0) {
            System.out.println("Установите полную версию приложения для IOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOSAI == 1) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOSAI == 1) {
            System.out.println("Установите полную версию приложения для Android по ссылке");
        }


        // Задание 3
        System.out.println("Задание 3");
        System.out.println("Программа-определитель високосного года");
        int year = 2025;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Год " + year + " является високосным");
        }else{
            System.out.println("Год " + year + " не является високосным");
        }

        // Задание 4
        System.out.println("Задание 4");
        System.out.println("Расчёт времени доставки:");
        int deliveryDistance = 100;
        if(deliveryDistance < 20){
            System.out.println("Для доставки Вашей карты потребуется 1 день.");
        }
        if(deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Для доставки Вашей карты потребуется 2 дня");
        }
        if(deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Для доставки Вашей карты потребуется 3 дня");
        }
        if(deliveryDistance >= 100){
            System.out.println("На доставку Вашей карты потребуется больше 3-х дней.Как только карта прибудет " +
                    "в Ваш населённый пунт,мы вас известим!");
        }

        // Задание 5
        System.out.println("Задание 5");
        System.out.println("Программа определитель сезона года");
        int monthNumber = 3;
        System.out.println("Месяц: " + monthNumber);
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}