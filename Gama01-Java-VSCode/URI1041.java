import java.util.Scanner;

public class URI1041 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);

        float x,y;

        x = teclado.nextFloat();
        y = teclado.nextFloat();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0f && y != 0f) {
            System.out.println("Eixo X");
        } else if (x != 0f && y == 0f) {
            System.out.println("Eixo Y");
        } else if (x > 0f && y > 0f) {
            System.out.println("Q1");
        } else if (x < 0f && y > 0f) {
            System.out.println("Q2");
        } else if (x < 0f && y < 0f) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
    }
}