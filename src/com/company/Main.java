package com.company;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertListToLinkedHashMap(List.of("Bluehost", "GoDaddy", "Amazon AWS", "LiquidWeb", "FatCow")));
    }

    public static Map<String, Integer> convertListToLinkedHashMap(final List<String> strings) {
        return strings.stream()
                .collect(toMap(Function.identity(), String::length, (e1, e2) -> e2, LinkedHashMap::new));
    }
}
