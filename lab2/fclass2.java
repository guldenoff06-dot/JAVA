class fclass {

    protected int number = 100;
}

class fclass2 extends fclass {

    public static void main(String[] args) {

        fclass2 obj = new fclass2();

        System.out.println("Protected айнымалы мәні: " + obj.number);
    }
}
