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
    }
}