import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        Scanner teclado;

        int time,hour,min,sec;

        teclado = new Scanner(System.in);

        time = teclado.nextInt();
        
        hour = time / 3600;
        min = (time % 3600) / 60;
        sec = (time % 3600) % 60;


        System.out.println(hour + ":" + min + ":" + sec);
    }
}