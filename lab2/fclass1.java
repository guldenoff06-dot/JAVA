public class fclass1 {

    public void show() {
        System.out.println("Это класс fclass1");
    }

    public static void main(String[] args) {
        fclass2 obj = new fclass2();
        obj.show();
    }
}

class fclass3 extends fclass1 {
    @Override
    public void show() {
        System.out.println("Это класс fclass3");
    }
}

class fclass2 extends fclass3 {
    @Override
    public void show() {
        System.out.println("Это класс fclass2");
    }
}