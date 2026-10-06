import java.util.ArrayList;

public class VolunteerRegistry implements Iterable<Volunteer> {
    
    private ArrayList<Volunteer> listOfVolunteers;

    // falta constructor
    public VolunteerRegistry(){
        listOfVolunteers = new ArrayList<>();
    }

    @Override
    public VolunteerIterator iterator(){
        return new VolunteerIterator(this.listOfVolunteers);
    }

    public int size() {
        return listOfVolunteers.size();
    }

    public void addVolunteer(Volunteer newVolunteer){
        listOfVolunteers.add(newVolunteer);
    }
}
