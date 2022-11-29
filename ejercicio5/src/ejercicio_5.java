import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        /*
        La calificación final de un estudiante de informatica se calcula con base a las calificaciones de 4 aspectos:
        Participacion --> 10%
        Primer examen --> 25%
        Segundo examen --> 25%
        Examen final --> 40%
        Hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante
         */

        Scanner entrada = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, total;

        System.out.println("Ingrese las notas: ");

        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        nota4 = entrada.nextFloat();

        total = (nota1*0.1f) + (nota2*0.25f)+ (nota3*0.25f)+ (nota4*0.4f);
        System.out.println("La nota final es: " + total);
    }
}