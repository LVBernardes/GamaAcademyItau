import java.util.Scanner;

public class URI1114 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int N;
        boolean correct = false;

        while (!correct) {
            N = teclado.nextInt();
            if (N == 2002) {
                correct = true;
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
            
        }
    }
}