package ru.netology.stats;

public class StatsService {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int sumAllSales(int[] sales) {
        int Sum = 0;
        for (int sale : sales) {
            Sum += sale;
        }
        return Sum;
    }

    public int averageSales(int[] sales) {
        return sumAllSales(sales) / sales.length;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int countBelowAverageSales = 0;
        for (int sale : sales) {
            if (sale < averageSales(sales)) {
                countBelowAverageSales = countBelowAverageSales + 1;
            }
        }
        return countBelowAverageSales;
    }

    public int aboveAverageSales(int[] sales) {
        int countAboveAverageSales = 0;
        for (int sale : sales) {
            if (sale < averageSales(sales)) {
                countAboveAverageSales = countAboveAverageSales + 1;
            }
        }
        return countAboveAverageSales;
    }
}