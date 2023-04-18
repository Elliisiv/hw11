package unpairedList_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class unpairedList {
    public static void main(String[] args) {
        User john = new User(1, "Ivan");
        User sarah = new User(2, "Sarah");
        User charles = new User(3, "Peter");
        User mary = new User(4, "Mary");
        User tom = new User(5, "Tom");

        List<User> names =
                Arrays.asList(john, sarah, charles, mary, tom)
                .stream()
                .filter(c -> c.getNumber()%2!=0)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
