package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {


    //    @ParameterizedTest
//    @CsvFileSource(files="src/test/resources/sales.csv")
    @Test
    public void testSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.sumarySales(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.averagesAmount(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.maximumSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.minimumSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.minimumAverageSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.maximumAverageSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}
