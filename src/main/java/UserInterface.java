import java.util.Scanner;

public class UserInterface {

    // Objektet UserInterface's attribut: (kun databasen)
    private Database superheroDatabase;
    Scanner sc;

    public UserInterface() {
        superheroDatabase = new Database();
        sc = new Scanner(System.in);
    }

    public void startProgram() {
        int brugerValg = 0;

        while (brugerValg != 9) {
            System.out.println("-- Velkommen til SUPERHERO UNIVERSET --\n");
            System.out.println("Du har to muligheder: \n" +
                    "\t1. Opret en superhelt\n" +
                    "\t2. Udskriv alle superhelter\n" +
                    "\t3. Søg efter en superhelt\n" +
                    "\t4. Rediger superhelt.\n" +
                    "\t5. Slet superhero.\n" +
                    "\t9. Afslut program" +
                    "\n----\n");

            brugerValg = readInt();

            /*
            try {
                checkInteger(brugerValg);
            }
            catch (IllegalArgumentException){
                System.out.println(e.get);
            } */

            sc.nextLine();
            menu(brugerValg);
        }
    }

    // switch menu
    public void menu(int brugerValg) {
        switch (brugerValg) {
            case 1: menuTilfoejSuperhelt();
            break;
            case 2: menuVisSuperhelter();
            break;
            case 3: menuSoegSuperhelt();
            break;
            case 4: menuRedigerSuperhelt();
            break;
            case 5: menuSletSuperhelt();
        }
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
        boolean erMenneske = scanJaNejTilBoolean();

        System.out.print("\tIndtast superheltens oprindelsesår: ");
        int oprindelsesÅr = readInt();

        System.out.print("\tHvilken styrke har superhelten? ");
        double styrke = readDouble();


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

    public void menuRedigerSuperhelt() {

        // Find den superhero du vil redigere
        System.out.println("\tSøge efter superhelt du vil redigere: ");
        String søgeNavn = sc.nextLine();

        Superhero editingSuperhelt = superheroDatabase.findSuperhelt(søgeNavn);

        // editingSuperhelt er i dette tilfælde en "pointer" - og retter faktisk direkte i den originale superhelt

        if (editingSuperhelt != null) {
            System.out.println("\t Vi har fundet din superhelt: \n"
                    + editingSuperhelt);
        } else if (editingSuperhelt == null) {
            System.out.println("\tKunne ikke finde superhelten. \n");
        }

        // System.out.println("Vil du redigere denne superhero? Indtast ja/nej");

        // Indtast nye data
        System.out.println("Indtast ny superhelt data (TRYK ENTER HVIS DET IKKE SKAL REDIGERES).\n");

        // Nyt alias navn
        System.out.println("Superheltens nuværende alias navn: " + editingSuperhelt.getAliasNavn());
        System.out.print("\tIndtast NYT alias navn: ");
        String aliasNavnNy = sc.nextLine();
        if (!aliasNavnNy.isEmpty()) {
            editingSuperhelt.setAliasNavn(aliasNavnNy);
        }

        // Nyt superhelt navn
        System.out.println("Superheltens nuværende superheltnavn: " + editingSuperhelt.getSuperhelteNavn());
        System.out.print("\tNYT superheltenavn: ");
        String superhelteNavnNy = sc.nextLine();
        if (!superhelteNavnNy.isEmpty()) {
            editingSuperhelt.setSuperhelteNavn(superhelteNavnNy);
        }

        // Ny superkraft
        System.out.println("Superheltens nuværende superkraft: " + editingSuperhelt.getSuperkraft());
        System.out.print("\tNY superkraft: ");
        String superkraftNy = sc.nextLine();
        if (!superkraftNy.isEmpty()) {
            editingSuperhelt.setSuperkraft(superkraftNy);
        }

        // Ny menneske-status
        System.out.print("Er superhelten et menneske inden redigering: ");
        if (editingSuperhelt.getErMenneske() == true) {
            System.out.println("Ja. ");
        } else if (editingSuperhelt.getErMenneske() == false) {
            System.out.println("Nej. ");
        }

        System.out.print("\tSkal superhelten være et menneske? (svar ja eller nej): ");
        boolean erMenneskeNy = scanJaNejTilBoolean();

        sc.nextLine();

        // Nyt oprindelsesår
        System.out.println("Superheltens nuværende oprindelsesår: " + editingSuperhelt.getOprindelsesÅr());
        System.out.print("\tNYT oprindelsesår: ");
        String oprindelsesÅrNy = sc.nextLine();
        if (!oprindelsesÅrNy.isEmpty()) {
            editingSuperhelt.setOprindelsesÅr(Integer.parseInt(oprindelsesÅrNy));
        }

        // Ny styrke
        System.out.println("Superheltens nuværende styrke: " + editingSuperhelt.getStyrke());
        System.out.print("\tIndtast ny styrke: ");
        String styrkeNy = sc.nextLine();
        if (!styrkeNy.isEmpty()) {
            editingSuperhelt.setStyrke(Integer.parseInt(styrkeNy));
        }

    }


    public void menuSletSuperhelt() {
        // Find den superhero du vil slette
        System.out.println("\tSøge efter superhelt du vil SLETTE: ");
        String søgeNavn = sc.nextLine();

        Superhero deletingSuperhelt = superheroDatabase.findSuperhelt(søgeNavn);

        if (deletingSuperhelt != null) {
            System.out.println("\t Vi har fundet din superhelt: \n"
                    + deletingSuperhelt);
        } else if (deletingSuperhelt == null) {
            System.out.println("\tKunne ikke finde superhelten. \n");
        }

        System.out.println("\tVil du slette denne superhero? Indtast ja / nej. ");
        String svar = sc.nextLine();

        // Spørg om du vil slette den fundne hero
        if (svar.equalsIgnoreCase("ja")) {
            int n;
            n = superheroDatabase.getSuperheroArrayList().indexOf(deletingSuperhelt);
            superheroDatabase.getSuperheroArrayList().remove(n);

        } else if (svar.equalsIgnoreCase("nej")) {
        }

    }



    public int readInt() {
        while (!sc.hasNextInt()) {
            String text = sc.next();
            System.out.println("\t*** Du må ikke indtaste: \"" + text + "\". Det skal være et heltal.");
        } return sc.nextInt();
    }

    public double readDouble() {
        while (!sc.hasNextDouble()) {
            String text = sc.next();
            System.out.println("\t*** Du må ikke indtaste " + text + ". Det skal være et tal.");
        } return sc.nextDouble();
    }


    public boolean scanJaNejTilBoolean() {
        String text = sc.next();
        boolean b = false;
        if (text.equalsIgnoreCase("ja")) {
            b = true;
        } else if (text.equalsIgnoreCase("nej")){
            b = false;
        } else {
            System.out.println("*** Forkert indtasting! Du skal indtaste JA eller NEJ.");
            scanJaNejTilBoolean();
        } return b;
    }


/*
    String input;
    boolean wrongInput = true;
    while (wrongInput) {
        try {
            input = sc.nextLine();
            int oprindelsesÅr = Integer.parseInt(input);
            wrongInput = false;
        } catch (NumberFormatException e) {
            System.out.println("Du SKAL indtaste et tal");
        }
    } */

    /*
    public void checkInteger(int brugerValg) {
        if (brugerValg > 9) {
            throw new IllegalArgumentException("*** Kun tal mindre end 9.");
        }
    } */
}
