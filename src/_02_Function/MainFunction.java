package _02_Function;

import java.util.Scanner;
import java.util.function.*;

public class MainFunction {

    //Funcion Potencia de un número con un exponencial dado
    public static BiFunction<Integer, Integer, Double> potencia = (base, exponencial) -> Math.pow(base, exponencial);

    //Funcion Potencia de un número sin un exponencial dado
    public static Function<Integer, Double> potenciaSE = base -> Math.pow(base, 2);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero o base:");
        int base = scanner.nextInt();

        System.out.println("Ingrese el exponente:");
        int exponentical = scanner.nextInt();

        double result = potencia.apply(base, exponentical);
        //double result = potenciaSE.apply(base, exponentical);

        System.out.println("Resultado = " + result);
    }
}
