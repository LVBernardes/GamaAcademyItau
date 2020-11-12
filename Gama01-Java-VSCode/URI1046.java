import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);

        int start,end;

        start = teclado.nextInt();
        end = teclado.nextInt();

        if (start > end) {
            System.out.println("O JOGO DUROU " + ((24-start) + end) + " HORA(S)");
        } else if (start == end) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + (end - start) + " HORA(S)");
        }
    }
}