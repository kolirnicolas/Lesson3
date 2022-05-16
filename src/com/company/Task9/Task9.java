package com.company.Task9;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(convertListToSortedMap(List.of("Bluehost", "GoDaddy", "Amazon AWS", "LiquidWeb", "FatCow")));
    }

    public static Map<String, Integer> convertListToSortedMap(final List<String> strings) {
        return strings.stream().collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e2, TreeMap::new));
    }
}

