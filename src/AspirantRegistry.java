import java.security.Key;
import java.util.Hashtable;
import java.util.Iterator;

public class AspirantRegistry implements Iterable<Aspirant> {

    private Hashtable<Key, Aspirant> listOfAspirants; // falta tipo de la llave y quien la asigna

    // falta constructor

    @Override
    public AspirantIterator iterator(){

    }

    public int size(){ 
        return listOfAspirants.size();
    }

    public void addAspirant(Aspirant newAspirant){
        // falta definir la llave
    } 
}
