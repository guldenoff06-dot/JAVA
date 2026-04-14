public class Task4 {
        public static void main(String[] args) {

                int n = 58321;
                int max = 0;

                while (n > 0) {
                        max = Math.max(max, n % 10);
                        n /= 10;
                }

                System.out.println("Max: " + max);
        }
}

