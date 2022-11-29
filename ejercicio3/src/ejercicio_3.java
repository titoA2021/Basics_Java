import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        /*
        Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
        Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
        Hacer un prorama que calcule e imprima la cantidad de dinero que tienen entre los 3.
         */
        Scanner entrada = new Scanner(System.in);
        double Guillermo, Luis, Juan, Total;

        System.out.println("Cuantos dolares tiene Guillermo: ");
        Guillermo = entrada.nextDouble();

        Luis = Guillermo/2;
        Juan = (Guillermo + Luis)/2;
        Total = Juan + Luis + Guillermo;
        System.out.println("Guillermo tiene " + Guillermo + " dolares, Luis tiene " + Luis + " dolares, y Juan tiene " + Juan + " dolares" );
        System.out.println("\nEl total de dolares entre los 3 es : " + Total);


    }
}