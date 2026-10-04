public class Aspirant implements Ninja {

    private String name;
    private int age;
    private String clan; // falta decidir si clan es String o enum 
    private int abilityLevel;

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

    public String toString(){
        
    }
}
