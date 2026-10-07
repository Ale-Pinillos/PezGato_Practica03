import java.util.Hashtable;

public class TacticalPackageBuilder extends PackageBuilder {

    private static final int NUMBER_OF_KUNAIS = 3;
    private static final int NUMBER_OF_SHURIKENS = 2;
    private static final int NUMBER_OF_EXPLOSIVE_TAGS = 4;
    private static final int NUMBER_OF_SMOKE_BOMBS = 2;
    private static final int NUMBER_OF_MED_KITS = 0;

    
    public TacticalPackageBuilder(){
        tools = new Hashtable<>();
    }

    @Override
    public void buildKunais(){
        tools.put(new NinjaTool("Kunais", 255), NUMBER_OF_KUNAIS);
    }

    @Override
    public void buildShurikens(){
        tools.put(new NinjaTool("Shurikens", 35), NUMBER_OF_SHURIKENS);
    }

    @Override
    public void buildExplosiveTags(){
        tools.put(new NinjaTool("Papeles bomba", 5), NUMBER_OF_EXPLOSIVE_TAGS);
    }

    @Override
    public void buildSmokeBombs(){
        tools.put(new NinjaTool("Bombas de humo", 85), NUMBER_OF_SMOKE_BOMBS);
    }
    
    @Override
    public void buildMedKits(){
        tools.put(new NinjaTool("Botiquines", 320), NUMBER_OF_MED_KITS);
    }
    
}
