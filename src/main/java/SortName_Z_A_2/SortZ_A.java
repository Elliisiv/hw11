package SortName_Z_A_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortZ_A {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Tom", "Nina", "Arya", "Zak");
        List<String> formattedStrings = formatStrings(names);
        System.out.println(formattedStrings);
    }

    public static List<String> formatStrings(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
