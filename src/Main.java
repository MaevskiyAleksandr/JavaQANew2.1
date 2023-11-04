public class Main {
    public static void main(String[] args) {
        int initialAccount = 500;
        int depositAmount = 1400;

        System.out.println("Итоговый счет:" + (initialAccount + depositAmount));

        int bonus;
        if (depositAmount + initialAccount > 1000) {
            bonus = (depositAmount + initialAccount) / 100;
        } else {
            bonus = 0;


        }
        System.out.println("Бонусы при пополнении счета более чем на 1000 рублей: "  + bonus);
    }

}