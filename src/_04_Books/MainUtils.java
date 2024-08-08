package _04_Books;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MainUtils {

    public static List<Libro> libros = new ArrayList<>();

    public static Predicate<Double> validacionPuntaje = puntaje -> puntaje >= 5.0;

    public static UnaryOperator<String> mensaje = msg -> "El Libro " + msg + " es recomendado.";


    public static void crearLibros(){
        Supplier<Libro> libro1 = () -> new Libro("Game1", "RRMartin", 10.0);
        Supplier<Libro> libro2 = () -> new Libro("Game2", "RRMartin", 5.0);
        Supplier<Libro> libro3 = () -> new Libro("Game3", "RRMartin", 1.0);
        Supplier<Libro> libro4 = () -> new Libro("Game4", "RRMartin", 6.0);

        libros.add(libro1.get());
        libros.add(libro2.get());
        libros.add(libro3.get());
        libros.add(libro4.get());
    }

    public static void recomendacion(){
        Consumer<Libro> libroConsumer = libro -> {
            if (validacionPuntaje.test(libro.getPuntaje())){
                System.out.println(mensaje.apply(libro.getNombre()));
            }
        };
        libros.forEach(libroConsumer);
    }

    public static void main(String[] args) {
        crearLibros();
        recomendacion();
    }

}
