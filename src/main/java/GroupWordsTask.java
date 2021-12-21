import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask  {
    public static Map<Character, Long> groupIt(List<String> arr) {
        return arr.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, x -> x.getValue().stream()
                        .flatMap(y -> Arrays.stream(y.split(""))
                                .filter(z -> z.charAt(0) == x.getKey())).count()));
    }
}
