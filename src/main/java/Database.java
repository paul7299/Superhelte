import java.util.ArrayList;

public class Database {

    /*
    ArrayList<Superhero> superheroArrayList = new ArrayList<>();
    Superhero superhelt1 = new Superhero();
    Superhero superhlt2 ....
    superheroArrayList.add(superhelt1)
    superheroArrayList.add(superhelt2) ....

    for (Superhelt p : superheroArrayList) {
    sout(p.getNavn(), etc ...)
    }
     */



    //Opretter superheroArray
    private Superhero[] superheroArray = new Superhero[5]; // private???
    int n = 0;


    public void tilfoejSuperhelt(String aliasNavn, String superhelteNavn, int oprindelsesÅr, boolean erMenneske,
                                 String superkraft, double styrke) {

            // opretter superhero objekt "superhelt"
            Superhero superhelt = new Superhero(aliasNavn, superhelteNavn, oprindelsesÅr, erMenneske, superkraft, styrke);
            // sætter superhelt ind på superheroArray's plads n
            superheroArray[n] = superhelt;

            n++;

    }

    public Superhero[] getSuperheroArray() {
        return superheroArray;
    }


}
