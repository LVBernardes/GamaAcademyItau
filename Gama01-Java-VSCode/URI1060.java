import java.util.Scanner;

public class URI1060 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);

        float N;
        int i = 0;
        int total = 0;


        while (i < 6) {
            i++;
            N = teclado.nextFloat();
            if (N > 0f) {
                total++;
            }
        }
        System.out.println(total + " valores positivos");

    }
}