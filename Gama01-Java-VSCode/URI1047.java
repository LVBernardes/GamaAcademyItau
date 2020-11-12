import java.util.Scanner;

public class URI1047 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);

        int startH,startM,endH,endM,interval;

        startH = teclado.nextInt();
        startM = teclado.nextInt();
        endH = teclado.nextInt();
        endM = teclado.nextInt();

        if (startH >= endH) {
            interval = (24 + (endH - startH))*60 + (endM - startM);

            System.out.println("O JOGO DUROU " + interval/60 + " HORA(S) E " + interval%60 + " MINUTO(S)");

        } else {
            interval = (endH - startH)*60 + (endM - startM);
            
            System.out.println("O JOGO DUROU " + interval/60 + " HORA(S) E " + interval%60 + " MINUTO(S)");
        }

    }
}