package unpairedList_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NameList {
    public static void main(String[] args) {
        System.out.println(processNames());
    }

    public static String processNames() {
        List<String> names = Arrays.asList("John", "Tom", "Nina", "Arya", "Zak");
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}