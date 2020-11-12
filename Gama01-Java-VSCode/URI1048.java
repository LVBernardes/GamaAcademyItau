import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {

        Scanner teclado;
        teclado = new Scanner(System.in);

        float oldSalary,l1,l2,l3,l4,l5,newSalary,raise;
        oldSalary = teclado.nextFloat();

        l1 = 15f;
        l2 = 12f;
        l3 = 10f;
        l4 = 7f;
        l5 = 4f;


        if (oldSalary <= 400f) {
            raise = oldSalary*l1/100;
            newSalary = oldSalary + raise;

            System.out.printf("Novo salario: %.2f%n",newSalary);
            System.out.printf("Reajuste ganho: %.2f%n",raise);
            System.out.printf("Em percentual: %.0f %%\n",l1);

        } else if (oldSalary > 400f && oldSalary <= 800f) {
            raise = oldSalary*l2/100;
            newSalary = oldSalary + raise;

            System.out.printf("Novo salario: %.2f%n",newSalary);
            System.out.printf("Reajuste ganho: %.2f%n",raise);
            System.out.printf("Em percentual: %.0f %%\n",l2);

        } else if (oldSalary > 800f && oldSalary <= 1200f) {
            raise = oldSalary*l3/100;
            newSalary = oldSalary + raise;

            System.out.printf("Novo salario: %.2f%n",newSalary);
            System.out.printf("Reajuste ganho: %.2f%n",raise);
            System.out.printf("Em percentual: %.0f %%\n",l3);

        } else if (oldSalary > 1200f && oldSalary <= 3000f) {
            raise = oldSalary*l4/100;
            newSalary = oldSalary + raise;

            System.out.printf("Novo salario: %.2f%n",newSalary);
            System.out.printf("Reajuste ganho: %.2f%n",raise);
            System.out.printf("Em percentual: %.0f %%\n",l4);

        } else {
            raise = oldSalary*l5/100;
            newSalary = oldSalary + raise;

            System.out.printf("Novo salario: %.2f%n",newSalary);
            System.out.printf("Reajuste ganho: %.2f%n",raise);
            System.out.printf("Em percentual: %.0f %%\n",l5);
        }

    }
}