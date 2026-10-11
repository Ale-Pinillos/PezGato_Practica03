public interface Ninja {

    /**
     * Returns the name of the ninja.
     * 
     * @return the ninja's name
     */
    String name();

    /**
     * Returns the age of the ninja.
     * 
     * @return the ninja's age
     */
    int age();

    /**
     * Returns the clan to which the ninja belongs.
     * 
     * @return the ninja's clan
     */
    Clan clan();

    /**
     * Returns the ability level score of the ninja.
     * 
     * @return the ability level
     */
    int abilityLevel();
}
