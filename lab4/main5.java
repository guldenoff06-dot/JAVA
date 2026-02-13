public class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void changeName(String newName) {
        this.name = newName;
    }

    void showInfo() {
        System.out.println("Студент: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ернар");
        s1.showInfo();

        s1.changeName("Али");
        s1.showInfo();
    }
}
