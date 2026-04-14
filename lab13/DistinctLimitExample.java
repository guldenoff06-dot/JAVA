import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctLimitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .distinct()   // қайталанатын элементтерді алып тастау
                .limit(4)     // тек алғашқы 4 элемент
                .collect(Collectors.toList());

        System.out.println(result);
    }
}


