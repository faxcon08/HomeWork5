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


    } // main
}// Main