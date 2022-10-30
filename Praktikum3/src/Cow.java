public class Cow extends Animal {
    public Cow() {
        super(4);
    }

    public void eat(String food) {
        this.hungry = !food.equals("grass");
    }

    public void run() {
        super.run();
        System.out.println("Cow is running");
    }
}
