package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        HolidayCounterService service = new HolidayCounterService();
        int holidayCounter = service.calculate(100_000, 60_000, 150_000);
        System.out.println("Всего отдохну месяцев в этом году: " + holidayCounter);
    }
}