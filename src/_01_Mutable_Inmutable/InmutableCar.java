package _01_Mutable_Inmutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class InmutableCar {

    private final String brand;
    private final String model;
    private final int year;
    private final List<String> characteristics;

    public InmutableCar(String brand, String model, int year, List<String> characteristics) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.characteristics = new ArrayList<>(characteristics);
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public List<String> getCharacteristics() {
        return Collections.unmodifiableList(characteristics);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + brand + '\'' +
                ", modelo='" + model + '\'' +
                ", año=" + year +
                ", características=" + characteristics +
                '}';
    }
}
