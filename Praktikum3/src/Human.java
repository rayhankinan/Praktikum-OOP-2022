public class Human extends Animal {
    public Human() {
        super(2);
    }

    public void eat(String food) {
        this.hungry = food.equals("teman");
    }

    public void run() {
        System.out.println("Human is running");
    }
}
