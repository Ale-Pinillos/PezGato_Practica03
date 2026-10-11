import java.util.ArrayList;

public class Group {

    private Volunteer leader;
    private ArrayList<Aspirant> aspirants;
    private NinjaToolPackage currentToolPackage;
    private TrainingGround currentTrainingGround;

    /**
     * Constructs a new Group with the specified volunteer leader and initializes 
     * an empty list of aspirants.
     * 
     * @param leader the volunteer leading the group
     */
    public Group(Volunteer leader){
        this.leader = leader;
        aspirants = new ArrayList<>();
        
        currentToolPackage = null;
        currentTrainingGround = null;
    }

    /**
     * Adds an aspirant to the group and returns a confirmation message.
     * 
     * @param newAspirant the aspirant to add
     * @return a confirmation string indicating the assignment
     */
    public String addAspirant(Aspirant newAspirant){
        aspirants.add(newAspirant);

        return newAspirant.name() + " fue asignado al grupo de " + leader.name();
    }

    /**
     * Calculates the combined total ability level of the group leader and all assigned aspirants.
     * 
     * @return the total ability level
     */
    public int totalAbilityLevel(){
        int totalAbilityLevel = leader.abilityLevel();
        
        for(Aspirant a:aspirants){
            totalAbilityLevel += a.abilityLevel();
        }

        return totalAbilityLevel;
    }

    /**
     * Returns the tool package currently assigned to the group.
     * 
     * @return the assigned NinjaToolPackage
     */
    public NinjaToolPackage currentToolPackage(){
        return currentToolPackage;
    }

    /**
     * Returns the training ground currently assigned to the group.
     * 
     * @return the assigned TrainingGround
     */
    public TrainingGround currentTrainingGround(){
        return currentTrainingGround;
    }

    /**
     * Sets the tool package for the group.
     * 
     * @param newToolPackage the tool package to assign
     */
    public void setToolPackage(NinjaToolPackage newToolPackage){ 
        this.currentToolPackage = newToolPackage;
    }

    /**
     * Sets the training ground for the group.
     * 
     * @param newTrainingGround the training ground to assign
     */
    public void setTrainingGround(TrainingGround newTrainingGround){
        this.currentTrainingGround = newTrainingGround;
    }

    /**
     * Returns a string detailing the group leader, aspirants, tool package, and training ground.
     * 
     * @return string representation of the group
     */
    public String toString(){
        String string = "==========================================================\n"
            + "El grupo tiene asignado como lider a: \n"
            + this.leader.toString() + "\n\n Los aspirantes del grupo son: \n";

        for(Aspirant aspirant: aspirants){
            string += "- " + aspirant.toString() + "\n";
        }

        string += "\nAl grupo se le fue asignado " + this.currentToolPackage.toString() + "\n";
        string += "Y su entrenamiento sera en " + this.currentTrainingGround.toString() + "\n";
        string += "==========================================================";
        
        return string;
    }
}
