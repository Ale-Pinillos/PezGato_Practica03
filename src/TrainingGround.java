public abstract class TrainingGround {
    
    protected String name;
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
    public String toString(){
        return name + ": " + description;
    }
}
