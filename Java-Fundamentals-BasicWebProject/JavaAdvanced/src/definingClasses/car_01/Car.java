package definingClasses.car_01;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public static String factoryName = "Berlin";
    private String brand;
    private String model;
    private int horsepower;

    private List<String> parts;

    public Car() {
        this.parts = new ArrayList<>();
    }

    public Car(String brand) {
        this(brand, "unknown", -1);
    }

    public Car(String brand, String model, int horsepower) {
        this();

        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String newModel) {
        model = newModel;
    }
    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int newHorsepower) {
       horsepower = newHorsepower;
    }

    public String carInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", this.getBrand(), this.getModel(), this.getHorsepower());
    }


}
