
/**
* Abstract training ground. Each concrete ground defines its own name and description.
*/
public abstract class TrainingGround {
    
    /** Name of the training ground. */
    protected String name;
    /** Description of the training ground. */
    protected String description;

    /**
     * Returns the name of the training ground.
     * 
     * @return the training ground name
     */
    public String name(){
        return name;
    }

    /**
     * Returns the description of the training ground.
     * 
     * @return the training ground description
     */
    public String description(){
        return description;
    }

    /**
     * Returns a string representation combining the name and description.
     * 
     * @return string of the training ground
     */
    @Override
    public String toString(){
        return name + ": " + description;
    }
}
