class University8 {
    static class Student {
        String name;
        String major;

        Student(String name, String major) {
            this.name = name;
            this.major = major;
        }

        void display() {
            System.out.println(name + " - " + major);
        }
    }
}

public class Main8 {
    public static void main(String[] args) {
        University8 u = new University8();
        University8.Student s = new University8.Student("Ali", "IT");
        s.display();
    }
}