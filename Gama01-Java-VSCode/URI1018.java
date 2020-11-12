import java.util.Scanner;

public class URI1037 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);

        float N;

        N = teclado.nextFloat();

        if (N < 0f) {
            System.out.println("Fora de intervalo");
        } else if (N >= 0f && N <= 25f) {
            System.out.println("Intervalo [0,25]");
        } else if (N > 25f && N <= 50f) {
            System.out.println("Intervalo (25,50]");
        } else if (N > 50f && N <= 75f) {
            System.out.println("Intervalo (50,75]");
        } else if (N > 75f && N <= 100f) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

    }
}