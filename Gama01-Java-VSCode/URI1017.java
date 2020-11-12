import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Scanner teclado;

        int spentTime,avgSpeed;
        float totalDistance,fuelAmount,efficiency;

        efficiency = 12.0f;

        teclado = new Scanner(System.in);

        spentTime = teclado.nextInt();
        avgSpeed = teclado.nextInt();

        totalDistance = spentTime*avgSpeed;
        fuelAmount = totalDistance/efficiency;

        System.out.printf("%.3f\n",fuelAmount);
    }
}