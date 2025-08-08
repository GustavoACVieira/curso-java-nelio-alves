package src.Section8;

public class CarEx57 {
    public String model;
    public double fuel;
    public double fuelConsumption;

    public void drive(double km) {
        double fuelNeeded = km / fuelConsumption;
        if (fuelNeeded <= fuel) {
            fuel -= fuelNeeded;
            System.out.println("Você dirigiu " + km + " km.");
        } else {
            System.out.println("Combustível insuficiente para percorrer " + km + " km.");
        }
    }

    public void refuel(double liters) {
        this.fuel += liters;
    }

    @Override
    public String toString() {
        return "Model: " + model + "\nFuel left: " + String.format("%.2f", fuel) + " liters";
    }
}
