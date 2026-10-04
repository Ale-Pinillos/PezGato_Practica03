public class Volunteer implements Ninja {

    private String name;
    private int age;
    private String clan; // falta decidir si es String o enum
    private int abilityLevel;
    private String rank; // falta decidir si es String o enum

    // falta constructor

    @Override
    public String name(){
        return name;
    }

    @Override
    public int age(){
        return age;
    }

    @Override
    public String clan(){
        return clan;
    }

    @Override
    public int abilityLevel(){
        return abilityLevel;
    }

    public String rank(){
        return rank;
    }

    public int maxAspirants(){

    }

    public String toString(){
        
    }
}
