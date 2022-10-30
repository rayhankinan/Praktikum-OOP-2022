public class Bike extends NonMotorizedVehicle implements Rideable {
    public Bike() {
        this.name = "Bike";
    }

    public Bike(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public void ride() {
        System.out.printf("Riding a %s\n", this.name);
    }
}
