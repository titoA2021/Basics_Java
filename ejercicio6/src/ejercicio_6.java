import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        /* Hacer un programa que calcule el cuadrado de una suma

         */
        Scanner entrada = new Scanner(System.in);
        final double a, b, res;
        System.out.println("Ingrese a y b: ");
        a = entrada.nextDouble();
        b = entrada.nextDouble();

        res = Math.pow(a,2) + Math.pow(b,2) + 2*a*b;

        System.out.println("El cuadrado de la suma es: " + res);
    }
}