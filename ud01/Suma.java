import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = sc.nextDouble();

        double suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);

        sc.close();
    }
}
