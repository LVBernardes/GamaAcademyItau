import java.util.Scanner;

public class URI1007 {
    public static void main(String[] args) {
        Scanner teclado;
        int A,B,C,D,difference;

        teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        difference = (A*B - C*D);

        System.out.println("DIFERENCA = " + difference);
    }
}