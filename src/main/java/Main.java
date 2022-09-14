import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Database superheroDatabase = new Database();
        Scanner sc = new Scanner(System.in);
        int brugerValg;

        do {
            //

            System.out.println("-- Velkommen til SUPERHERO UNIVERSET --\n");

            //
            System.out.println("Du har to muligheder: \n" +
                    "\t1. Opret en superhelt\n" +
                    "\t2. Udskriv alle superhelter\n" +
                    "\t3. Søg efter en superhelt\n"+
                    "\t9. Afslut program" +
                    "\n----\n");

            brugerValg = sc.nextInt();
            sc.nextLine();

            if (brugerValg == 1) {
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
            // MENU PT. 3 - printer alle oprettede superhelte
            else if (brugerValg == 2) {

                for (Superhero liste : superheroDatabase.getSuperheroArrayList()) {
                    System.out.println(liste);
                }
            }

            // MENU PT. 3
            else if (brugerValg == 3) {
                System.out.println("\tIndtast navn du vil søge efter: ");
                String søgeNavn = sc.nextLine();
                Superhero s = superheroDatabase.findSuperhelt(søgeNavn);
                System.out.println("\t Vi har fundet din superhelt: \n"
                        + s);
                if (s == null) {
                    System.out.println("\tKunne ikke finde superhelten. ");
                }

            }
            else {
                System.exit(0);
            }
        } while (brugerValg != 9);
    }
}

