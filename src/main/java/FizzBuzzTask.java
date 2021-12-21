import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<String> fizzBuzzIt(int n) {
        List<Integer> arr = IntStream.range(0, n).boxed().collect(Collectors.toList());
        return arr.stream().map(x -> ((int)x%15 == 0) ? "fizz buzz" :
                (((int)x%3 == 0) ? "fizz" : (((int)x%5 == 0) ? "buzz" :
                        String.valueOf(x)))).collect(Collectors.toList());
    }
}
