package _01_Mutable_Inmutable;

import java.util.ArrayList;
import java.util.List;

public class MutableCar {
    private String brand;
    private String model;
    private int year;
    private List<String> characteristics;

    public MutableCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public List<String> getCharacteristics() {
        return characteristics;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCharacteristics(List<String> characteristics) {
        this.characteristics = characteristics;
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
