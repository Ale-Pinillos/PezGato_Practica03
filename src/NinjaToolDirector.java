
/**
 * Director that knows the order of the build steps and runs them on the
 * {@link PackageBuilder} it receives, without knowing the quantity of each tool.
 */
public class NinjaToolDirector {
    
    private PackageBuilder toolPackageBuilder;

    /**
     * Constructs a new NinjaToolDirector with the specified package builder.
     * 
     * @param builder the package builder to use
     */
    public NinjaToolDirector(PackageBuilder builder){
        toolPackageBuilder = builder;
    }

    /**
     * Constructs the package by invoking all build steps in sequence and returning the final product.
     * 
     * @return the constructed NinjaToolPackage
     */
    public NinjaToolPackage construct(){

        toolPackageBuilder.buildKunais();
        toolPackageBuilder.buildShurikens();
        toolPackageBuilder.buildExplosiveTags();
        toolPackageBuilder.buildSmokeBombs();
        toolPackageBuilder.buildMedKits();
        
        return toolPackageBuilder.getPackage();
    }
}
