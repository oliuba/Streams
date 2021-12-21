import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("1", "2", "3", "as");
        MapTask mapTask = new MapTask();
        System.out.println(mapTask.mapping(arr));
        List<String> arr2 = Arrays.asList("abc", "def", "gh", "dea");
        FlattingTask flattingTask = new FlattingTask();
        System.out.println(flattingTask.flattingStrings(arr2));
        FizzBuzzTask fizzBuzzTask = new FizzBuzzTask();
        System.out.println(fizzBuzzTask.fizzBuzzIt(20));
        GroupWordsTask groupWordsTask = new GroupWordsTask();
        System.out.println(groupWordsTask.groupIt(arr2));
    }
}
