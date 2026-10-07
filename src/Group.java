import java.util.ArrayList;

public class Group {

    private Volunteer leader;
    private ArrayList<Aspirant> aspirants;
    private NinjaToolPackage currentToolPackage;
    private TrainingGround currentTrainingGround;

    public Group(Volunteer leader){
        this.leader = leader;
        aspirants = new ArrayList<>();
        
        currentToolPackage = null;
        currentTrainingGround = null;
    }

    public String addAspirant(Aspirant newAspirant){
        aspirants.add(newAspirant);

        return newAspirant.name() + " fue asignado al grupo de " + leader.name();
    }

    public int totalAbilityLevel(){
        int totalAbilityLevel = leader.abilityLevel();
        
        for(Aspirant a:aspirants){
            totalAbilityLevel += a.abilityLevel();
        }

        return totalAbilityLevel;
    }

    public NinjaToolPackage currentToolPackage(){
        return currentToolPackage;
    }

    public TrainingGround currentTrainingGround(){
        return currentTrainingGround;
    }

    public void setToolPackage(NinjaToolPackage newToolPackage){ 
        this.currentToolPackage = newToolPackage;
    }

    public void setTrainingGround(TrainingGround newTrainingGround){
        this.currentTrainingGround = newTrainingGround;
    }

    public String toString(){
        // TODO
        return "";
    }
}
