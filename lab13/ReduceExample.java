import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // reduce арқылы қосынды
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Сумма: " + sum);
    }
}


