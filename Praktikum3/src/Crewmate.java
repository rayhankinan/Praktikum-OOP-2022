public class Crewmate {
    private int stabCount;

    public String name;
    public boolean isDead;

    public static int id = 1;

    public Crewmate() {
        this.name = String.format("Crewmate %d", id);
        Crewmate.id++;

        this.isDead = false;
        this.stabCount = 0;
    }

    public Crewmate(String name) {
        this.name = name;
        this.isDead = false;
        this.stabCount = 0;
    }

    void stab(Crewmate victim) {
        if (this.isDead) {
            System.out.printf("%s is dead\n", this.name);

        } else {
            System.out.printf("%s stabs %s\n", this.name, victim.name);

            victim.isDead = true;
            this.stabCount++;
        }
    }

    @Override
    public String toString() {
        if (this.isDead) {
            return String.format("%s is dead", this.name);
        } else if (!this.isDead && this.stabCount > 0) {
            return String.format("%s is sus", this.name);
        } else {
            return String.format("%s is cool", this.name);
        }
    }
}
