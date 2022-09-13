public class Superhero {

    // Definition på superhero, konstruktører etc + set metoder for superheroes

    private String aliasNavn;
    private String superhelteNavn;
    private int oprindelsesÅr;
    private boolean erMenneske;
    private String superkraft;
    private double styrke;


    public Superhero(String aliasNavn, String superhelteNavn, int oprindelsesÅr, boolean menneske, String superkraft, double styrke) {
        this.aliasNavn = aliasNavn;
        this.superhelteNavn = superhelteNavn;
        this.oprindelsesÅr = oprindelsesÅr;
        this.erMenneske = erMenneske;
        this.superkraft = superkraft;
        this.styrke = styrke;
    }

    public void setAliasNavn(String aliasNavn) {
        this.aliasNavn = aliasNavn;
    }

    public void setSuperhelteNavn(String superhelteNavn) {
        this.superhelteNavn = superhelteNavn;
    }

    public void setMenneske(boolean menneske) {
        this.erMenneske = menneske;
    }

    public void setSuperkraft(String superkraft) {
        this.superkraft = superkraft;
    }

    public void setOprindelsesÅr(int oprindelsesÅr) {
        this.oprindelsesÅr = oprindelsesÅr;
    }

    public void setStyrke(double styrke) {
        this.styrke = styrke;
    }


    public String getAliasNavn() {
        return aliasNavn;
    }

    public String getSuperhelteNavn() {
        return superhelteNavn;
    }

    public int getOprindelsesÅr() {
        return oprindelsesÅr;
    }

    public boolean getErMenneske() {
        return erMenneske;
    }

    public String getSuperkraft() {
        return superkraft;
    }

    public double getStyrke() {
        return styrke;
    }

    public String toString() {
        return ("----\n" +
                "\t- Alias: " + aliasNavn + "\n"+
                "\t- Superheltenavn: " + superhelteNavn + "\n" +
                "\t- Oprindelsesår: " + oprindelsesÅr + "\n" +
                "\t- Er menneske: " + erMenneske + "\n" +
                "\t- Superkraft: " + superkraft + "\n" +
                "\t- Styrke: " + styrke + "\n" +
                "----\n");
    }

}
