
/**
 * A candidate to become a ninja. Each aspirant receives a unique, consecutive ID when it is created.
 */
public class Aspirant implements Ninja {

    private static int newID = 1;

    private int id;
    private String name;
    private int age;
    private Clan clan;
    private int abilityLevel;

    /**
     * Constructs a new Aspirant with the specified details and automatically assigns a unique ID.
     * 
     * @param name the aspirant's name
     * @param age the aspirant's age
     * @param clan the aspirant's clan
     * @param abilityLevel the aspirant's ability level
     */
    public Aspirant(String name, int age, Clan clan, int abilityLevel){
        this.name = name;
        this.age = age;
        this.clan = clan;
        this.abilityLevel = abilityLevel;

        id = newID;
        newID++;
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
     * Returns the unique ID assigned to this aspirant.
     * 
     * @return the aspirant ID
     */
    public int getID(){
        return id;
    }

    /**
     * Returns a string representation of the aspirant, including their name, age, clan, and ability level.
     * 
     * @return string of aspirant details
     */
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
        return name + ", " + age + ", clan " + clanString + ", con un nivel de habilidad de " + abilityLevel;
    }
}
