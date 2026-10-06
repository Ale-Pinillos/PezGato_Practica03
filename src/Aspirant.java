public class Aspirant implements Ninja {

    private String name;
    private int age;
    private Clan clan;
    private int abilityLevel;

    public Aspirant(String name, int age, Clan clan, int abilityLevel){
        this.name = name;
        this.age = age;
        this.clan = clan;
        this.abilityLevel = abilityLevel;
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

    public String toString(){
        
    }
}
