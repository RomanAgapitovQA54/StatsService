package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;

    }

    public long averageSale(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int month = 0;
        long maxSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                month = i;
                maxSale = sales[i];
            }

        }
        return month + 1;

    }

    public int monthMinSale(long[] sales) {
        int month = 0;
        long minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                month = i;
                minSale = sales[i];
            }

        }
        return month + 1;

    }

    public int monthsWhenSalesBelowAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSale(sales)) {
                count++;
            }

        }
        return count;

    }

    public int monthsWhenSalesAboveAverage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSale(sales)) {
                count++;
            }

        }
        return count;

    }

}
