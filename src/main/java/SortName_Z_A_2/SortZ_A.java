package SortName_Z_A_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortZ_A {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Tom", "Nina", "Arya", "Zak");

        names.stream()
                .sorted(Collections.reverseOrder())
                .forEach(s->System.out.println(s));

    }
}
