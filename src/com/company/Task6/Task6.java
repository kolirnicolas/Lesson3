package com.company.Task6;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        final var primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        System.out.println("Highest prime number in List : " + intSummaryStatistics(primes).getMax());
        System.out.println("Lowest prime number in List : " + intSummaryStatistics(primes).getMin());
        System.out.println("Sum of all prime numbers : " + intSummaryStatistics(primes).getSum());
        System.out.println("Average of all prime numbers : " + intSummaryStatistics(primes).getAverage());
    }

    public static IntSummaryStatistics intSummaryStatistics(final List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(x -> x)
                .summaryStatistics();

    }
}


