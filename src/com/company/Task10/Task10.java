package com.company.Task10;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task10 {


    public static void main(String[] args) {
        System.out.println(convertListToTreeMapWithException(List.of("Bluehost", "GoDaddy", "Bluehost")));
    }

    public static Map<Integer, String> convertListToTreeMapWithException(final List<String> strings) {

        return strings.stream()
                .collect(Collectors.toMap(String::length, Function.identity(), (a, b) -> {
                            throw new IllegalArgumentException("ищи ошибки" + b);
                        }, TreeMap::new));
    }

}
