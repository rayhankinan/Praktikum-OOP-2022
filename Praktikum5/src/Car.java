public class Car {

    private int fuel;
    private int fuelCapacity;
    private boolean isRunning;

    public Car() {
        this.fuel = 0;
        this.fuelCapacity = 100;
        this.isRunning = false;
    }

    // Diasumsikan fuelCapacity > 0
    public Car(int fuelCapacity) {
        this.fuel = 0;
        this.fuelCapacity = fuelCapacity;
        this.isRunning = false;
    }

    // TODO
    // Mengurangi fuel sebanyak (km) dengan km > 0
    // Jika km tidak valid, lemparkan InvalidInputException
    // Jika fuel kurang dari km, lemparkan NotEnoughFuelException dengan jumlah fuel yang diperlukan sebagai keterangan exception
    // Jika mobil belum dinyalakan, lemparkan CarNotStartedException
    public void drive(int km) throws Exception {
      if (km <= 0) {
        throw new InvalidInputException(km);
      } else if (this.fuel < km) {
        throw new NotEnoughFuelException(km - this.fuel);
      } else if (!this.isRunning) {
        throw new CarNotStartedException();
      } else {
        this.fuel -= km;
      }
    }
    
    // TODO
    // Mengisi fuel sebanyak (fillFuel) dengan fuel > 0
    // Jika fuel tidak valid, lemparkan InvalidInputException
    // Jika fuel yang diisi melebihi kapasitas, lemparkan FuelOverflowException dengan jumlah fuel yang kelebihan sebagai keterangan exception
    public void fillCar(int fillFuel) throws Exception {
      if (fillFuel <= 0) {
        throw new InvalidInputException(fillFuel);
      } else if (this.fuel + fillFuel > this.fuelCapacity) {
        throw new FuelOverflowException(this.fuel + fillFuel - this.fuelCapacity);
      } else {
        this.fuel += fillFuel;
      }
    }

    // Memutar starter mobil
    public void turnIgnition() {
        this.isRunning = !this.isRunning;
        if (this.isRunning) {
          System.out.println("Car is now started.");
        } else {
          System.out.println("Car is now stopped.");
        }
    }

    @Override
    public String toString() {
        String run = (this.isRunning) ? "is running" : "is stopped";
        return "Fuel: " + this.fuel + " | FuelCapacity: " + this.fuelCapacity + " | " + run;
    }
}