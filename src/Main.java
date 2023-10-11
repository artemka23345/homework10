import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int age = 2021;
        int clientOS = 1;
        int clientDeviceYear = 2023;
        int deliveryDistance = 102;

        checkForLeap(age);
        CheckClientOS(clientOS, clientDeviceYear);
        System.out.println(deliveryTime(deliveryDistance));
    }
    /*
    Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным,
     и выводит результат в консоль.
    Эту проверку вы уже реализовывали в задании по условным операторам.
    Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
    Результат программы выведите в консоль. Если год високосный, то напечатайте
    сообщение: «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».
    */
    public static void checkForLeap(int age) {
        boolean leapYear = (age > 1584 && ((age % 400 == 0) || (age % 4 == 0 && age % 100 != 0)));
        if (leapYear)
            System.out.println(age + " год является високосным.");
        else
            System.out.println(age + " год не является високосным.");
    }
    /*
    Напишите метод, куда подаются два параметра: тип операционной системы
    (0 — iOS, 1 — Android) и год выпуска устройства.
    Если устройство старше текущего года, предложите ему установить облегченную версию.
    */
    public static void CheckClientOS(int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    /*
    Ваша задача — доработать код, а именно написать метод, который на вход
    принимает дистанцию и возвращает итоговое количество дней доставки.
    */
    public static int deliveryTime(int deliveryDistance) {
        int timeDelivery = -1;
        if (deliveryDistance < 20) {
            timeDelivery = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            timeDelivery = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            timeDelivery = 3;
        } else {
            System.out.println("Доставки нет");
        }
        return timeDelivery;
    }
}
