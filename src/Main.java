import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_PURPLE = "\u001B[35m";

        // First Task 1.1
        System.out.println(ANSI_PURPLE+"First Task 1.1"+ANSI_RESET);
        int clientOS = 0;
        final int iOs = 0;
        final int android = 1;

        if(clientOS==iOs)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else
            System.out.println("Установите версию прилоежния для Android по ссылке");

        // Second Task 1.2
        System.out.println(ANSI_PURPLE+"Second Task 1.2"+ANSI_RESET);

        int clientDeviceYear = 2015;
        clientOS= 1;
        int clientTelephoneYear = 2015;
        if( clientOS== iOs && clientTelephoneYear <clientDeviceYear)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
         if (clientOS == iOs && clientTelephoneYear >= clientDeviceYear)
            System.out.println("Установите версию приложения для iOS по ссылке");
         if(clientOS == android && clientTelephoneYear < clientDeviceYear)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
         if(clientOS== android && clientTelephoneYear >= clientDeviceYear)
            System.out.println("Установите версию приложения для Android по ссылке");


         // Third Task 1.3
        System.out.println(ANSI_PURPLE+"Third Task 1.3"+ANSI_RESET);
        int year = 608;
        if((year%4==0 && year%100!=0) || year%400==0)
            System.out.println(year+" год является высокосным");
        else
            System.out.println(year+" год не является высокосным");

        // Fourth Task 1.4
        System.out.println(ANSI_PURPLE+"Fourth Task 1.4"+ANSI_RESET);

        int deliveryDistance = 95;

        if (deliveryDistance<20)
            System.out.println("Потребуется дней: "+1+" день");
        else if ( deliveryDistance>=20 && deliveryDistance<60)
            System.out.println("Потребуется дней: 2 дня");
        else if (deliveryDistance >=60 && deliveryDistance<100)
            System.out.println("Потребуется дней: 3 дня");
        else
            System.out.println("Доставку не осуществляем");

        // Fifth Task 1.5
        System.out.println(ANSI_PURPLE+"Fifth Task 1.5"+ANSI_RESET);

    } // main
}// Main