package com.company;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(groupByStringLength(List.of("abc", "test", "avg", "grtt")));

    }

    public static Map<Integer, List<String>> groupByStringLength(final List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(Function.identity(), Collectors.toList())));

    }
}


