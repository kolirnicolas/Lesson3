package com.company.Task4;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(findAmountOfEmptyStrings(List.of("abc", "", "", "avg")));

    }

    public static long findAmountOfEmptyStrings(final List<String> stringList) {
        return stringList.stream().filter(String::isEmpty).count();
    }
}


