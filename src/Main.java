// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int balance = 20;
        int depositAmount = 1001;
        int totalBalance = depositAmount + balance;
        int bonus = 0;
        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        }
        System.out.println("Итоговый счет: " + totalBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}