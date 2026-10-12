
/**
 * A volunteer ninja that leads a group. The maximum number of aspirants it can lead depends on its rank.
 */
public class Volunteer implements Ninja {

    private String name;
    private int age;
    private Clan clan;
    private int abilityLevel;
    private Rank rank;

    /**
     * Constructs a new Volunteer ninja with the specified attributes.
     * 
     * @param name the volunteer's name
     * @param age the volunteer's age
     * @param clan the volunteer's clan
     * @param abilityLevel the volunteer's ability level
     * @param rank the volunteer's rank
     */
    public Volunteer(String name, int age, Clan clan, int abilityLevel, Rank rank){
        this.name = name;
        this.age = age;
        this.clan = clan;
        this.abilityLevel = abilityLevel;
        this.rank = rank;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String name(){
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int age(){
        return age;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Clan clan(){
        return clan;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int abilityLevel(){
        return abilityLevel;
    }

    /**
     * Returns the rank of the volunteer.
     * 
     * @return the volunteer's rank
     */
    public Rank rank(){
        return rank;
    }

    /**
     * Determines the maximum number of aspirants this volunteer can lead based on their rank.
     * 
     * @return maximum number of aspirants (1 for Genin, 2 for Chunin, 3 for Jonin)
     */
    public int maxAspirants(){
        if(this.rank == Rank.GENIN)
            return 1;
        else if(this.rank == Rank.CHUNIN)
            return 2;
        else
            return 3;
    }

    /**
     * Returns a string representation of the volunteer, including their name, age, clan, ability level, and rank.
     * 
     * @return string of volunteer details
     */
    @Override
    public String toString(){
        String clanString = "";
        switch(this.clan){
            case FUCHIHA:
                clanString = "Fuchiha";
                break;
            case OSOMAKI:
                clanString = "Osomaki";
                break;
            case NACA:
                clanString = "Naca";
                break;
            case MORTALIKA:
                clanString = "Mortalika";
                break;
            case AKIPICHI:
                clanString = "Akipichi";
                break;
        }

        String rankString = "";
        switch(rank){
            case GENIN:
                rankString = "Genin";
                break;
            case CHUNIN:
                rankString = "Chunin";
                break;
            case JONIN:
                rankString = "Jonin";
        }
        return name + ", " + age + ", clan " + clanString + ", con un nivel de habilidad de " + abilityLevel + " y rango " + rankString;
    }
}
