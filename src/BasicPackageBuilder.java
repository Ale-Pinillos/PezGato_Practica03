public class BasicPackageBuilder implements PackageBuilder {

    private static final int NUMBER_OF_KUNAIS = 1;
    private static final int NUMBER_OF_SHURIKENS = 1;
    private static final int NUMBER_OF_EXPLOSIVE_TAGS = 0;
    private static final int NUMBER_OF_SMOKE_BOMBS = 0;
    private static final int NUMBER_OF_MED_KITS = 1;

    public BasicPackageBuilder(){
        
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
