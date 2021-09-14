public class Main {
    public static void main(String[] args) {
        int balance = 200; //рублей
        int payment = 1200; //рублей
        boolean bonusLimit = (payment > 1000); //рублей
        int bonus;
        if (bonusLimit) {
            bonus = 1; // % начисляемого бонуса, при пополнении суммы свыше 1000 рублей
        } else {
            bonus = 0; // % бонуса, сумма пополнения меньше или равна 1000 рублей
        }
        int sum = payment * bonus / 100;
        int total = balance + payment + sum;

        System.out.println("Вы пополнили баланс на сумму: " + payment  + " руб.");
        if (bonusLimit) System.out.println("Бонус за пополнение: " + sum + " руб.");
        System.out.println("Ваш текущий баланс: " + total + " руб.");
    }
}
