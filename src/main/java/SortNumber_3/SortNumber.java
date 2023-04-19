package SortNumber_3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class SortNumber {
    public static void main(String[] args) {
        String[] digits = new String[]{"1, 2, 0", "4, 5"};
        Stream<String> sort =
                Arrays.asList(digits)
                        .stream()
                        .flatMap(str -> stream(str.split(", ")))
                        .map(Integer::valueOf)
                        .sorted()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ")).lines();

        List<String> sorteredNumber = sort.collect(Collectors.toList());

        System.out.println(sorteredNumber);
    }
}
