import java.util.ArrayList;

/**
 * A group of the Academy: a volunteer leader with the aspirants under their charge,
 * plus the tool package and the training ground assigned to it.
 */
public class Group {

    private Volunteer leader;
    private ArrayList<Aspirant> aspirants;
    private NinjaToolPackage toolPackage;
    private TrainingGround trainingGround;

    /**
     * Constructs a new Group with the specified volunteer leader and initializes 
     * an empty list of aspirants.
     * 
     * @param leader the volunteer leading the group
     */
    public Group(Volunteer leader){
        this.leader = leader;
        aspirants = new ArrayList<>();
        
        toolPackage = null;
        trainingGround = null;
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
    public NinjaToolPackage toolPackage(){
        return toolPackage;
    }

    /**
     * Returns the training ground currently assigned to the group.
     * 
     * @return the assigned trainingGround
     */
    public TrainingGround trainingGround(){
        return trainingGround;
    }

    /**
     * Sets the tool package for the group.
     * 
     * @param newToolPackage the tool package to assign
     */
    public void setToolPackage(NinjaToolPackage newToolPackage){ 
        this.toolPackage = newToolPackage;
    }

    /**
     * Sets the training ground for the group.
     * 
     * @param newTrainingGround the training ground to assign
     */
    public void setTrainingGround(TrainingGround newTrainingGround){
        this.trainingGround = newTrainingGround;
    }

    /**
     * Returns a string detailing the group leader, aspirants, tool package, and training ground.
     * 
     * @return string representation of the group
     */
    @Override 
    public String toString(){
        String string = "==========================================================\n"
            + "El grupo tiene asignado como lider a: \n"
            + this.leader.toString() + "\n\n Los aspirantes del grupo son: \n";

        for(Aspirant aspirant: aspirants){
            string += "- " + aspirant.toString() + "\n";
        }

        string += "\nAl grupo se le asigno " + this.toolPackage.toString();
        string += "Peso total del paquete: " + this.toolPackage.totalWeight() + " gramos\n\n";
        string += "Y su entrenamiento sera en " + this.trainingGround.toString() + "\n";
        string += "==========================================================";
        
        return string;
    }
}
