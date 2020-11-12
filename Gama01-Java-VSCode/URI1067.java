import java.util.Scanner;

public class URI1067 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);

        int X = teclado.nextInt();

        for (int i = 1; i <= X; i++) {
            if (i%2 == 1) {
                System.out.println(i);
            }
        }

    }
}