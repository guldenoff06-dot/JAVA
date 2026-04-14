public class Task5 {
        public static void main(String[] args) {

                String num = "121";
                String reversed = new StringBuilder(num).reverse().toString();

                if (num.equals(reversed)) {
                        System.out.println("Палиндром");
                } else {
                        System.out.println("Палиндром емес");
                }
        }
}

