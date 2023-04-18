package MixStreemElements_5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class MixStreemElements {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> resultList = new ArrayList<>();

        Iterator<T> iteratorF = first.iterator();
        Iterator<T> iteratorS = second.iterator();

        while (iteratorF.hasNext() && iteratorS.hasNext()) {
            resultList.add(iteratorF.next());
            resultList.add(iteratorS.next());
        }
        return resultList.stream();
    }
    public static void main(String[] args) {
        Stream<String> first = Stream.of("apple", "banana", "cherry", "orange");
        Stream<String> second = Stream.of("1", "2", "3", "5");

        Stream<String> result  = zip(first, second);
        result.forEach(System.out::println);
    }
}