import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) {
        Scanner teclado;
        float A,B,C,avg;

        teclado = new Scanner(System.in);

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        avg = (2f*A + 3f*B + 5f*C)/10f;

        System.out.printf("MEDIA = %.1f\n",avg);
    }
}