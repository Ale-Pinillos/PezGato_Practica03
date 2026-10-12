
/**
 * Concrete creator that creates {@link Aspirant} objects.
 * The rank parameter is ignored because aspirants have no rank.
 */
public class AspirantFactory extends NinjaFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Ninja createNinja(String name, int age, Clan clan, int abilityLevel, Rank rank){
        return new Aspirant(name, age, clan, abilityLevel);
    }
}
