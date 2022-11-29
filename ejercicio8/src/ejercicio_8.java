import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        /*
        Contruir un programa que calcule y muestre por pantalla las raices de la ecuación de segundo grado de coeficientes reales
         ax2 + bx + c = 0
         ecuacion cuadratica
         */

        Scanner entrada = new Scanner(System.in);
        double a, b, c, x1, x2;

        System.out.println("Ingrese las constantes a, b y c: ");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        x1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        x2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

        System.out.println("Los resultados son: " + x1 + "\n" + x2);
    }
}