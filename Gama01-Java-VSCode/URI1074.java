import java.util.Scanner;

public class URI1074 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();
        int X = 0;
        int i = 0;

        do {
            X = teclado.nextInt();
            if (X == 0) {
                System.out.println("NULL");
            } else {
                if (X%2 == 0) {
                    if (X > 0) {
                        System.out.println("EVEN POSITIVE");
                    } else {
                        System.out.println("EVEN NEGATIVE");
                    }
                } else {
                    if (X > 0) {
                        System.out.println("ODD POSITIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }

            i++;
        } while (i < N);




    }
}