import java.util.ArrayList;

public class Database {


    // Opretter superheroArrayLIST
    private ArrayList<Superhero> superheroArrayList = new ArrayList<>();
    private ArrayList<Superhero> soegeResultat = new ArrayList<>();


    // Opretter superheroArray
    private Superhero[] superheroArray = new Superhero[5];
    int n = 0;


    // Opretter metode som opretter superhelt og lægger i arrayList
    public void tilfoejSuperhelt(String aliasNavn, String superhelteNavn, int oprindelsesÅr, boolean erMenneske,
                                 String superkraft, double styrke) {

            Superhero superhelt = new Superhero(aliasNavn, superhelteNavn, oprindelsesÅr, erMenneske, superkraft, styrke);
            superheroArrayList.add(superhelt);
    }

    // Omdøb "hentAllePersoner"
    public ArrayList<Superhero> getSuperheroArrayList() {
        return superheroArrayList;
    }

    public Superhero findSuperhelt(String søgeNavn) {
        for (Superhero n : superheroArrayList) {
            if (n.getSuperhelteNavn().contains(søgeNavn)) {
                return n;
            }
            else if (n.getSuperhelteNavn().equalsIgnoreCase(søgeNavn)) {
                return n;
            }
        } return null;

    }


}