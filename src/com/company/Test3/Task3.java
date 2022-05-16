package com.company.Test3;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(calculateAverage(List.of(1L, 2L, 3L, 4L, 5L)));
    }

    public static double calculateAverage(List<Long> longList) {
        return longList.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
}



