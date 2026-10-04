public class BasicPackageBuilder implements PackageBuilder {

    private static final int NUMBER_OF_KUNAIS = 1;
    private static final int NUMBER_OF_SHURIKENS = 1;
    private static final int NUMBER_OF_EXPLOSIVE_TAGS = 0;
    private static final int NUMBER_OF_SMOKE_BOMBS = 0;
    private static final int NUMBER_OF_MED_KITS = 1;
    private NinjaToolPackage ninjaToolPackage;

    // falta constructor 

    @Override
    public void buildKunais(){

    }

    @Override
    public void buildShurikens(){

    }

    @Override
    public void buildExplosiveTags(){

    }

    @Override
    public void buildSmokeBombs(){
        
    }
    
    @Override
    public void buildMedKits(){

    }

    @Override
    public NinjaToolPackage getPackage(){ 
        return ninjaToolPackage;
    }
}
