package com.ryanplant.experiments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<MyType> list = new ArrayList<>();
        list.add(new MyType(null));
        list.add(new MyType("NotNull"));
        list.add(new MyType(null));
        list.add(new MyType("NotNull"));
        list.add(new MyType("NotNull"));

        List<MyType> filteredList = list.stream()
                .filter(myType -> myType.getErrorCode() != null)
                .collect(Collectors.toList());

        filteredList.forEach(myType -> System.out.println(String.format("Index: %s, Value: %s", filteredList.indexOf(myType), myType.getErrorCode())));
    }
}
