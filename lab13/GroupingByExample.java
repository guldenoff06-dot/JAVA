import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class student {
    String name;
    int age;
    double grade;

    public student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old, " + grade + " grade)";
    }
}
public class GroupingByExample {
    public static void main(String[] args) {
        List<student> students = Arrays.asList(
                new student("John", 20, 85),
                new student("Jane", 22, 92),
                new student("Jack", 20, 78),
                new student("Jill", 22, 88),
                new student("James", 20, 76)
        );

        // Топтау: жас бойынша топтау
        Map<Integer, List<student>> groupedByAge = students.stream()
                .collect(Collectors.groupingBy(student::getAge));

        // Нәтижелерді шығару
        groupedByAge.forEach((age, group) -> {
            System.out.println("Age " + age + ": " + group);
        });
    }
}


