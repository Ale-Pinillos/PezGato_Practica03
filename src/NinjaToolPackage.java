import java.util.Hashtable;
import java.util.Set;

public class NinjaToolPackage{

    private String name;
    private Hashtable<NinjaTool, Integer> listOfTools;

    /**
     * Default constructor for NinjaToolPackage.
     */
    public NinjaToolPackage(){}

    /**
     * Sets the name of the package.
     * 
     * @param newName the new name for the package
     */
    public void setName(String newName){
        this.name = newName;
    }

    /**
     * Returns the hashtable of tools and their respective quantities.
     * 
     * @return the hashtable of tools
     */
    public Hashtable<NinjaTool, Integer> tools(){
        return listOfTools;
    }

    /**
     * Sets the collection of tools for the package.
     * 
     * @param tools the hashtable of tools and quantities
     */
    public void setTools(Hashtable<NinjaTool, Integer> tools){
        listOfTools = tools;
    } 

    /**
     * Calculates and returns the total weight of all tools in the package.
     * 
     * @return the total weight
     */
    public int totalWeight(){
        int totalWeight = 0;

        Set<NinjaTool> tools = listOfTools.keySet();
        
        for(NinjaTool tool: tools){
            totalWeight += listOfTools.get(tool) * tool.weight();
        }

        return totalWeight;
    }

    /**
     * Returns a string representation of the package and its contents.
     * 
     * @return the string description of the package
     */
    public String toString(){

        String string = "El paquete " + name + ", que contiene: \n";

        Set<NinjaTool> tools = listOfTools.keySet();
        
        for(NinjaTool tool: tools){
            string += "- " + listOfTools.get(tool) + " " + tool.name()
                + " con un peso de " + tool.weight() + " por cada uno\n";
        }
        
        return string;
    }
}
