public class TacticalPackageBuilder implements PackageBuilder {

    private static final int NUMBER_OF_KUNAIS = 3;
    private static final int NUMBER_OF_SHURIKENS = 2;
    private static final int NUMBER_OF_EXPLOSIVE_TAGS = 4;
    private static final int NUMBER_OF_SMOKE_BOMBS = 2;
    private static final int NUMBER_OF_MED_KITS = 0;

    // falta constructor
    public TacticalPackageBuilder(){
        
    }

    @Override
    public void buildKunais(){
        tools.add("Kunais", NUMBER_OF_KUNAIS);
    }

    @Override
    public void buildShurikens(){
        tools.add("Shurikens", NUMBER_OF_SHURIKENS);
    }

    @Override
    public void buildExplosiveTags(){
        tools.add("Papeles bomba", NUMBER_OF_EXPLOSIVE_TAGS);
    }

    @Override
    public void buildSmokeBombs(){
        tools.add("Bombas de humo", NUMBER_OF_SMOKE_BOMBS);
    }
    
    @Override
    public void buildMedKits(){
        tools.add("Botiquines", NUMBER_OF_MED_KITS);
    }
    
}
