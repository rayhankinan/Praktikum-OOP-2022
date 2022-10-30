import java.util.List;
import java.util.ArrayList;

public class SummonedCharacter implements ISummoned {
    private Character summonedCharacter;
    private int level;
    private int exp;
    private List<Spell> activeSpells;

    public SummonedCharacter(Character summonedCharacter, int level, int exp) {
        this.summonedCharacter = summonedCharacter;
        this.level = level;
        this.exp = exp;
        this.activeSpells = new ArrayList<Spell>();
    }

    public int getLevel() {
        return this.level;
    }

    public int getExp() {
        return this.exp;
    }

    public void addSpell(Spell s) {
        this.activeSpells.add(s);
    }

    public List<Spell> getActiveSpells() {
        return this.activeSpells;
    }

    public void levelUp() {
        this.level++;
        this.exp = 0;
        this.summonedCharacter = new Character(this.summonedCharacter.getName(), this.summonedCharacter.getAttackValue() + this.summonedCharacter.getAttackUpValue(), this.summonedCharacter.getHpValue() + this.summonedCharacter.getHealthUpValue(), this.summonedCharacter.getAttackUpValue(), this.summonedCharacter.getHealthUpValue());
    }

    public void render() {
        System.out.printf("Nama: %s\n", this.summonedCharacter.getName());
        System.out.printf("Level: %d\n", this.level);
        System.out.printf("Exp: %d\n", this.exp);
        System.out.printf("Atk: %d\n", this.summonedCharacter.getAttackValue());
        System.out.printf("Hp: %d\n", this.summonedCharacter.getHpValue());

        System.out.printf("Memiliki %d spell aktif:\n", this.activeSpells.size());
        for (Spell s : this.activeSpells) {
            System.out.printf("- %s\n", s.getName());
        }
        System.out.println();
    }
}
