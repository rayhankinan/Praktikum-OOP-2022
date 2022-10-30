// Buat kelas GhostPokemon yang merupakan turunan dari kelas Pokemon dan mengimplementasi interface ElementalType<String>

// Atribut tolong dilihat sendiri pada diagram kelas

// Buat constructor tanpa parameter, meng-assign "Ghost" ke atribut elementalName dan mencetak "ctor1 GhostPokemon" ke layar

// Buat constructor dengan parameter String name, meng-assign "Ghost" ke atribut elementalName dan mencetak "ctor2 GhostPokemon" ke layar

// Buat prosedur checkElement yang mencetak "[name] have [elementName] type" ke layar

// Override prosedur displayClass yang mencetak "Sub Class GhostPokemon"

// Realisasi prosedur displayAura, mencetak "There is ominous aura around"

// Realisasi prosedur specialSkill, mencetak "Special skill invisible"

// Realisasi setUniqueID dan getUniqueID

public class GhostPokemon extends Pokemon implements ElementalType<String> {
    private String id;
    private String elementalName;

    public GhostPokemon() {
        super();
        this.elementalName = "Ghost";
        System.out.println("ctor1 GhostPokemon");
    }

    public GhostPokemon(String name) {
        super(name);
        this.elementalName = "Ghost";
        System.out.println("ctor2 GhostPokemon");
    }

    public void checkElement() {
        System.out.printf("%s have %s type\n", this.name, this.elementalName);
    }

    @Override
    public void displayClass() {
        System.out.println("Sub Class GhostPokemon");
    }

    @Override
    public void displayAura() {
        System.out.println("There is ominous aura around");
    }

    @Override
    public void specialSkill() {
        System.out.println("Special skill invisible");
    }

    @Override
    public String getUniqueID() {
        return this.id;
    }

    @Override
    public void setUniqueID(String id) {
        this.id = id;
    }
}
