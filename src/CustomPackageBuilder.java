public class CustomPackageBuilder implements PackageBuilder {
    
    private int numOfKunais;
    private int numOfShurikens;
    private int numOfExplosiveTags;
    private int numOfSmokeBombs;
    private int numOfMedKits;

    // falta constructor (crear el paquete)
    public CustomPackageBuilder(int kunais, int shurikens, int explosiveTags, int smokeBombs, int medKits){
        numOfKunais = kunais;
        numOfShurikens = shurikens;
        numOfExplosiveTags = explosiveTags;
        numOfSmokeBombs = smokeBombs;
        numOfMedKits = medKits;
        // Vacio ??
    }

    // Discutir estos metodos
    
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
        tools.add("Kunais", numOfKunais);
    }

    @Override
    public void buildShurikens(){
        tools.add("Shurikens", numOfShurikens);
    }

    @Override
    public void buildExplosiveTags(){
        tools.add("Papeles bomba", numOfExplosiveTags);
    }

    @Override
    public void buildSmokeBombs(){
        tools.add("Bombas de humo", numOfSmokeBombs);
    }
    
    @Override
    public void buildMedKits(){
        tools.add("Botiquines", numOfMedKits);
    }
    
}
