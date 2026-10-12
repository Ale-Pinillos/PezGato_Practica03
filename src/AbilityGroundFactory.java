
/**
* Concrete creator that decides the {@link TrainingGround} of a group
* according to its total ability level.
*/
public class AbilityGroundFactory extends GroundFactory {

   /**
    * {@inheritDoc}
    * Returns a DragonValleyGround for a total of 7 or less, a SpiritMountainGround for 12 or more,
    * and a ShadowForestGround otherwise.
    */
   @Override
   public TrainingGround createTrainingGround(int totalAbilityLevel){
       if(totalAbilityLevel <= 7)
           return new DragonValleyGround();
       else if(totalAbilityLevel >= 12)
           return new SpiritMountainGround();
       else
           return new ShadowForestGround();
   }
}
