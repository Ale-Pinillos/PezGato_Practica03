public class Volunteer implements Ninja {

    private String name;
    private int age;
    private Clan clan;
    private int abilityLevel;
    private Rank rank;

    public Volunteer(String name, int age, Clan clan, int abilityLevel, Rank rank){
        this.name = name;
        this.age = age;
        this.clan = clan;
        this.abilityLevel = abilityLevel;
        this.rank = rank;
    }

    @Override
    public String name(){
        return name;
    }

    @Override
    public int age(){
        return age;
    }

    @Override
    public Clan clan(){
        return clan;
    }

    @Override
    public int abilityLevel(){
        return abilityLevel;
    }

    public Rank rank(){
        return rank;
    }

    public int maxAspirants(){
        if(this.rank == Rank.GENIN)
            return 1;
        else if(this.rank = Rank.CHUNIN)
            return 2;
        else
            return 3;
    }

    public String toString(){
        //TODO
    }
}
