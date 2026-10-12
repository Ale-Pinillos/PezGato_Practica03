import java.util.Hashtable;

/**
 * Abstract builder that declares the steps to assemble a {@link NinjaToolPackage}.
 * Each concrete builder decides the quantity of every tool.
 */
public abstract class PackageBuilder {

    /** Name of the package being built. */
    protected String name;
    /** Tools of the package being built, mapped to their quantity. */
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
        newPackage.setTools(tools);

        return newPackage;
    }
    
}
