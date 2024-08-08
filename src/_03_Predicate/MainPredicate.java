package _03_Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class MainPredicate {

    //Validar Par
    public static Predicate<Integer> par = num -> num % 2 == 0;

    //Validar Impar
    public static Predicate<Integer> impar = num -> num % 2 == 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero:");
        int numero = scanner.nextInt();

        boolean resultPar = par.test(numero);
        boolean resultImpar = impar.test(numero);

        System.out.println("Par: " + (resultPar ? "Si" : "No"));
        System.out.println("Impar: " + (resultImpar ? "Si" : "No"));
    }

}
