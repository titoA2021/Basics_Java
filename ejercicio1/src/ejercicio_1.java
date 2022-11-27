import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        //Hacer un programa que calcula e imprima la suma de 3 calificaciones
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        System.out.println("Digite 3 clasificaciones: "); // Se ponen con , y no con punto
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota1 + nota2 + nota3;

        System.out.println("\nLa suma es: " + suma); //Salto de linea
    }
}