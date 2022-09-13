import java.util.ArrayList;

public class Database {


    // Opretter superheroArrayLIST
    private ArrayList<Superhero> superheroArrayList = new ArrayList<>();


    // Opretter superheroArray
    private Superhero[] superheroArray = new Superhero[5];
    int n = 0;


    // Opretter metode som opretter superhelt og lægger i arrayList
    public void tilfoejSuperhelt(String aliasNavn, String superhelteNavn, int oprindelsesÅr, boolean erMenneske,
                                 String superkraft, double styrke) {

            Superhero superhelt = new Superhero(aliasNavn, superhelteNavn, oprindelsesÅr, erMenneske, superkraft, styrke);
            superheroArrayList.add(superhelt);
    }

    public ArrayList<Superhero> getSuperheroArrayList() {
        return superheroArrayList;
    }

}


    /*

    Superhero superhelt1 = new Superhero();
    Superhero superhlt2 ....
    superheroArrayList.add(superhelt1)
    superheroArrayList.add(superhelt2) ....

    for (Superhelt p : superheroArrayList) {
    sout(p.getNavn(), etc ...)
    }
     */