package definingClassesExercise.speedRacing_03;

public class Car {
    //полета - характеристики
    private String model;
    private double fuelAmount;
    private double priceFuelPerKm;
    private int distanceTraveled;

    // методи - действия
    // конструктор - метод, чрез който създаваме обекти от нашия клас
    public Car(String model, double fuelAmount, double priceFuelPerKm) {
        //нов празен обект
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.priceFuelPerKm = priceFuelPerKm;
        this.distanceTraveled = 0;
    }

    public boolean drive(int kmDrive) {
        double needFuel = kmDrive * this.priceFuelPerKm;
        if (needFuel <= this.fuelAmount) {
            this.fuelAmount -= needFuel;
            this.distanceTraveled += kmDrive;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled);
    }
}
