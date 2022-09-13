import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //
        Database superheroDatabase = new Database();
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Velkommen til SUPERHERO UNIVERSET --\n");

        //
        int brugerValg;
        System.out.println("Du har to muligheder: \n" +
                "\t1. Opret en superhelt\n"+
                "\t9. Afslut program" +
                "\n----\n");
        brugerValg = sc.nextInt();

        /* System.exit(0) */
        //
        System.out.print("\tIndtast superheltens alias navn: ");
        String aliasNavn = sc.next();

        System.out.print("\tIndtast superheltens superheltenavn: ");
        String superhelteNavn = sc.next();

        System.out.print("\tHvilken superkraft har superhelten? ");
        String superkraft = sc.next();

        System.out.print("\tEr superhelten et menneske? Svar ja eller nej: ");
        boolean erMenneske = false;
        String svar = sc.next();
        if (svar.equalsIgnoreCase("ja")) {
            erMenneske = true;
        } else if (svar.equalsIgnoreCase("nej")) {
            erMenneske = false;
        }

        System.out.print("\tIndtast superheltens oprindelsesår: ");
        int oprindelsesÅr = sc.nextInt();

        System.out.print("\tHvilken styrke har superhelten? ");
        double styrke = sc.nextDouble();


        // Kigger ind i min database "superheroDatabase", bruger min setmetode "tilfoejSuperhelt" med inputs
        superheroDatabase.tilfoejSuperhelt(aliasNavn, superhelteNavn, oprindelsesÅr, erMenneske, superkraft, styrke);


        /* for (int i = 0; i < superheroDatabase.getSuperheroArray()[i].length; i++) {
            System.out.println("Superheltens aliasnavn: ");
            System.out.println(superheroDatabase.getSuperheroArray()[i].getAliasNavn() + "\n");
            System.out.println("Superheltens superheltenavn: ");
            System.out.println(superheroDatabase.getSuperheroArray()[i].getSuperhelteNavn() + "\n");
            System.out.println("Superheltens oprindelsesår: ");
            System.out.println(superheroDatabase.getSuperheroArray()[i].getOprindelsesÅr() + "\n");
            System.out.println("Er superhelten et menneske?: ");
            System.out.println(superheroDatabase.getSuperheroArray()[i].getErMenneske() + "\n");
            System.out.println("Superheltens superkraft: ");
            System.out.println(superheroDatabase.getSuperheroArray()[i].getSuperkraft() + "\n");
            System.out.println("Superheltens styrke: ");
            System.out.println(superheroDatabase.getSuperheroArray()[i].getStyrke() + "\n");
        }
        */

        //
        for (Superhero liste : superheroDatabase.getSuperheroArray()) {
            System.out.println(liste);
        }

    }
}
