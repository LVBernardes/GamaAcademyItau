import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);

        int N;
        int i = 0;
        int positive = 0;
        int negative = 0;
        int even = 0;
        int odd = 0


        while (i < 5) {
            i++;
            N = teclado.nextInt();
            if (N%2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (N > 0) {
                positive++;
            } else if (N < 0) {
                negative++;
            }
        }
        System.out.println(total + " valores pares");

    }
}