import java.util.Hashtable;

/**
 * Concrete builder for the custom tool package.
 * Unlike the prefabricated builders, the quantity of each tool is accumulated with the
 * add methods before the build steps are executed.
 */
public class CustomPackageBuilder extends PackageBuilder {
    
    private int numOfKunais;
    private int numOfShurikens;
    private int numOfExplosiveTags;
    private int numOfSmokeBombs;
    private int numOfMedKits;


    /**
     * Initializes a new instance of {@link CustomPackageBuilder} with the name "personalizado" 
     * and an empty tool collection.
     */
    public CustomPackageBuilder(){
        name = "personalizado";
        tools = new Hashtable<>();
    }

    /**
     * Increases the quantity of kunais by the specified amount.
     * 
     * @param newAmount the amount to add
     */
    public void addKunais(int newAmount){
        numOfKunais += newAmount;
    }

    /**
     * Increases the quantity of shurikens by the specified amount.
     * 
     * @param newAmount the amount to add
     */
    public void addShurikens(int newAmount){
        numOfShurikens += newAmount;
    }

    /**
     * Increases the quantity of explosive tags by the specified amount.
     * 
     * @param newAmount the amount to add
     */
    public void addExplosiveTags(int newAmount){
        numOfExplosiveTags += newAmount;
    }

    /**
     * Increases the quantity of smoke bombs by the specified amount.
     * 
     * @param newAmount the amount to add
     */
    public void addSmokeBombs(int newAmount){
        numOfSmokeBombs += newAmount;
    }

    /**
     * Increases the quantity of medical kits by the specified amount.
     * 
     * @param newAmount the amount to add
     */
    public void addMedKits(int newAmount){
        numOfMedKits += newAmount;
    }

    /**
     * Builds and adds the custom accumulated quantity of kunais to the package.
     */
    @Override
    public void buildKunais(){
        tools.put(new NinjaTool("Kunais", 255), numOfKunais);
    }

    /**
     * Builds and adds the custom accumulated quantity of shurikens to the package.
     */
    @Override
    public void buildShurikens(){
        tools.put(new NinjaTool("Shurikens", 35), numOfShurikens);
    }

    /**
     * Builds and adds the custom accumulated quantity of explosive tags to the package.
     */
    @Override
    public void buildExplosiveTags(){
        tools.put(new NinjaTool("Papeles bomba", 5), numOfExplosiveTags);
    }

    /**
     * Builds and adds the custom accumulated quantity of smoke bombs to the package.
     */
    @Override
    public void buildSmokeBombs(){
        tools.put(new NinjaTool("Bombas de humo", 85), numOfSmokeBombs);
    }

    /**
     * Builds and adds the custom accumulated quantity of medical kits to the package.
     */
    @Override
    public void buildMedKits(){
        tools.put(new NinjaTool("Botiquines", 320), numOfMedKits);
    }
    
}
