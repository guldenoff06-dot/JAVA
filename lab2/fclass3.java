class Student {

    String name = "Gulden";

    void study() {
        System.out.println(name + " оқып жатыр");
    }
}

class Teacher extends Student {

    void teach() {
        System.out.println("Мұғалім сабақ түсіндіріп жатыр");
    }

    public static void main(String[] args) {

        Teacher obj = new Teacher();

        obj.study();   // Student әдісі
        obj.teach();   // Teacher әдісі
    }
}