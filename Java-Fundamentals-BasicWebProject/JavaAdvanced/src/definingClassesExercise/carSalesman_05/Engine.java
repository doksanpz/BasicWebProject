package definingClassesExercise.carSalesman_05;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    //КОНСТРУКТОР

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    //гетър за да можем да вземем модела на двигатела в мейна
    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
