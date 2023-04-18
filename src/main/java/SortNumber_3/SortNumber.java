package SortNumber_3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class SortNumber {
    public static void main(String[] args) {
        String[] digits = new String[]{ "1, 2, 0", "4, 5" };
        List<String> numb = new ArrayList<>();
        for(String sT:digits){
            String[] tempArray = sT.split(",");
            for(String sA:tempArray)
                numb.add(sA.replace(" ", ""));
        }
        List<String> sortNumber = numb.stream().sorted().collect(Collectors.toList());
        System.out.println(sortNumber);



    }
}
