package LinearCongruentGenerator_4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomAlgorithmStream {
    public static void main(String[] args) {
        long[] random = new long[]{5,4,11};

        RandomAlgorithm r = new RandomAlgorithm(25214903917l, (long) Math.pow(2, 48), 11L);
        Stream<Long> stream =
                Stream.iterate(random[0], n -> ((1 + (r.getA() * n+ r.getC()) % r.getM())));

        stream
                .limit(20)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }


}
