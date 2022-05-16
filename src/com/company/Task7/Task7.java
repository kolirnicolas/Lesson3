package com.company.Task7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<List<String>> words = new ArrayList<>();
        words.add(List.of("ab", "bc"));
        words.add(List.of("cd", "de"));
        System.out.println(flatStreamToStream(words));
    }

    public static List<String> flatStreamToStream(final List<List<String>> lists) {
        return lists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
