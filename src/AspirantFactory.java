public class AspirantFactory extends NinjaFactory {

    @Override
    public Ninja createNinja(String name, int age, Clan clan, int abilityLevel, Rank rank){
        return new Aspirant(name, age, clan, abilityLevel);
    }
}
