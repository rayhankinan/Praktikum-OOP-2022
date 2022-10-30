public class Car extends MotorizedVehicle implements Rideable, NeedFuel {
    public Car() {
        this.name = "Car";
        this.fuel = 5;
    }

    public Car(String name, int fuel) {
        this.name = name;
        this.fuel = fuel;
    }

    String getName() {
        return this.name;
    }

    int getFuel() {
        return this.fuel;
    }

    public void ride() {
        if (this.fuel > 0) {
            this.fuel--;
            System.out.printf("Riding a %s, fuel remaining: %d\n", this.name, this.fuel);
        } else {
            System.out.println("No fuel, cannot ride");
        }
    }

    public void fillFuel(int amount) {
        this.fuel += amount;
        System.out.printf("Filled %d units of fuel, fuel now: %d\n", amount, this.fuel);
    }
}
