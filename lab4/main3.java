public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;   // this қолдану
        this.age = age;
    }

    void showInfo() {
        System.out.println("Аты: " + name + ", Жасы: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ернар", 21);
        s1.showInfo();
    }
}
