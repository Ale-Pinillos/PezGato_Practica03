public class CustomPackageBuilder implements PackageBuilder {
    
    private int numOfKunais;
    private int numOfShurikens;
    private int numOfExplosiveTags;
    private int numOfSmokeBombs;
    private int numOfMedKits;
    private NinjaToolPackage ninjaToolPackage;

    // falta constructor (crear el paquete)

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
