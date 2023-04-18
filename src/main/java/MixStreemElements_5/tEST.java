package MixStreemElements_5;
import java.util.Iterator;
import java.util.stream.*;

public class tEST {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> secondIterator = second.iterator();
        return first.filter(e -> secondIterator.hasNext()).flatMap(e -> Stream.of(e, secondIterator.next()));
    }
    public static void main(String[] args) {
        Stream<String> first = Stream.of("apple", "banana", "cherry", "orange");
        Stream<String> second = Stream.of("1", "2", "3", "5");

        Stream<String> result  = zip(first, second);
        result.forEach(System.out::println);
    }
}
