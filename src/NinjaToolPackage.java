import java.util.Hashtable;

public class NinjaToolPackage{

    private String name;
    private Hashtable<NinjaTool, Integer> listOfTools;

    // falta constructor
    public NinjaToolPackage(){}

    public void setName(String newName){
        this.name = newName;
    }

    public Hashtable<NinjaTool, Integer> tools(){
        return listOfTools;
    }

    // Por que no setTools ??
    public void addTool(NinjaTool tool, int amount){
        // falta decidir que pasa con cantidad 0 y con una herramienta repetida
    } 

    public int totalWeight(){
        int totalWeight = 0;

        Set<NinjaTool> tools = listOfTools.keySet();
        
        for(NinjaTool t: tools){
            totalWeight += t.get(t) * t.weight();
        }

        return totalWeight;
    }

    public String toString(){
        
    }
}
