package Week_02_02_03mar2019.___weekend_02_Rozwiazane_zadania__Instruktorskie.enums;

public class MoneyTest {
    public static void main(String[] args) {
        Money hundredInPln = new Money(Currency.PLN, 100);
        Money hundredInUsd = hundredInPln.exchange(Currency.USD);

        System.out.println(hundredInPln + " = " + hundredInUsd);

        Money hundredInJpy = new Money(Currency.JPY, 100);
        Money hundredInGbp = hundredInJpy.exchange(Currency.GBP);

        System.out.println(hundredInJpy + " = " + hundredInGbp);
    }
}
