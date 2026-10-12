
/**
 * Concrete creator of the Factory Method pattern that creates {@link Volunteer} objects.
 */
public class VolunteerFactory extends NinjaFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Ninja createNinja(String name, int age, Clan clan, int abilityLevel, Rank rank){
        return new Volunteer(name, age, clan, abilityLevel, rank);
    }
}
