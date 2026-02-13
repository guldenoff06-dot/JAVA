class fclass1 {
    String name = "Негізгі класс (fclass1)";

    void show() {
        System.out.println("Бұл fclass1 әдісі");
    }

    public static void main(String[] args) {
        // fclass1 объектісі
        fclass1 obj1 = new fclass1();
        System.out.println(obj1.name);
        obj1.show();

        System.out.println("-----");

        // fclass3 объектісі
        fclass3 obj3 = new fclass3();
        System.out.println(obj3.name3);
        obj3.show3();
        obj3.show(); // ата-анадан мұраланған әдіс

        System.out.println("-----");

        // fclass2 объектісі
        fclass2 obj2 = new fclass2();
        System.out.println(obj2.name2);
        obj2.show2();
        obj2.show3(); // fclass3-тен мұраланған
        obj2.show();  // fclass1-тен мұраланған
    }
}

// fclass3 → fclass1 мұрагері
class fclass3 extends fclass1 {
    String name3 = "Аралық класс (fclass3)";

    void show3() {
        System.out.println("Бұл fclass3 әдісі");
    }
}

// fclass2 → fclass3 мұрагері
class fclass2 extends fclass3 {
    String name2 = "Соңғы класс (fclass2)";

    void show2() {
        System.out.println("Бұл fclass2 әдісі");
    }
}