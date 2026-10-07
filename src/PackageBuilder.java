import java.util.Hashtable;

public abstract class PackageBuilder {

    protected String name;
    protected Hashtable<NinjaTool, Integer> tools;
    
    public abstract void buildKunais();
    public abstract void buildShurikens();
    public abstract void buildExplosiveTags();
    public abstract void buildSmokeBombs();
    public abstract void buildMedKits();
    
    public NinjaToolPackage getPackage(){
        NinjaToolPackage newPackage = new NinjaToolPackage();

        newPackage.setName(name);
        newPackage.setTools(tools); // Probablemente mejor que addTool()

        return newPackage;
    }
    
}
