package ru.netology.statistus;


public class StatisticsService {
    public long findMax(long[] incomes) {
        long currentMaxIndex = 0;
        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMaxIndex < income) {
                currentMaxIndex = income;
            }
        }
        return currentMax;
    }
}