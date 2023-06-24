public class Main {
    public static void main(String[] args) {
        int initialBalance = 100; // начальный баланс
        int refillAmount = 1100; // сумма пополнения
        int bonusThreshold = 1000; // порог для начисления бонуса
        int bonusPerRubles = 100; // количество рублей для одного бонусного рубля

        int bonus;
        if (refillAmount > bonusThreshold) {
            bonus = refillAmount / bonusPerRubles;
        } else {
            bonus = 0;
        }

        int finalBalance = initialBalance + refillAmount + bonus;
        System.out.println("Итоговый баланс: " + finalBalance);
        System.out.println("Бонусных рублей: " + bonus);
    }
}