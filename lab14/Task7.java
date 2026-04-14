import java.util.Random;
import java.util.Scanner;

public class Task7 {
        public static void main(String[] args) {

                Random r = new Random();

                while (true) {
                        int num = r.nextInt(10);
                        System.out.println(num);

                        if (num == 0) break;
                }
        }
}



