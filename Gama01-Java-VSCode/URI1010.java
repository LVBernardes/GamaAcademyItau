import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner teclado;

        int prod1ID,prod2ID,prod1Amount,prod2Amount;
        float prod1Price,prod2Price,total;

        teclado = new Scanner(System.in);

        prod1ID =teclado.nextInt();
        prod1Amount = teclado.nextInt();
        prod1Price = teclado.nextFloat();
        prod2ID =teclado.nextInt();
        prod2Amount = teclado.nextInt();
        prod2Price = teclado.nextFloat();


        total = (prod1Amount*prod1Price) + (prod2Amount*prod2Price);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
    }
}