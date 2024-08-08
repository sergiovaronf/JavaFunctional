package _06_Sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.function.BiFunction;

public class MainSam {

    @FunctionalInterface
    interface ValidatePerson<N, E, D, R> {
        R apply(N n , E e, D d);
    }

    public static BiFunction<LocalDate, Integer, Boolean> isCorrectAge = (fecha, edad) -> {
        LocalDate hoy = LocalDate.now();
        int edadFecha = Period.between(fecha, hoy).getYears();
        return edadFecha == edad;
    };

    public static ValidatePerson<String, Integer, LocalDate, String> validarEdad = (nombre, edad, fecha) -> {
        String msgCorrect = isCorrectAge.apply(fecha, edad) ? " corresponde " : " no corresponde ";
        return "La fecha de nacimiento de " + nombre + msgCorrect + "a la edad ingresada.";
    };

    public static void main(String[] args) {

        LocalDate fechaNacimineto = LocalDate.of(1997, 2, 9);

        String result = validarEdad.apply("Camilo", 25, fechaNacimineto);

        System.out.println(result);
    }
}
