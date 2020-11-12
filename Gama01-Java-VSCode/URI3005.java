import java.util.Scanner;

public class URI3005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float A,B,avg;

        A = teclado.nextFloat();
        B = teclado.nextFloat();

        avg = (3.5f*A + 7.5f*B)/11f;

        System.out.printf("MEDIA = %.5f",avg);

        
    }
}