package ru.netology.stats;

public class StatsService {

    public long sumarySales(long[] sales) {

        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public long averagesAmount(long[] sales) {

        long sumSales = sumarySales(sales);
        long averageAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            averageAmount = sumSales / 12;
        }
        return averageAmount;
    }

    public int maximumSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minimumSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minimumAverageSales(long[] sales) {
        int minAverageSales = 0;
        long sumSales = sumarySales(sales);

        long averageAmount = sumSales / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {

                minAverageSales++;
            }
        }

        return minAverageSales;
    }

    public int maximumAverageSales(long[] sales) {
        int maxAverageSales = 0;
        long sumSales = sumarySales(sales);

        long aversgeAmount = sumSales / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > aversgeAmount) {
                maxAverageSales++;
            }
        }
        return maxAverageSales;
    }
}