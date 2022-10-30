public class Main {
    public static void main(String[] args) {
        System.out.println("--- Section 1 ---");
        
        Pokemon ghostPokemon1 = new GhostPokemon();
        Pokemon fightingPokemon1 = new FightingPokemon();
        Pokemon normalPokemon1 = new NormalPokemon();
        Pokemon pokemon1 = new Pokemon();

        System.out.println(ghostPokemon1.getName());
        System.out.println(fightingPokemon1.getName());
        System.out.println(normalPokemon1.getName());
        System.out.println(pokemon1.getName());

        GhostPokemon ghostPokemon2 = new GhostPokemon("Gastly");
        FightingPokemon fightingPokemon2 = new FightingPokemon("Machop");
        NormalPokemon normalPokemon2 = new NormalPokemon("Rattata");
        Pokemon pokemon2 = new Pokemon("Big Boss");

        System.out.println(ghostPokemon2.getName());
        System.out.println(fightingPokemon2.getName());
        System.out.println(normalPokemon2.getName());
        System.out.println(pokemon2.getName());

        ghostPokemon2.displayClass();
        fightingPokemon2.displayClass();
        normalPokemon2.displayClass();
        pokemon2.displayClass();

        ghostPokemon2.setUniqueID("G1");
        System.out.println(ghostPokemon2.getUniqueID());

        fightingPokemon2.setUniqueID(12);
        System.out.println(fightingPokemon2.getUniqueID());

        System.out.println("--- Section 2 ---");
        ghostPokemon2.checkElement();
        fightingPokemon2.checkElement();
        normalPokemon2.checkElement();

        ghostPokemon2.specialSkill();
        fightingPokemon2.displayAura();
        ghostPokemon2.displayAura();
        fightingPokemon2.specialSkill();

        System.out.println("--- Section 3 ---");
        PokemonAction<GhostPokemon> ghostAction = new PokemonAction<GhostPokemon>(ghostPokemon2);
        PokemonAction<NormalPokemon> normalAction = new PokemonAction<NormalPokemon>(normalPokemon2);

        ghostAction.displayPokemonClass();
        normalAction.displayPokemonClass();

        System.out.printf("%s vs %s\n", ghostPokemon2.getName(), normalPokemon2.getName());

        ghostAction.attack();
        normalAction.defense();
        ghostAction.attack();
        normalAction.defense();
        ghostAction.attack();
        normalAction.defense();
        ghostAction.attack();
        normalAction.defense();
        ghostAction.attack();
        normalAction.defense();
        ghostAction.attack();
        normalAction.defense();
        ghostAction.attack();
        normalAction.defense();

        normalAction.attack();
        ghostAction.defense();
        normalAction.attack();
        ghostAction.defense();
        normalAction.attack();
        ghostAction.defense();
        
        normalAction.useSkill();
        ghostAction.useSkill();

        normalAction.run();

        System.out.println("--- Section 4 ---");
        System.out.println("New Battle Found");

        PokemonAction<FightingPokemon> fightAction = new PokemonAction<FightingPokemon>(fightingPokemon2);
        PokemonAction<Pokemon> action = new PokemonAction<Pokemon>(pokemon2);

        fightAction.displayPokemonClass();
        action.displayPokemonClass();

        System.out.printf("%s vs %s\n", pokemon2.getName(), fightingPokemon2.getName());

        fightAction.attack();
        action.defense();
        fightAction.attack();
        action.defense();
        fightAction.attack();
        action.defense();
        fightAction.attack();
        action.defense();

        action.attack();
        fightAction.defense();
        action.attack();
        fightAction.defense();
        action.attack();
        fightAction.defense();
        action.attack();
        fightAction.defense();
        action.attack();
        fightAction.defense();
        action.attack();
        fightAction.defense();
        action.attack();
        fightAction.defense();
        action.attack();
        fightAction.defense();

        fightAction.useSkill();
        action.useSkill();

        fightAction.run();

        System.out.println("All Battle Finished");
    }
}
