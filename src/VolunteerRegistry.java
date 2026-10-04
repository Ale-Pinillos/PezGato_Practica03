import java.util.ArrayList;

public class VolunteerRegistry implements Iterable<Volunteer> {
    
    private ArrayList<Volunteer> listOfVolunteers;

    // falta constructor

    @Override
    public VolunteerIterator iterator(){

    }

    public int size() {
        return listOfVolunteers.size();
    }

    public void addVolunteer(Volunteer newVolunteer){
        listOfVolunteers.add(newVolunteer);
    }
}
