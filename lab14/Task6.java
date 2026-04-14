import java.util.Random;

public class Task6 {
        public static void main(String[] args) {

                String num = "123456";
                int count = 0;

                for (int i = 0; i < num.length(); i++) {
                        int digit = num.charAt(i) - '0';
                        if (digit % 2 == 0) count++;
                }

                System.out.println("Жұп саны: " + count);
        }
}


