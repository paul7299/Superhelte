import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Database superheroDatabase = new Database();


        System.out.println("-- Velkommen til SUPERHERO UNIVERSET --\n");

        System.out.println("Du har to muligheder: \n" +
                "\t1. Opret en superhelt\n"+
                "\t9. Afslut program");

        Scanner sc = new Scanner(System.in);
        System.out.println("\tIndtast superheltens alias navn:\n");
        String aliasNavn = sc.nextLine();

        System.out.println("\tIndtast superheltens superheltenavn:\n");
        String superhelteNavn = sc.nextLine();

        System.out.println("\tIndtast superheltens oprindelsesår:\n");
        int oprindelsesÅr = sc.nextInt();

        System.out.println("Er superhelten et menneske? Svar 'true' for JA eller 'false' for NEJ");
        boolean erMenneske = sc.nextBoolean();

        System.out.println("Hvilken superkraft har superhelten?");
        String superkraft = sc.nextLine();

        System.out.println("Hvilken styrke har superhelten?");
        double styrke = sc.nextDouble();

        superheroDatabase.tilfoejSuperhelt(aliasNavn, superhelteNavn, oprindelsesÅr, erMenneske, superkraft, styrke);


        for (int i = 0; i < superheroDatabase.superheroArray.length; i++) {
            System.out.println("Superheltens aliasnavn: ");
            System.out.println(superheroDatabase.superheroArray[i].getAliasNavn() + "\n");
            System.out.println("Superheltens superheltenavn: ");
            System.out.println(superheroDatabase.superheroArray[i].getSuperhelteNavn() + "\n");
            System.out.println("Superheltens oprindelsesår: ");
            System.out.println(superheroDatabase.superheroArray[i].getOprindelsesÅr() + "\n");
            System.out.println("Er superhelten et menneske?: ");
            System.out.println(superheroDatabase.superheroArray[i].getErMenneske() + "\n");
            System.out.println("Superheltens superkraft: ");
            System.out.println(superheroDatabase.superheroArray[i].getSuperkraft() + "\n");
            System.out.println("Superheltens styrke: ");
            System.out.println(superheroDatabase.superheroArray[i].getStyrke() + "\n");
        }
    }
}
