class fclass1 {

    void show() {
        System.out.println("Бұл fclass1 класы");
    }
}

class fclass2 extends fclass1 {

    void info() {
        System.out.println("Бұл fclass2 класы");
    }
}

class fclass3 extends fclass2 {

    public static void main(String[] args) {

        fclass3 obj = new fclass3();

        obj.show();  // fclass1 әдісі
        obj.info();  // fclass2 әдісі
    }
}
