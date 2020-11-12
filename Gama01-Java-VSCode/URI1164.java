import java.util.Scanner;

public class URI1164 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int interations = teclado.nextInt();
        int j = 0;

        while (j < interations) {
            int sum = 0;
            int N = teclado.nextInt();
            for (int i = 1; i < N; i++) {
                if (N%i == 0) {
                    sum += i;
                }
            }
    
            if (sum == N) {
                System.out.println(N + " eh perfeito");
            } else {
                System.out.println(N + " nao eh perfeito");
            }
            j++;
        }


    }
}