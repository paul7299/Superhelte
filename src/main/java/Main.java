import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int brugerValg;

        do {
            //
            Database superheroDatabase = new Database();
            Scanner sc = new Scanner(System.in);

            System.out.println("-- Velkommen til SUPERHERO UNIVERSET --\n");

            //
            System.out.println("Du har to muligheder: \n" +
                    "\t1. Opret en superhelt\n" +
                    "\t2. Udskriv alle superhelter\n" +
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

                for (Superhero liste : superheroDatabase.getSuperheroArray()) {
                    System.out.println(liste);
                }

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
                // Menupt 2 - print alle superhelte
            } else if (brugerValg == 2) {

                // Virker ikke her:
                /*
                for (Superhero liste : superheroDatabase.getSuperheroArray()) {
                    System.out.println(liste);
                }*/
            } else {
                System.exit(0);
            }
        } while (brugerValg != 9);
    }
}
