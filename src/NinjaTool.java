public class NinjaTool {
    
    private String name;
    private int weight;

    // falta constructor (Es esto correcto o deberiamos hacer una clase por herramienta?)
    public NinjaTool(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String name(){
        return name;
    }

    public int weight(){
        return weight;
    }
}
