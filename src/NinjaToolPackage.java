import java.util.Hashtable;

public class NinjaToolPackage {

    private String name;
    private Hashtable<NinjaTool, Integer> listOfTools;

    // falta constructor

    public void setName(String newName){
        this.name = newName;
    }

    public Hashtable<NinjaTool, Integer> tools(){
        return listOfTools;
    }

    public void addTool(NinjaTool tool, int amount){
        // falta decidir que pasa con cantidad 0 y con una herramienta repetida
    } 

    public int totalWeight(){

    }

    public String toString(){
        
    }
}