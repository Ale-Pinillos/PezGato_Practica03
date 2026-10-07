import java.util.Hashtable;
import java.util.Set;

public class NinjaToolPackage{

    private String name;
    private Hashtable<NinjaTool, Integer> listOfTools;

    public NinjaToolPackage(){}

    public void setName(String newName){
        this.name = newName;
    }

    public Hashtable<NinjaTool, Integer> tools(){
        return listOfTools;
    }

    public void setTools(Hashtable<NinjaTool, Integer> tools){
        listOfTools = tools;
    } 

    public int totalWeight(){
        int totalWeight = 0;

        Set<NinjaTool> tools = listOfTools.keySet();
        
        for(NinjaTool t: tools){
            totalWeight += listOfTools.get(t) * t.weight();
        }

        return totalWeight;
    }

    public String toString(){
        // TODO
        return "";
    }
}
