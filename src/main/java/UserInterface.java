import java.util.Scanner;

public class UserInterface {

    private Database superheroDatabase;
    Scanner sc = new Scanner(System.in);

    public UserInterface() {
        superheroDatabase = new Database();
    }

    public void startProgram() {
        int brugerValg = 0;

        while (brugerValg != 9) {
            System.out.println("-- Velkommen til SUPERHERO UNIVERSET --\n");
            System.out.println("Du har to muligheder: \n" +
                "\t1. Opret en superhelt\n" +
                "\t2. Udskriv alle superhelter\n" +
                "\t3. Søg efter en superhelt\n" +
                "\t9. Afslut program" +
                "\n----\n");

        brugerValg = sc.nextInt();
        sc.nextLine();
        menu(brugerValg);
        }
    }

    public void menu(int brugerValg) {
        if (brugerValg == 1)
            menuTilfoejSuperhelt();
        else if (brugerValg == 2)
            menuVisSuperhelter();
        else if (brugerValg == 3)
            menuSoegSuperhelt();

    }

    public void menuTilfoejSuperhelt() {
        //
        System.out.print("\tIndtast superheltens alias navn: ");
        String aliasNavn = sc.nextLine();

        System.out.print("\tIndtast superheltens superheltenavn: ");
        String superhelteNavn = sc.nextLine();

        System.out.print("\tHvilken superkraft har superhelten? ");
        String superkraft = sc.nextLine();

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

    }

    public void menuVisSuperhelter() {
        for (Superhero liste : superheroDatabase.getSuperheroArrayList()) {
            System.out.println(liste);
        }
    }

    public void menuSoegSuperhelt() {
        System.out.println("\tIndtast navn du vil søge efter: ");
        String søgeNavn = sc.nextLine();
        Superhero s = superheroDatabase.findSuperhelt(søgeNavn);
        System.out.println("\t Vi har fundet din superhelt: \n"
                + s);
        if (s == null) {
            System.out.println("\tKunne ikke finde superhelten. ");
        }
    }
}
