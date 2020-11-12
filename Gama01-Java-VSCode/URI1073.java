import java.util.Scanner;

public class URI1073 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int X = teclado.nextInt();

        for (int i = 1; i <= X; i++) {
            if (i%2 == 0) {
                System.out.printf("%d^2 = %d%n",i,i*i);
            }
        }


    }
}