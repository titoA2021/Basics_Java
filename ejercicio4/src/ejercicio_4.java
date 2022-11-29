import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        /*
        Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, mas una
        comisión de $150 por cada carro vendido, mas el 5% del valor de la venta del carro. Cada mes el capturista
        de la empresa ingresa en la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario
        mensual de un vendedor dado.
         */

        Scanner entrada = new Scanner(System.in);
        final int salarioMensual = 1000, comision1 = 150;
        int ventaCarro, ventaComision1;
        double ventaComision2 = 0, comision2, valorComision2,  pagoTotal;

        System.out.println("Cuantos carros vendió: ");
        ventaCarro = entrada.nextInt();
        ventaComision1 = ventaCarro*comision1;

        for (int i = 1; i <= ventaCarro; i++){
            System.out.println("Ingrese el valor de la venta " + i + " : ");
            valorComision2 = entrada.nextDouble();
            ventaComision2 += valorComision2*0.05;
        }
        pagoTotal = salarioMensual + ventaComision1 + ventaComision2;
        System.out.println("Comision 1: " + ventaComision1 + "\nComision 2: " + ventaComision2);
        System.out.println("\nEl salario a total a pagar es: " + pagoTotal);

    }
}