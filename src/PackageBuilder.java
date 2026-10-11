import java.util.Hashtable;

public abstract class PackageBuilder {

    protected String name;
    protected Hashtable<NinjaTool, Integer> tools;

    /** Builds the quantity of kunais for the package. */
    public abstract void buildKunais();

    /** Builds the quantity of shurikens for the package. */
    public abstract void buildShurikens();

    /** Builds the quantity of explosive tags for the package. */
    public abstract void buildExplosiveTags();

    /** Builds the quantity of smoke bombs for the package. */
    public abstract void buildSmokeBombs();

    /** Builds the quantity of medical kits for the package. */
    public abstract void buildMedKits();


    /**
     * Constructs and returns the final {@link NinjaToolPackage} populated with 
     * the package name and tool configuration.
     * 
     * @return the fully assembled NinjaToolPackage
     */
    public NinjaToolPackage getPackage(){
        NinjaToolPackage newPackage = new NinjaToolPackage();

        newPackage.setName(name);
        newPackage.setTools(tools); // Probably better than addTool()

        return newPackage;
    }
    
}
