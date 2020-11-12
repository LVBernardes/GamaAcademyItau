import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int X = teclado.nextInt();

        if (X%2 == 1) {
            for (int i = 0; i < 6 ; i++) {
                System.out.println(X + (2*i));
            }
        } else {
            for (int i = 0; i < 6 ; i++){
                System.out.println(X + (2*i + 1));
            }
        }

    }
}