import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Scanner teclado;
        int id,totalHours;
        float incomeRate, sallary;

        teclado = new Scanner(System.in);

        id = teclado.nextInt();
        totalHours = teclado.nextInt();
        incomeRate = teclado.nextFloat();

        sallary = totalHours*incomeRate;

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f\n",sallary);
    }
}