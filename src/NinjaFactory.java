
/**
 * Abstract creator. Subclasses decide which type of {@link Ninja} is created.
 */
public abstract class NinjaFactory {

    /**
     * Creates and returns a new ninja with the specified attributes.
     * 
     * @param name the name of the ninja
     * @param age the age of the ninja
     * @param clan the clan of the ninja
     * @param abilityLevel the ability level of the ninja
     * @param rank the rank of the ninja
     * @return the created Ninja instance
     */
    public abstract Ninja createNinja(String name, int age, Clan clan, int abilityLevel, Rank rank);
}
