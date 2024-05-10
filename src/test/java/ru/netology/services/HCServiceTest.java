package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class HCServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Counter.csv")

    public void testHCServiceNotNull(int income, int expenses, int threshold) {
        HolidayCounterService service = new HolidayCounterService();
        int holidayCounter = service.calculate(income, expenses, threshold);
        System.out.println("Всего отдохну месяцев в этом году: " + holidayCounter);

        boolean holiday;

        if (holidayCounter >= 1) {
            holiday = true;
        } else {
            holiday = false;
        }

        Assertions.assertEquals(holiday, true);

    }

}
