import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange");

        // Comparator.comparing қолдану
        words.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);  // kiwi, apple, orange, banana
    }
}


class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years, " + grade + " grade)";
    }
}

