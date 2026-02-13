public class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Студент: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ернар");
        Student s2 = new Student("Айдана");
        Student s3 = new Student("Нұржан");

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
    }
}
