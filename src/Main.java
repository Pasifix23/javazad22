public class Main {

    public static void main(String[] args) {
        int initialAccount = 3_000;
        int addend = 1340;

        int bonus;
        if (addend > 1000) {
            bonus = addend / 100;
        } else {
            bonus = 0;
        }
        //bonus = addend > 1000 ? addend / 100 : 0;

        int finalAccount = initialAccount + addend + bonus;
        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Бонусные рубли:" + bonus);
    }
}
