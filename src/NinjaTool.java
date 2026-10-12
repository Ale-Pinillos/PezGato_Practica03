
/**
 * A ninja tool (e.g. kunais or shurikens) with its name and unit weight.
 */
public class NinjaTool {
    
    private String name;
    private int weight;

    /**
     * Constructs a new NinjaTool with the specified name and weight.
     * 
     * @param name the name of the tool
     * @param weight the weight of the tool
     */
    public NinjaTool(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    /**
     * Returns the name of the tool.
     * 
     * @return the tool name
     */
    public String name(){
        return name;
    }

    /**
     * Returns the weight of the tool.
     * 
     * @return the tool weight
     */
    public int weight(){
        return weight;
    }
}
