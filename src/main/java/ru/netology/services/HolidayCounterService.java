package ru.netology.services;

public class HolidayCounterService {

    public int calculate(int income, int expenses, int threshold) {
        int cancel = 0;
        int money = 0;
        int month = 0;
        int cash;
        while (month < 12) {
            month = month + 1;

            if (money < threshold) {
                System.out.println("Месяц " + month + ". Денег " + money + ". Прийдется работать " + ". Заработал +" + income + ". Потратил -" + expenses);
                money = money + (income - expenses);
            } else {
                cash = (money - expenses) / 3 * 2;
                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать " + ". Потратил -" + expenses + ". Потратил -" + cash);

                money = money - expenses - cash;
                cancel++;

            }
        }

        return cancel;
    }
}

