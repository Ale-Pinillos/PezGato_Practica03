public abstract class PackageBuilder {

    private String name;
    private Hashtable<NinjaTool, Integer> tools;
    
    public void buildKunais();
    public void buildShurikens();
    public void buildExplosiveTags();
    public void buildSmokeBombs();
    public void buildMedKits();
    
    public NinjaToolPackage getPackage(){
        NinjaToolPackage newPackage = new NinjaToolPackage();

        newPackage.setName(name);
        newPackage.setTools(tools); // Probablemente mejor que addTool()

        return newPackage;
    }
    
}
