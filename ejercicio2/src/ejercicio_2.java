import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        /*Ejercicio 2
        Hacer un prgrama que calcule e imprima el salario semanal de un empleado a partir
        de sus horas semanales trabajadas y de su salario por hora
         */
        Scanner entrada1 = new Scanner(System.in);
        float horasSemana, salarioHora, salarioSemanal;

        System.out.println("Cuantas horas trbaja a la semana: ");
        horasSemana = entrada1.nextFloat();

        System.out.println("Cuanto gana por hora: ");
        salarioHora = entrada1.nextFloat();

        salarioSemanal = salarioHora*horasSemana;
        System.out.println("El salario semanal es : " + salarioSemanal);
    }
}