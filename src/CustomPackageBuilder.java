import java.util.Hashtable;

public class CustomPackageBuilder extends PackageBuilder {
    
    private int numOfKunais;
    private int numOfShurikens;
    private int numOfExplosiveTags;
    private int numOfSmokeBombs;
    private int numOfMedKits;

    
    public CustomPackageBuilder(){
        
        tools = new Hashtable<>();
    }

    
    public void addNumOfKunais(int newAmount){
        numOfKunais += newAmount;
    }

    public void addNumOfShurikens(int newAmount){
        numOfShurikens += newAmount;
    }

    public void addNumOfExplosiveTags(int newAmount){
        numOfExplosiveTags += newAmount;
    }

    public void addNumOfSmokeBombs(int newAmount){
        numOfSmokeBombs += newAmount;
    }

    public void addNumOfMedKits(int newAmount){
        numOfMedKits += newAmount;
    }
    //
    
    @Override
    public void buildKunais(){
        tools.put(new NinjaTool("Kunais", 255), numOfKunais);
    }

    @Override
    public void buildShurikens(){
        tools.put(new NinjaTool("Shurikens", 35), numOfShurikens);
    }

    @Override
    public void buildExplosiveTags(){
        tools.put(new NinjaTool("Papeles bomba", 5), numOfExplosiveTags);
    }

    @Override
    public void buildSmokeBombs(){
        tools.put(new NinjaTool("Bombas de humo", 85), numOfSmokeBombs);
    }
    
    @Override
    public void buildMedKits(){
        tools.put(new NinjaTool("Botiquines", 320), numOfMedKits);
    }
    
}
