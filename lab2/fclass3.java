class Lab {

    String subject;
    int hours;
}

class Lab_ extends Lab {

    public static void main(String[] args) {

        Lab_ obj = new Lab_();

        obj.subject = "Java бағдарламалау";
        obj.hours = 2;

        System.out.println("Пән: " + obj.subject);
        System.out.println("Сағат саны: " + obj.hours);
    }
}
