public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация " + i);
        }
        for (int j = 10; j > 0; j--) {
            System.out.println("Итерация " +j);
        }
        for (int k = 0; k < 17; k=k+2) {
            System.out.println("Четная итерация " +k);
        }
        for (int l = 10; l >= -10; l--) {
            System.out.println("Числа по возрастанию " +l);
        }
        for (int year = 1904; year <= 2096; year = year +4) {
            System.out.println( year + " год является високосным");
        }
        for (int a = 0; a <= 98; a=a+7) {
            System.out.println("Число " + a);
        }
        for (int b = 1; b < 1000; b=b*2) {
            System.out.println(b);
        }
        int money = 29000;
        double savings = 0;
        for (int s = 1; s <= 12; s++) {
            savings = savings + money;
            System.out.println("Месяц, " + s + " сумма накоплений равна " + savings + " рублей");
        }
        double mon = 29000;
        double total = 0;
        for (int d = 1; d <= 12; d++) {
            total = total + total * 0.12;
            total = total + mon;
            System.out.println("Месяц, " + d + " сумма накоплений равна " + total + " рублей");
        }
        for (int g = 1; g <= 10; g++) {
            int y = g*2;
            System.out.println(y);
        }
    }
    }