import java.util.Scanner;

public class Task10 {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int min = Integer.MAX_VALUE;

                while (true) {
                        int n = sc.nextInt();
                        if (n == 0) break;

                        min = Math.min(min, n);
                }

                System.out.println("Min: " + min);
        }
}
