import java.util.Hashtable;
import java.util.Set;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.Iterator;

public class NinjaAcademy {

    private static GroundFactory groundFactory = new GroundFactory();
    private static AspirantFactory aspirantFactory = new AspirantFactory();
    private static VolunteerFactory volunteerFactory = new VolunteerFactory();

    public static void main(String[] args){

        // Initialize variables and create ninjas
        
        Hashtable<Integer, Aspirant> listOfAspirants = generateAspirants();
        ArrayList<Volunteer> listOfVolunteers = generateVolunteers();

        ArrayList<Group> groupsSoFar = new ArrayList<>();
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidos a La Academia Ninja de la Aldea de las Ciencias, "
                           + "a continuacion se crearan grupos para las actividades, "
                           + "se les asignara un paquete y un campo de entrenamiento\n\n");

        int currentGroup = 1;
        
        // Groups and packages
        while(!listOfAspirants.isEmpty() && !listOfVolunteers.isEmpty()){

            System.out.println("Formando grupo " + currentGroup + "\n");

            currentGroup++;
            Volunteer leader = listOfVolunteers.remove(0);
            System.out.println("Se asigno como lider a " + leader.name() + "\n");
            
            Group newGroup = formGroup(listOfAspirants, leader);
            System.out.println("Se asignaron todos los aspirantes posibles al grupo\n\n");

            //System.out.println(showMainMenu());
            
            NinjaToolPackage newPackage = askPackage(sc);
            newGroup.setToolPackage(newPackage);
            System.out.println("Se asigno el paquete elegido al equipo");

            TrainingGround newGround = assignGround(newGroup.totalAbilityLevel());
            newGroup.setTrainingGround(newGround);
            System.out.println("Se asigno un campo de entrenamiento al grupo");

            groupsSoFar.add(newGroup);
        }

        // Case when there's aspirants without a group
        if(!listOfAspirants.isEmpty() && listOfVolunteers.isEmpty()){
            System.out.println(apologize(listOfAspirants));
        }

        // Shows results for every group
        System.out.println(showResults(groupsSoFar));
        
    }

    private static Group formGroup(Hashtable<Integer, Aspirant> listOfAspirants, Volunteer leader){
        Group newGroup = new Group(leader);

        int aspirantsLeft = 1;

        if(leader.rank() == Rank.CHUNIN)
            aspirantsLeft = 2;
        else if(leader.rank() == Rank.JONIN)
            aspirantsLeft = 3;

        Set<Integer> ids = listOfAspirants.keySet();
        Iterator<Integer> idsIterator = ids.iterator();

        while(aspirantsLeft > 0 && idsIterator.hasNext()){
            int currentID = idsIterator.next();

            Aspirant currentAspirant = listOfAspirants.remove(currentID);

            newGroup.addAspirant(currentAspirant);
            aspirantsLeft--;
        }

        return newGroup;
    }

    private static NinjaToolPackage askPackage(Scanner sc){
        System.out.println("Queda por determinar el paquete que se le dara al equipo, "
                           + "las opciones son:\n\n"
                           + "1. Paquete Basico\n"
                           + "2. Paquete Avanzado\n"
                           + "3. Paquete Tactico\n"
                           + "4. Paquete Personalizado\n");

        System.out.print("Eliga el paquete que se asignara, "
                           + "usando el numero a la izquierda del nombre: ");

        boolean packageChosen = false;
        int chosen = 0;

        NinjaToolDirector director;
        PackageBuilder builder = null;

        while(!packageChosen){
            chosen = sc.nextInt();

            switch(chosen){
            case 1:
                System.out.println("Se eligio el Paquete Basico\n");
                builder = new BasicPackageBuilder();
                packageChosen = true;
                break;
            case 2:
                System.out.println("Se eligio el Paquete Avanzado\n");
                builder = new TacticalPackageBuilder();
                packageChosen = true;
                break;
            case 3:
                System.out.println("Se eligio el Paquete Tactico\n");
                builder = new AdvancedPackageBuilder();
                packageChosen = true;
                break;
            case 4:
                System.out.println("Se eligio el Paquete Personalizado\n");
                builder = createCustomPackage(sc);
                packageChosen = true;
                break;
            default:

                System.out.println("La eleccion no es una respuesta valida, eliga nuevamente");
                break;
            }
        }

        director = new NinjaToolDirector(builder);

        return director.construct();
    }

    private static PackageBuilder createCustomPackage(Scanner sc){
        CustomPackageBuilder packageBuilder = new CustomPackageBuilder();

        System.out.println("Para el paquete personalizado se debe elegir la "
                           + "cantidad de cada herramienta\n\n");

        System.out.print("Eliga la cantidad de kunais para el paquete: ");
        int amount = sc.nextInt();
        packageBuilder.addNumOfKunais(amount);

        System.out.print("Eliga la cantidad de shurikens para el paquete: ");
        amount = sc.nextInt();
        packageBuilder.addNumOfShurikens(amount);

        System.out.print("Eliga la cantidad de papeles bomba para el paquete: ");
        amount = sc.nextInt();
        packageBuilder.addNumOfExplosiveTags(amount);

        System.out.print("Eliga la cantidad de bombas de humo para el paquete: ");
        amount = sc.nextInt();
        packageBuilder.addNumOfSmokeBombs(amount);

        System.out.print("Eliga la cantidad de botiquines para el paquete: ");
        amount = sc.nextInt();
        packageBuilder.addNumOfMedKits(amount);

        return packageBuilder;
    }

    private static TrainingGround assignGround(int totalAbilityLevel){
        return groundFactory.createTrainingGround(totalAbilityLevel);
    }

    private static String apologize(Hashtable<Integer, Aspirant> listOfAspirants){
        String s = "No fue posible asignarle un grupo a los siguiente aspirantes:\n";

        Collection<Aspirant> aspirantsLeft = listOfAspirants.values();
        for(Aspirant a: aspirantsLeft){
            s += "- " + a.name() + "\n";
        }

        return s + "Esperamos puedan regresar en otro momento";
    }

    private static String showResults(ArrayList<Group> groups){
        String s = "Los resultados de los equipos fueron los siguientes:\n\n";
        
        for(Group g: groups){
            s += g.toString() + "\n\n";
        }

        return s;
    }


    // LEFT TO CODE
    private static String showMainMenu(){
        return "";
    }

    private static Hashtable<Integer, Aspirant> generateAspirants(){
        Hashtable<Integer, Aspirant> listOfAspirants = new Hashtable<>();

        // TODO

        return listOfAspirants;
    }

    private static ArrayList<Volunteer> generateVolunteers(){
        ArrayList<Volunteer> listOfVolunteers = new ArrayList<>();

        // TODO

        return listOfVolunteers;
    }
}
