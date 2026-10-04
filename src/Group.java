import java.util.ArrayList;

public class Group {

    private Volunteer leader;
    private ArrayList<Aspirant> aspirants;
    private NinjaToolPackage currentToolPackage;
    private TrainingGround currentTrainingGround;

    // falta constructor

    public String addAspirant(Aspirant newAspirant){
        
    }

    public int totalAbilityLevel(){

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

    }
}
