import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);

        float N, avg;
        int i = 0;
        int total = 0;
        float sum = 0f;


        while (i < 6) {
            i++;
            N = teclado.nextFloat();
            if (N > 0f) {
                total++;
                sum += N;
            }
        }
        avg = sum/total;
        System.out.println(total + " valores positivos");
        System.out.printf("%.1f%n",avg);

    }
}