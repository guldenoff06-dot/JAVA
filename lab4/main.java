public class Student {

    String name;
    int age;
    String major;

    void showInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ернар";
        s1.age = 21;
        s1.major = "IT";

        s1.showInfo();
    }
}
