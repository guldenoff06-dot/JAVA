public class Student {

    String name;
    int age;

    // Әдепкі конструктор
    Student() {
        name = "Аты жоқ";
        age = 0;
    }

    // Параметрлі конструктор
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void showInfo() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Айдана", 19);

        s1.showInfo();
        s2.showInfo();
    }
}
