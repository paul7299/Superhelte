public class Database {


    Superhero[] superheroArray = new Superhero[5]; // private???
    int n = 0;


    public void tilfoejSuperhelt(String aliasNavn, String superhelteNavn, int oprindelsesÅr, boolean erMenneske,
                                 String superkraft, double styrke) {
        do {

            Superhero superhelt = new Superhero(aliasNavn, superhelteNavn, oprindelsesÅr, erMenneske, superkraft, styrke);

            superheroArray[n] = superhelt;
            n++;
        } while (n < superheroArray.length);

    }


}
