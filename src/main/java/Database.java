public class Database {

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
