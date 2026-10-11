public class GroundFactory {

    /**
     * Creates and returns a training ground depending on the given total ability level.
     * 
     * @param totalAbilityLevel the combined ability level of the group
     * @return a {@link TrainingGround} instance (DragonValleyGround, SpiritMountainGround, or ShadowForestGround)
     */
    public TrainingGround createTrainingGround(int totalAbilityLevel){
        if(totalAbilityLevel <= 7)
            return new DragonValleyGround();
        else if(totalAbilityLevel >= 12)
            return new SpiritMountainGround();
        else
            return new ShadowForestGround();
    }
}
