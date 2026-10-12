
/**
* Abstract creator. Subclasses decide which type of {@link TrainingGround} is created.
*/
public abstract class GroundFactory {

   /**
    * Creates and returns a training ground depending on the given total ability level.
    *
    * @param totalAbilityLevel the combined ability level of the group
    * @return a {@link TrainingGround} instance
    */
   public abstract TrainingGround createTrainingGround(int totalAbilityLevel);
}