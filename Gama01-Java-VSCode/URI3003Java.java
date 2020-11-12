import java.util.Scanner;

public class URI3003Java {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int A,B,soma;
        A = teclado.nextInt();
        B = teclado.nextInt();
        
        soma = A + B;
        
        System.out.println("SOMA = " + soma);
        
    }
}