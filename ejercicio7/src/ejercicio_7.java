import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        /*
        Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
        Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas
         */

        Scanner entrada = new Scanner(System.in);
        int horas, semanas, dias, horaEqui;

        System.out.println("Ingrese el número de horas: ");
        horas = entrada.nextInt();

        semanas = horas/168; //Primero calculo cuantas semanas hay
        dias = horas%168 /24; //Le saco las semanas que tengo y lo divido entre 24
        horaEqui = horas%24; //Calculo las horas restantes

        System.out.println("El equivalente es: ");
        System.out.println("\nSemanas: " + semanas + "\nDías: " + dias + "\nHoras equivalentes: " + horaEqui);

    }
}