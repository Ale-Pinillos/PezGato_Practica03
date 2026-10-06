public class GroundFactory {

    public TrainingGround createTrainingGround(int totalAbilityLevel){
        if(totalAbilityLevel <= 7)
            return new DragonValleyGround();
        else if(totalAbilityLevel >= 12)
            return new SpiritMountainGround();
        else
            return new ShadowForestGround();
    }
}
