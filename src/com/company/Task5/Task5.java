package com.company.Task5;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(findSquareAndDistinct(List.of(9, 10, 3, 4, 7, 3, 4)));
    }

    public static List<Integer> findSquareAndDistinct(final List<Integer> numbers) {
        return numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
    }
}
