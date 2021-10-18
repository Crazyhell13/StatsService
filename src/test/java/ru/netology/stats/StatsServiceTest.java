package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        int []sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumAllSales(sales);
        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        int []sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);
        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateMaxSalesMonth() {
        StatsService service = new StatsService();
        int []sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSalesMonth(sales);
        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();
        int []sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSalesMonth(sales);
        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateBelowAverageMonth() {
        StatsService service = new StatsService();
        int []sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverageSales(sales);
        assertEquals(expected,actual);
    }

    @Test
    void aboveAverageMonth() {
        StatsService service = new StatsService();
        int []sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverageSales(sales);
        assertEquals(expected,actual);
    }
}