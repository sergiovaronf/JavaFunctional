package _07_Operator;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class MainOperator {

    public static <F> List<F> getFechas(F... elements) {
        return Arrays.asList(elements);
    }

    public static void imprimirFecha(LocalDate date) {
        int dia = date.getDayOfMonth();
        String mes = date.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        int anio = date.getYear();
        System.out.println("La fecha es " + dia + " de " + mes + " del " + anio);
    }

    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(1999, 2, 9);
        LocalDate fecha2 = LocalDate.of(2015, 4, 19);
        LocalDate fecha3 = LocalDate.of(2020, 1, 2);

        List<LocalDate> fechas = getFechas(fecha1, fecha2, fecha3);

        fechas.forEach(MainOperator::imprimirFecha);
    }
}