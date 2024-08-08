package _09;
import _04_Books.Libro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MainOptional {

    public static List<String> nameList = Arrays.asList("Camilo", "Carlos", "David", "David Camilo");

    public static List<String> filterNames( String name){
        return nameList.stream()
                .filter(n -> n.contains(name))
                .collect(Collectors.toList());
    }

    public static Optional<List<String>> getOptionalNames( List<String> listFilter ){
        return Optional.of(listFilter);
    }


    public static void main(String[] args) {
        String nameF = "Camilo";
        List<String> namesFiltered = MainOptional.filterNames(nameF);
        Optional<List<String>> listOptional = MainOptional.getOptionalNames(namesFiltered);

        listOptional.ifPresentOrElse(
                list -> list.forEach(System.out::println),
                () -> System.out.println("No se encontraron nombres filtrados por " + nameF)
        );
    }
}
