public class Task2 {
    public static void main(String[] args) {

        int[] B = new int[15];
        int sum = 0;

        System.out.println("Негізгі массив:");
        for(int i = 0; i < 15; i++){
            B[i] = (int)(Math.random()*40 - 20);
            System.out.print(B[i] + " ");
        }

        for(int i = 0; i < 15; i++){
            if(B[i] > 0){
                sum += B[i];
            }
        }

        System.out.println("\nОң элементтер қосындысы: " + sum);
    }
}
