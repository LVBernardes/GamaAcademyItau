import java.util.Scanner;

public class URI1142 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();

        for (int i = 0; i <= N; i++) {
            System.out.println((4*i + 1) + " " + (4*i + 2) + " " + (4*i + 3) + " PUM" );
        }

    }
}