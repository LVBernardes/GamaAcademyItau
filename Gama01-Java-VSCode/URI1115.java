import java.util.Scanner;

public class URI1115 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);
        
        float X,Y;
        boolean stop = false;

        while (!stop) {
            X = teclado.nextFloat();
            Y = teclado.nextFloat();

            if (X == 0f || Y == 0f) {
                stop = true;
            } else {
                if (X > 0) {
                    if (Y > 0) {
                        System.out.println("primeiro");
                    } else {
                        System.out.println("quarto");
                    }
                } else {
                    if (Y > 0) {
                        System.out.println("segundo");
                    } else {
                        System.out.println("terceiro");
                    }
                }
            }

        }
    }
}