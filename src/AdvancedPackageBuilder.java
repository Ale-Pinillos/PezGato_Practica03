import java.util.Hashtable;

/**
 * Concrete builder for the advanced package.
 * Each build step adds a fixed quantity of one tool, defined by the constants of this class.
 */
public class AdvancedPackageBuilder extends PackageBuilder {

    private static final int NUMBER_OF_KUNAIS = 0;
    private static final int NUMBER_OF_SHURIKENS = 2;
    private static final int NUMBER_OF_EXPLOSIVE_TAGS = 3;
    private static final int NUMBER_OF_SMOKE_BOMBS = 2;
    private static final int NUMBER_OF_MED_KITS = 2;


    /**
     * Initializes a new instance of {@link AdvancedPackageBuilder} with the name "avanzado" 
     * and an empty tool collection.
     */
    public AdvancedPackageBuilder(){
        name = "avanzado";
        tools = new Hashtable<>();
    }
    
    /**
     * Adds the advanced amount of kunais to the package.
     */
    @Override
    public void buildKunais(){
        tools.put(new NinjaTool("Kunais", 255), NUMBER_OF_KUNAIS);
    }

    /**
     * Adds the advanced amount of shurikens to the package.
     */
    @Override
    public void buildShurikens(){
        tools.put(new NinjaTool("Shurikens", 35), NUMBER_OF_SHURIKENS);
    }

    /**
     * Adds the advanced amount of explosive tags to the package.
     */
    @Override
    public void buildExplosiveTags(){
        tools.put(new NinjaTool("Papeles bomba", 5), NUMBER_OF_EXPLOSIVE_TAGS);
    }

    /**
     * Adds the advanced amount of smoke bombs to the package.
     */
    @Override
    public void buildSmokeBombs(){
        tools.put(new NinjaTool("Bombas de humo", 85), NUMBER_OF_SMOKE_BOMBS);
    }

    /**
     * Adds the advanced amount of medical kits to the package.
     */
    @Override
    public void buildMedKits(){
        tools.put(new NinjaTool("Botiquines", 320), NUMBER_OF_MED_KITS);
    }
    
}
