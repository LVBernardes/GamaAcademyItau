import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int option;
        int gas = 0;
        int alc = 0;
        int die = 0;
        boolean stop = false;

        while (!stop) {
            option = teclado.nextInt();

            switch (option) {
                case 1:
                    alc++;
                    break;
                case 2:
                    gas++;
                    break;
                case 3:
                    die++;
                    break;
                case 4:
                    stop = true;
                    break;
                default:
                    break;
            }

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + die);

    }
}